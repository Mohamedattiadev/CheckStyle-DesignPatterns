///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2025 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.sizes;

import java.util.ArrayDeque;
import java.util.Deque;

import com.puppycrawl.tools.checkstyle.FileStatefulCheck;
import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;
import com.puppycrawl.tools.checkstyle.utils.TokenUtil;

/**
 * <div>
 * Restricts the number of executable statements to a specified limit.
 * </div>
 * <!-- All documentation remains the same -->
 * @since 3.2
 */
@FileStatefulCheck
public final class ExecutableStatementCountCheck
    extends AbstractCheck {

    /**
     * A key is pointing to the warning message text in "messages.properties"
     * file.
     */
    public static final String MSG_KEY = "executableStatementCount";

    /** Default threshold. */
    private static final int DEFAULT_MAX = 30;

    /** Specify the maximum threshold allowed. */
    private int max = DEFAULT_MAX;

    /** The worker object that performs the counting for a single file. */
    private StatementCounter statementCounter;

    @Override
    public int[] getDefaultTokens() {
        return new int[] {
            TokenTypes.CTOR_DEF,
            TokenTypes.METHOD_DEF,
            TokenTypes.INSTANCE_INIT,
            TokenTypes.STATIC_INIT,
            TokenTypes.SLIST,
            TokenTypes.COMPACT_CTOR_DEF,
            TokenTypes.LAMBDA,
        };
    }

    @Override
    public int[] getRequiredTokens() {
        return new int[] {TokenTypes.SLIST};
    }

    @Override
    public int[] getAcceptableTokens() {
        return getDefaultTokens();
    }

    /**
     * Setter to specify the maximum threshold allowed.
     *
     * @param max the maximum threshold.
     * @since 3.2
     */
    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void beginTree(DetailAST rootAST) {
        // Create a new worker for each file
        statementCounter = new StatementCounter(this, max);
        statementCounter.beginTree();
    }

    @Override
    public void visitToken(DetailAST ast) {
        // Delegate the work to the counter
        statementCounter.visitToken(ast);
    }

    @Override
    public void leaveToken(DetailAST ast) {
        // Delegate the work to the counter
        statementCounter.leaveToken(ast);
    }

    /**
     * The worker class that contains the logic for counting statements.
     * An instance of this class is created for each file being processed.
     */
    private static final class StatementCounter {

        /** The check that owns this counter, used for logging. */
        private final AbstractCheck check;

        /** The maximum number of statements allowed. */
        private final int max;

        /** Stack of method contexts. */
        private final Deque<Context> contextStack = new ArrayDeque<>();

        /** Current method context. */
        private Context context;

        /**
         * Creates new StatementCounter.
         *
         * @param check The parent check to use for logging.
         * @param max The maximum number of statements allowed.
         */
        StatementCounter(AbstractCheck check, int max) {
            this.check = check;
            this.max = max;
        }

        /**
         * Initializes the counter for a new file tree.
         */
        public void beginTree() {
            context = new Context(null);
            contextStack.clear();
        }

        /**
         * Visits a token in the AST.
         *
         * @param ast the token to visit.
         */
        public void visitToken(DetailAST ast) {
            if (isContainerNode(ast)) {
                visitContainerNode(ast);
            }
            else if (TokenUtil.isOfType(ast, TokenTypes.SLIST)) {
                visitSlist(ast);
            }
            else {
                throw new IllegalStateException("Unexpected token: " + ast.toString());
            }
        }

        /**
         * Leaves a token in the AST.
         *
         * @param ast the token to leave.
         */
        public void leaveToken(DetailAST ast) {
            if (isContainerNode(ast)) {
                leaveContainerNode(ast);
            }
            else if (!TokenUtil.isOfType(ast, TokenTypes.SLIST)) {
                throw new IllegalStateException("Unexpected token: " + ast.toString());
            }
        }

        /**
         * Process the start of the container node.
         *
         * @param ast the token representing the container node.
         */
        private void visitContainerNode(DetailAST ast) {
            contextStack.push(context);
            context = new Context(ast);
        }

        /**
         * Process the end of a container node.
         *
         * @param ast the token representing the container node.
         */
        private void leaveContainerNode(DetailAST ast) {
            final int count = context.getCount();
            if (count > max) {
                check.log(ast, MSG_KEY, count, max);
            }
            context = contextStack.pop();
        }

        /**
         * Process the end of a statement list.
         *
         * @param ast the token representing the statement list.
         */
        private void visitSlist(DetailAST ast) {
            final DetailAST contextAST = context.getAST();
            DetailAST parent = ast;
            while (parent != null && !isContainerNode(parent)) {
                parent = parent.getParent();
            }
            if (parent == contextAST) {
                // Each statement is a pair of EXPR and SEMI, so we divide by 2.
                context.addCount(ast.getChildCount(TokenTypes.EXPR));
            }
        }

        /**
         * Check if the node is a container type.
         *
         * @param node AST node we are checking.
         * @return true if node is a container type.
         */
        private static boolean isContainerNode(DetailAST node) {
            return TokenUtil.isOfType(node, TokenTypes.METHOD_DEF,
                TokenTypes.LAMBDA, TokenTypes.CTOR_DEF, TokenTypes.INSTANCE_INIT,
                TokenTypes.STATIC_INIT, TokenTypes.COMPACT_CTOR_DEF);
        }

        /**
         * Class to encapsulate counting information about one member.
         */
        private static final class Context {

            /** Member AST node. */
            private final DetailAST ast;
            /** Counter for context elements. */
            private int count;

            /**
             * Creates new member context.
             *
             * @param ast member AST node.
             */
            private Context(DetailAST ast) {
                this.ast = ast;
            }

            /**
             * Increase count.
             *
             * @param addition the count increment.
             */
            public void addCount(int addition) {
                count += addition;
            }

            /**
             * Gets the member AST node.
             *
             * @return the member AST node.
             */
            public DetailAST getAST() {
                return ast;
            }

            /**
             * Gets the count.
             *
             * @return the count.
             */
            public int getCount() {
                return count;
            }
        }
    }
}

