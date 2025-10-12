// Generated from com/puppycrawl/tools/checkstyle/grammar/java/JavaLanguageParser.g4 by ANTLR 4.13.2
package com.puppycrawl.tools.checkstyle.grammar.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPILATION_UNIT=1, PLACEHOLDER1=2, NULL_TREE_LOOKAHEAD=3, BLOCK=4, MODIFIERS=5, 
		OBJBLOCK=6, SLIST=7, CTOR_DEF=8, METHOD_DEF=9, VARIABLE_DEF=10, INSTANCE_INIT=11, 
		STATIC_INIT=12, TYPE=13, CLASS_DEF=14, INTERFACE_DEF=15, PACKAGE_DEF=16, 
		ARRAY_DECLARATOR=17, EXTENDS_CLAUSE=18, IMPLEMENTS_CLAUSE=19, PARAMETERS=20, 
		PARAMETER_DEF=21, LABELED_STAT=22, TYPECAST=23, INDEX_OP=24, POST_INC=25, 
		POST_DEC=26, METHOD_CALL=27, EXPR=28, ARRAY_INIT=29, IMPORT=30, UNARY_MINUS=31, 
		UNARY_PLUS=32, CASE_GROUP=33, ELIST=34, FOR_INIT=35, FOR_CONDITION=36, 
		FOR_ITERATOR=37, EMPTY_STAT=38, FINAL=39, ABSTRACT=40, STRICTFP=41, SUPER_CTOR_CALL=42, 
		CTOR_CALL=43, LITERAL_PACKAGE=44, SEMI=45, LITERAL_IMPORT=46, LBRACK=47, 
		RBRACK=48, LITERAL_VOID=49, LITERAL_BOOLEAN=50, LITERAL_BYTE=51, LITERAL_CHAR=52, 
		LITERAL_SHORT=53, LITERAL_INT=54, LITERAL_FLOAT=55, LITERAL_LONG=56, LITERAL_DOUBLE=57, 
		IDENT=58, DOT=59, STAR=60, LITERAL_PRIVATE=61, LITERAL_PUBLIC=62, LITERAL_PROTECTED=63, 
		LITERAL_STATIC=64, LITERAL_TRANSIENT=65, LITERAL_NATIVE=66, LITERAL_SYNCHRONIZED=67, 
		LITERAL_VOLATILE=68, LITERAL_CLASS=69, LITERAL_EXTENDS=70, LITERAL_INTERFACE=71, 
		LCURLY=72, RCURLY=73, COMMA=74, LITERAL_IMPLEMENTS=75, LPAREN=76, RPAREN=77, 
		LITERAL_THIS=78, LITERAL_SUPER=79, ASSIGN=80, LITERAL_THROWS=81, COLON=82, 
		LITERAL_IF=83, LITERAL_WHILE=84, LITERAL_DO=85, LITERAL_BREAK=86, LITERAL_CONTINUE=87, 
		LITERAL_RETURN=88, LITERAL_SWITCH=89, LITERAL_THROW=90, LITERAL_FOR=91, 
		LITERAL_ELSE=92, LITERAL_CASE=93, LITERAL_DEFAULT=94, LITERAL_TRY=95, 
		LITERAL_CATCH=96, LITERAL_FINALLY=97, PLUS_ASSIGN=98, MINUS_ASSIGN=99, 
		STAR_ASSIGN=100, DIV_ASSIGN=101, MOD_ASSIGN=102, SR_ASSIGN=103, BSR_ASSIGN=104, 
		SL_ASSIGN=105, BAND_ASSIGN=106, BXOR_ASSIGN=107, BOR_ASSIGN=108, QUESTION=109, 
		LOR=110, LAND=111, BOR=112, BXOR=113, BAND=114, NOT_EQUAL=115, EQUAL=116, 
		LT=117, GT=118, LE=119, GE=120, LITERAL_INSTANCEOF=121, SL=122, SR=123, 
		BSR=124, PLUS=125, MINUS=126, DIV=127, MOD=128, INC=129, DEC=130, BNOT=131, 
		LNOT=132, LITERAL_TRUE=133, LITERAL_FALSE=134, LITERAL_NULL=135, LITERAL_NEW=136, 
		NUM_INT=137, CHAR_LITERAL=138, STRING_LITERAL=139, NUM_FLOAT=140, NUM_LONG=141, 
		NUM_DOUBLE=142, WS=143, SINGLE_LINE_COMMENT=144, BLOCK_COMMENT_BEGIN=145, 
		ESC=146, HEX_DIGIT=147, VOCAB=148, EXPONENT=149, FLOAT_SUFFIX=150, ASSERT=151, 
		STATIC_IMPORT=152, ENUM=153, ENUM_DEF=154, ENUM_CONSTANT_DEF=155, FOR_EACH_CLAUSE=156, 
		ANNOTATION_DEF=157, ANNOTATIONS=158, ANNOTATION=159, ANNOTATION_MEMBER_VALUE_PAIR=160, 
		ANNOTATION_FIELD_DEF=161, ANNOTATION_ARRAY_INIT=162, TYPE_ARGUMENTS=163, 
		TYPE_ARGUMENT=164, TYPE_PARAMETERS=165, TYPE_PARAMETER=166, WILDCARD_TYPE=167, 
		TYPE_UPPER_BOUNDS=168, TYPE_LOWER_BOUNDS=169, AT=170, ELLIPSIS=171, GENERIC_START=172, 
		GENERIC_END=173, TYPE_EXTENSION_AND=174, DO_WHILE=175, RESOURCE_SPECIFICATION=176, 
		RESOURCES=177, RESOURCE=178, DOUBLE_COLON=179, METHOD_REF=180, LAMBDA=181, 
		BLOCK_COMMENT_END=182, COMMENT_CONTENT=183, SINGLE_LINE_COMMENT_CONTENT=184, 
		BLOCK_COMMENT_CONTENT=185, STD_ESC=186, BINARY_DIGIT=187, ID_START=188, 
		ID_PART=189, INT_LITERAL=190, LONG_LITERAL=191, FLOAT_LITERAL=192, DOUBLE_LITERAL=193, 
		HEX_FLOAT_LITERAL=194, HEX_DOUBLE_LITERAL=195, SIGNED_INTEGER=196, BINARY_EXPONENT=197, 
		PATTERN_VARIABLE_DEF=198, RECORD_DEF=199, LITERAL_RECORD=200, RECORD_COMPONENTS=201, 
		RECORD_COMPONENT_DEF=202, COMPACT_CTOR_DEF=203, TEXT_BLOCK_LITERAL_BEGIN=204, 
		TEXT_BLOCK_CONTENT=205, TEXT_BLOCK_LITERAL_END=206, LITERAL_YIELD=207, 
		SWITCH_RULE=208, LITERAL_NON_SEALED=209, LITERAL_SEALED=210, LITERAL_PERMITS=211, 
		PERMITS_CLAUSE=212, PATTERN_DEF=213, LITERAL_WHEN=214, RECORD_PATTERN_DEF=215, 
		RECORD_PATTERN_COMPONENTS=216, NOT_FOR_USAGE_1=217, NOT_FOR_USAGE_2=218, 
		NOT_FOR_USAGE_3=219, NOT_FOR_USAGE_4=220, NOT_FOR_USAGE_5=221, NOT_FOR_USAGE_6=222, 
		NOT_FOR_USAGE_7=223, LITERAL_UNDERSCORE=224, UNNAMED_PATTERN_DEF=225, 
		DECIMAL_LITERAL_LONG=226, DECIMAL_LITERAL=227, HEX_LITERAL_LONG=228, HEX_LITERAL=229, 
		OCT_LITERAL_LONG=230, OCT_LITERAL=231, BINARY_LITERAL_LONG=232, BINARY_LITERAL=233;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_types = 4, RULE_modifier = 5, RULE_variableModifier = 6, 
		RULE_classDeclaration = 7, RULE_recordDeclaration = 8, RULE_recordComponentsList = 9, 
		RULE_recordComponents = 10, RULE_recordComponent = 11, RULE_lastRecordComponent = 12, 
		RULE_recordBody = 13, RULE_recordBodyDeclaration = 14, RULE_compactConstructorDeclaration = 15, 
		RULE_classExtends = 16, RULE_implementsClause = 17, RULE_typeParameters = 18, 
		RULE_typeParameter = 19, RULE_typeUpperBounds = 20, RULE_typeBound = 21, 
		RULE_typeBoundType = 22, RULE_enumDeclaration = 23, RULE_enumBody = 24, 
		RULE_enumConstants = 25, RULE_enumConstant = 26, RULE_enumBodyDeclarations = 27, 
		RULE_interfaceDeclaration = 28, RULE_interfaceExtends = 29, RULE_classBody = 30, 
		RULE_interfaceBody = 31, RULE_classBodyDeclaration = 32, RULE_memberDeclaration = 33, 
		RULE_methodDeclaration = 34, RULE_methodBody = 35, RULE_throwsList = 36, 
		RULE_constructorDeclaration = 37, RULE_fieldDeclaration = 38, RULE_interfaceBodyDeclaration = 39, 
		RULE_interfaceMemberDeclaration = 40, RULE_interfaceMethodDeclaration = 41, 
		RULE_variableDeclarators = 42, RULE_variableDeclarator = 43, RULE_variableDeclaratorId = 44, 
		RULE_variableInitializer = 45, RULE_arrayInitializer = 46, RULE_classOrInterfaceType = 47, 
		RULE_classOrInterfaceTypeExtended = 48, RULE_typeArgument = 49, RULE_qualifiedNameList = 50, 
		RULE_formalParameters = 51, RULE_formalParameterList = 52, RULE_formalParameter = 53, 
		RULE_lastFormalParameter = 54, RULE_qualifiedName = 55, RULE_qualifiedNameExtended = 56, 
		RULE_literal = 57, RULE_integerLiteral = 58, RULE_floatLiteral = 59, RULE_textBlockLiteral = 60, 
		RULE_annotations = 61, RULE_annotation = 62, RULE_elementValuePairs = 63, 
		RULE_elementValuePair = 64, RULE_elementValue = 65, RULE_elementValueArrayInitializer = 66, 
		RULE_annotationTypeDeclaration = 67, RULE_annotationTypeBody = 68, RULE_annotationTypeElementDeclaration = 69, 
		RULE_annotationTypeElementRest = 70, RULE_annotationMethodRest = 71, RULE_annotationConstantRest = 72, 
		RULE_defaultValue = 73, RULE_constructorBlock = 74, RULE_explicitConstructorInvocation = 75, 
		RULE_block = 76, RULE_blockStatement = 77, RULE_localVariableDeclaration = 78, 
		RULE_localTypeDeclaration = 79, RULE_statement = 80, RULE_switchExpressionOrStatement = 81, 
		RULE_switchBlock = 82, RULE_switchLabeledRule = 83, RULE_switchLabeledExpression = 84, 
		RULE_switchLabeledBlock = 85, RULE_switchLabeledThrow = 86, RULE_elseStat = 87, 
		RULE_catchClause = 88, RULE_catchParameter = 89, RULE_catchType = 90, 
		RULE_finallyBlock = 91, RULE_resourceSpecification = 92, RULE_resources = 93, 
		RULE_resource = 94, RULE_resourceDeclaration = 95, RULE_variableAccess = 96, 
		RULE_fieldAccessNoIdent = 97, RULE_switchBlockStatementGroup = 98, RULE_switchLabel = 99, 
		RULE_caseConstants = 100, RULE_caseConstant = 101, RULE_forControl = 102, 
		RULE_forInit = 103, RULE_enhancedForControl = 104, RULE_enhancedForControlWithRecordPattern = 105, 
		RULE_parExpression = 106, RULE_expressionList = 107, RULE_expression = 108, 
		RULE_expr = 109, RULE_typeCastParameters = 110, RULE_lambdaParameters = 111, 
		RULE_multiLambdaParams = 112, RULE_primary = 113, RULE_classType = 114, 
		RULE_creator = 115, RULE_createdName = 116, RULE_createdNameExtended = 117, 
		RULE_innerCreator = 118, RULE_arrayCreatorRest = 119, RULE_bracketsWithExp = 120, 
		RULE_classCreatorRest = 121, RULE_typeArgumentsOrDiamond = 122, RULE_nonWildcardTypeArgumentsOrDiamond = 123, 
		RULE_nonWildcardTypeArguments = 124, RULE_typeArgumentsTypeList = 125, 
		RULE_typeList = 126, RULE_typeType = 127, RULE_classOrInterfaceOrPrimitiveType = 128, 
		RULE_arrayDeclarator = 129, RULE_primitiveType = 130, RULE_typeArguments = 131, 
		RULE_superSuffix = 132, RULE_arguments = 133, RULE_pattern = 134, RULE_innerPattern = 135, 
		RULE_guardedPattern = 136, RULE_guard = 137, RULE_primaryPattern = 138, 
		RULE_typePattern = 139, RULE_recordPattern = 140, RULE_recordComponentPatternList = 141, 
		RULE_permittedSubclassesAndInterfaces = 142, RULE_id = 143;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"types", "modifier", "variableModifier", "classDeclaration", "recordDeclaration", 
			"recordComponentsList", "recordComponents", "recordComponent", "lastRecordComponent", 
			"recordBody", "recordBodyDeclaration", "compactConstructorDeclaration", 
			"classExtends", "implementsClause", "typeParameters", "typeParameter", 
			"typeUpperBounds", "typeBound", "typeBoundType", "enumDeclaration", "enumBody", 
			"enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", 
			"interfaceExtends", "classBody", "interfaceBody", "classBodyDeclaration", 
			"memberDeclaration", "methodDeclaration", "methodBody", "throwsList", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "interfaceMethodDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "classOrInterfaceType", "classOrInterfaceTypeExtended", 
			"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
			"formalParameter", "lastFormalParameter", "qualifiedName", "qualifiedNameExtended", 
			"literal", "integerLiteral", "floatLiteral", "textBlockLiteral", "annotations", 
			"annotation", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodRest", 
			"annotationConstantRest", "defaultValue", "constructorBlock", "explicitConstructorInvocation", 
			"block", "blockStatement", "localVariableDeclaration", "localTypeDeclaration", 
			"statement", "switchExpressionOrStatement", "switchBlock", "switchLabeledRule", 
			"switchLabeledExpression", "switchLabeledBlock", "switchLabeledThrow", 
			"elseStat", "catchClause", "catchParameter", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "resourceDeclaration", 
			"variableAccess", "fieldAccessNoIdent", "switchBlockStatementGroup", 
			"switchLabel", "caseConstants", "caseConstant", "forControl", "forInit", 
			"enhancedForControl", "enhancedForControlWithRecordPattern", "parExpression", 
			"expressionList", "expression", "expr", "typeCastParameters", "lambdaParameters", 
			"multiLambdaParams", "primary", "classType", "creator", "createdName", 
			"createdNameExtended", "innerCreator", "arrayCreatorRest", "bracketsWithExp", 
			"classCreatorRest", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"nonWildcardTypeArguments", "typeArgumentsTypeList", "typeList", "typeType", 
			"classOrInterfaceOrPrimitiveType", "arrayDeclarator", "primitiveType", 
			"typeArguments", "superSuffix", "arguments", "pattern", "innerPattern", 
			"guardedPattern", "guard", "primaryPattern", "typePattern", "recordPattern", 
			"recordComponentPatternList", "permittedSubclassesAndInterfaces", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'extends'", null, null, null, null, 
			null, null, null, null, null, null, null, "'import'", null, null, null, 
			null, null, null, null, null, "'final'", "'abstract'", "'strictfp'", 
			null, null, "'package'", "';'", null, "'['", "']'", "'void'", "'boolean'", 
			"'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", 
			null, "'.'", "'*'", "'private'", "'public'", "'protected'", "'static'", 
			"'transient'", "'native'", "'synchronized'", "'volatile'", "'class'", 
			null, "'interface'", "'{'", "'}'", "','", "'implements'", "'('", "')'", 
			"'this'", "'super'", "'='", "'throws'", "':'", "'if'", "'while'", "'do'", 
			"'break'", "'continue'", "'return'", "'switch'", "'throw'", "'for'", 
			"'else'", "'case'", "'default'", "'try'", "'catch'", "'finally'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'>>='", "'>>>='", "'<<='", "'&='", "'^='", 
			"'|='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'!='", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'instanceof'", null, null, null, "'+'", "'-'", 
			"'/'", "'%'", "'++'", "'--'", "'~'", "'!'", "'true'", "'false'", "'null'", 
			"'new'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'assert'", null, "'enum'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'@'", "'...'", null, null, null, null, null, null, null, "'::'", 
			null, "'->'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'record'", null, null, 
			null, null, null, null, "'yield'", null, "'non-sealed'", "'sealed'", 
			"'permits'", null, null, "'when'", null, null, null, null, null, null, 
			null, null, null, "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPILATION_UNIT", "PLACEHOLDER1", "NULL_TREE_LOOKAHEAD", "BLOCK", 
			"MODIFIERS", "OBJBLOCK", "SLIST", "CTOR_DEF", "METHOD_DEF", "VARIABLE_DEF", 
			"INSTANCE_INIT", "STATIC_INIT", "TYPE", "CLASS_DEF", "INTERFACE_DEF", 
			"PACKAGE_DEF", "ARRAY_DECLARATOR", "EXTENDS_CLAUSE", "IMPLEMENTS_CLAUSE", 
			"PARAMETERS", "PARAMETER_DEF", "LABELED_STAT", "TYPECAST", "INDEX_OP", 
			"POST_INC", "POST_DEC", "METHOD_CALL", "EXPR", "ARRAY_INIT", "IMPORT", 
			"UNARY_MINUS", "UNARY_PLUS", "CASE_GROUP", "ELIST", "FOR_INIT", "FOR_CONDITION", 
			"FOR_ITERATOR", "EMPTY_STAT", "FINAL", "ABSTRACT", "STRICTFP", "SUPER_CTOR_CALL", 
			"CTOR_CALL", "LITERAL_PACKAGE", "SEMI", "LITERAL_IMPORT", "LBRACK", "RBRACK", 
			"LITERAL_VOID", "LITERAL_BOOLEAN", "LITERAL_BYTE", "LITERAL_CHAR", "LITERAL_SHORT", 
			"LITERAL_INT", "LITERAL_FLOAT", "LITERAL_LONG", "LITERAL_DOUBLE", "IDENT", 
			"DOT", "STAR", "LITERAL_PRIVATE", "LITERAL_PUBLIC", "LITERAL_PROTECTED", 
			"LITERAL_STATIC", "LITERAL_TRANSIENT", "LITERAL_NATIVE", "LITERAL_SYNCHRONIZED", 
			"LITERAL_VOLATILE", "LITERAL_CLASS", "LITERAL_EXTENDS", "LITERAL_INTERFACE", 
			"LCURLY", "RCURLY", "COMMA", "LITERAL_IMPLEMENTS", "LPAREN", "RPAREN", 
			"LITERAL_THIS", "LITERAL_SUPER", "ASSIGN", "LITERAL_THROWS", "COLON", 
			"LITERAL_IF", "LITERAL_WHILE", "LITERAL_DO", "LITERAL_BREAK", "LITERAL_CONTINUE", 
			"LITERAL_RETURN", "LITERAL_SWITCH", "LITERAL_THROW", "LITERAL_FOR", "LITERAL_ELSE", 
			"LITERAL_CASE", "LITERAL_DEFAULT", "LITERAL_TRY", "LITERAL_CATCH", "LITERAL_FINALLY", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"SR_ASSIGN", "BSR_ASSIGN", "SL_ASSIGN", "BAND_ASSIGN", "BXOR_ASSIGN", 
			"BOR_ASSIGN", "QUESTION", "LOR", "LAND", "BOR", "BXOR", "BAND", "NOT_EQUAL", 
			"EQUAL", "LT", "GT", "LE", "GE", "LITERAL_INSTANCEOF", "SL", "SR", "BSR", 
			"PLUS", "MINUS", "DIV", "MOD", "INC", "DEC", "BNOT", "LNOT", "LITERAL_TRUE", 
			"LITERAL_FALSE", "LITERAL_NULL", "LITERAL_NEW", "NUM_INT", "CHAR_LITERAL", 
			"STRING_LITERAL", "NUM_FLOAT", "NUM_LONG", "NUM_DOUBLE", "WS", "SINGLE_LINE_COMMENT", 
			"BLOCK_COMMENT_BEGIN", "ESC", "HEX_DIGIT", "VOCAB", "EXPONENT", "FLOAT_SUFFIX", 
			"ASSERT", "STATIC_IMPORT", "ENUM", "ENUM_DEF", "ENUM_CONSTANT_DEF", "FOR_EACH_CLAUSE", 
			"ANNOTATION_DEF", "ANNOTATIONS", "ANNOTATION", "ANNOTATION_MEMBER_VALUE_PAIR", 
			"ANNOTATION_FIELD_DEF", "ANNOTATION_ARRAY_INIT", "TYPE_ARGUMENTS", "TYPE_ARGUMENT", 
			"TYPE_PARAMETERS", "TYPE_PARAMETER", "WILDCARD_TYPE", "TYPE_UPPER_BOUNDS", 
			"TYPE_LOWER_BOUNDS", "AT", "ELLIPSIS", "GENERIC_START", "GENERIC_END", 
			"TYPE_EXTENSION_AND", "DO_WHILE", "RESOURCE_SPECIFICATION", "RESOURCES", 
			"RESOURCE", "DOUBLE_COLON", "METHOD_REF", "LAMBDA", "BLOCK_COMMENT_END", 
			"COMMENT_CONTENT", "SINGLE_LINE_COMMENT_CONTENT", "BLOCK_COMMENT_CONTENT", 
			"STD_ESC", "BINARY_DIGIT", "ID_START", "ID_PART", "INT_LITERAL", "LONG_LITERAL", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "HEX_FLOAT_LITERAL", "HEX_DOUBLE_LITERAL", 
			"SIGNED_INTEGER", "BINARY_EXPONENT", "PATTERN_VARIABLE_DEF", "RECORD_DEF", 
			"LITERAL_RECORD", "RECORD_COMPONENTS", "RECORD_COMPONENT_DEF", "COMPACT_CTOR_DEF", 
			"TEXT_BLOCK_LITERAL_BEGIN", "TEXT_BLOCK_CONTENT", "TEXT_BLOCK_LITERAL_END", 
			"LITERAL_YIELD", "SWITCH_RULE", "LITERAL_NON_SEALED", "LITERAL_SEALED", 
			"LITERAL_PERMITS", "PERMITS_CLAUSE", "PATTERN_DEF", "LITERAL_WHEN", "RECORD_PATTERN_DEF", 
			"RECORD_PATTERN_COMPONENTS", "NOT_FOR_USAGE_1", "NOT_FOR_USAGE_2", "NOT_FOR_USAGE_3", 
			"NOT_FOR_USAGE_4", "NOT_FOR_USAGE_5", "NOT_FOR_USAGE_6", "NOT_FOR_USAGE_7", 
			"LITERAL_UNDERSCORE", "UNNAMED_PATTERN_DEF", "DECIMAL_LITERAL_LONG", 
			"DECIMAL_LITERAL", "HEX_LITERAL_LONG", "HEX_LITERAL", "OCT_LITERAL_LONG", 
			"OCT_LITERAL", "BINARY_LITERAL_LONG", "BINARY_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaLanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    /**
	     * This is the number of files to parse before clearing the parser's
	     * DFA states. This number can have a significant impact on performance;
	     * we have found 500 files to be a good balance between parser speed and
	     * memory usage. This field must be public in order to be accessed and
	     * used for {@link JavaLanguageParser#JavaLanguageParser(TokenStream, int)}
	     * generated constructor.
	     */
	    public static final int CLEAR_DFA_LIMIT = 500;

	    /**
	    * This value tracks the depth of a switch expression. Along with the
	    * IDENT to id rule at the end of the parser, this value helps us
	    * to know if the "yield" we are parsing is an IDENT, method call, class,
	    * field, etc. or if it is a java 13+ yield statement. Positive values
	    * indicate that we are within a (possibly nested) switch expression.
	    */
	    private int switchBlockDepth = 0;

	    /**
	     * Checks if next statement is a yield statement.
	     *
	     * @return true if next statement is a yield statement.
	     */
	    private boolean isYieldStatement() {
	        return _input.LT(1).getType() == JavaLanguageLexer.LITERAL_YIELD && switchBlockDepth > 0;
	    }

	    static int fileCounter = 0;

	    /**
	     * We create a custom constructor so that we can clear the DFA
	     * states upon instantiation of JavaLanguageParser.
	     *
	     * @param input the token stream to parse
	     * @param clearDfaLimit this is the number of files to parse before clearing
	     *         the parser's DFA states. This number can have a significant impact
	     *         on performance; more frequent clearing of DFA states can lead to
	     *         slower parsing but lower memory usage. Conversely, not clearing the
	     *         DFA states at all can lead to enormous memory usage, but may also
	     *         have a negative effect on memory usage from higher garbage collector
	     *         activity.
	     */
	    public JavaLanguageParser(TokenStream input, int clearDfaLimit) {
	        super(input);
	        _interp = new ParserATNSimulator(this, _ATN , _decisionToDFA, _sharedContextCache);
	        fileCounter++;
	        if (fileCounter > clearDfaLimit) {
	            _interp.clearDFA();
	            fileCounter = 0;
	        }
	    }

	public JavaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaLanguageParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(288);
				packageDeclaration();
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					importDeclaration();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028803457220679L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 216313519602270209L) != 0)) {
				{
				{
				setState(297);
				typeDeclaration();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode LITERAL_PACKAGE() { return getToken(JavaLanguageParser.LITERAL_PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			annotations(true);
			setState(306);
			match(LITERAL_PACKAGE);
			setState(307);
			qualifiedName();
			setState(308);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleSemiImportContext extends ImportDeclarationContext {
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public SingleSemiImportContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSingleSemiImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDecContext extends ImportDeclarationContext {
		public TerminalNode IMPORT() { return getToken(JavaLanguageParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TerminalNode LITERAL_STATIC() { return getToken(JavaLanguageParser.LITERAL_STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(JavaLanguageParser.STAR, 0); }
		public ImportDecContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitImportDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new ImportDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(IMPORT);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERAL_STATIC) {
					{
					setState(311);
					match(LITERAL_STATIC);
					}
				}

				setState(314);
				qualifiedName();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(315);
					match(DOT);
					setState(316);
					match(STAR);
					}
				}

				setState(319);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new SingleSemiImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public TypesContext type;
		public Token SEMI;
		public List<Token> semi = new ArrayList<Token>();
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaLanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaLanguageParser.SEMI, i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case ABSTRACT:
			case STRICTFP:
			case LITERAL_PRIVATE:
			case LITERAL_PUBLIC:
			case LITERAL_PROTECTED:
			case LITERAL_STATIC:
			case LITERAL_TRANSIENT:
			case LITERAL_NATIVE:
			case LITERAL_SYNCHRONIZED:
			case LITERAL_VOLATILE:
			case LITERAL_CLASS:
			case LITERAL_INTERFACE:
			case LITERAL_DEFAULT:
			case ENUM:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						((TypeDeclarationContext)_localctx).modifier = modifier();
						((TypeDeclarationContext)_localctx).mods.add(((TypeDeclarationContext)_localctx).modifier);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(330);
				((TypeDeclarationContext)_localctx).type = types(_localctx.mods);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(331);
						((TypeDeclarationContext)_localctx).SEMI = match(SEMI);
						((TypeDeclarationContext)_localctx).semi.add(((TypeDeclarationContext)_localctx).SEMI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(334); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypesContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types(List<ModifierContext> mods) throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState(), mods);
		enterRule(_localctx, 8, RULE_types);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				classDeclaration(mods);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				enumDeclaration(mods);
				}
				break;
			case LITERAL_INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				interfaceDeclaration(mods);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				annotationTypeDeclaration(mods);
				}
				break;
			case LITERAL_RECORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				recordDeclaration(mods);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode LITERAL_PUBLIC() { return getToken(JavaLanguageParser.LITERAL_PUBLIC, 0); }
		public TerminalNode LITERAL_PROTECTED() { return getToken(JavaLanguageParser.LITERAL_PROTECTED, 0); }
		public TerminalNode LITERAL_PRIVATE() { return getToken(JavaLanguageParser.LITERAL_PRIVATE, 0); }
		public TerminalNode LITERAL_STATIC() { return getToken(JavaLanguageParser.LITERAL_STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaLanguageParser.ABSTRACT, 0); }
		public TerminalNode LITERAL_DEFAULT() { return getToken(JavaLanguageParser.LITERAL_DEFAULT, 0); }
		public TerminalNode FINAL() { return getToken(JavaLanguageParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaLanguageParser.STRICTFP, 0); }
		public TerminalNode LITERAL_NATIVE() { return getToken(JavaLanguageParser.LITERAL_NATIVE, 0); }
		public TerminalNode LITERAL_SYNCHRONIZED() { return getToken(JavaLanguageParser.LITERAL_SYNCHRONIZED, 0); }
		public TerminalNode LITERAL_TRANSIENT() { return getToken(JavaLanguageParser.LITERAL_TRANSIENT, 0); }
		public TerminalNode LITERAL_VOLATILE() { return getToken(JavaLanguageParser.LITERAL_VOLATILE, 0); }
		public TerminalNode LITERAL_NON_SEALED() { return getToken(JavaLanguageParser.LITERAL_NON_SEALED, 0); }
		public TerminalNode LITERAL_SEALED() { return getToken(JavaLanguageParser.LITERAL_SEALED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				annotation();
				}
				break;
			case LITERAL_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(LITERAL_PUBLIC);
				}
				break;
			case LITERAL_PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(LITERAL_PROTECTED);
				}
				break;
			case LITERAL_PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(LITERAL_PRIVATE);
				}
				break;
			case LITERAL_STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				match(LITERAL_STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				match(ABSTRACT);
				}
				break;
			case LITERAL_DEFAULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				match(LITERAL_DEFAULT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				match(STRICTFP);
				}
				break;
			case LITERAL_NATIVE:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				match(LITERAL_NATIVE);
				}
				break;
			case LITERAL_SYNCHRONIZED:
				enterOuterAlt(_localctx, 11);
				{
				setState(355);
				match(LITERAL_SYNCHRONIZED);
				}
				break;
			case LITERAL_TRANSIENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(356);
				match(LITERAL_TRANSIENT);
				}
				break;
			case LITERAL_VOLATILE:
				enterOuterAlt(_localctx, 13);
				{
				setState(357);
				match(LITERAL_VOLATILE);
				}
				break;
			case LITERAL_NON_SEALED:
				enterOuterAlt(_localctx, 14);
				{
				setState(358);
				match(LITERAL_NON_SEALED);
				}
				break;
			case LITERAL_SEALED:
				enterOuterAlt(_localctx, 15);
				{
				setState(359);
				match(LITERAL_SEALED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaLanguageParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TerminalNode LITERAL_CLASS() { return getToken(JavaLanguageParser.LITERAL_CLASS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassExtendsContext classExtends() {
			return getRuleContext(ClassExtendsContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public PermittedSubclassesAndInterfacesContext permittedSubclassesAndInterfaces() {
			return getRuleContext(PermittedSubclassesAndInterfacesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration(List<ModifierContext> mods) throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LITERAL_CLASS);
			setState(367);
			id();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(368);
				typeParameters();
				}
			}

			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_CLAUSE) {
				{
				setState(371);
				classExtends();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_IMPLEMENTS) {
				{
				setState(374);
				implementsClause();
				}
			}

			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_PERMITS) {
				{
				setState(377);
				permittedSubclassesAndInterfaces();
				}
			}

			setState(380);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TerminalNode LITERAL_RECORD() { return getToken(JavaLanguageParser.LITERAL_RECORD, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RecordComponentsListContext recordComponentsList() {
			return getRuleContext(RecordComponentsListContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration(List<ModifierContext> mods) throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 16, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(LITERAL_RECORD);
			setState(383);
			id();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(384);
				typeParameters();
				}
			}

			setState(387);
			recordComponentsList();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_IMPLEMENTS) {
				{
				setState(388);
				implementsClause();
				}
			}

			setState(391);
			recordBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentsListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public RecordComponentsContext recordComponents() {
			return getRuleContext(RecordComponentsContext.class,0);
		}
		public RecordComponentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordComponentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentsListContext recordComponentsList() throws RecognitionException {
		RecordComponentsListContext _localctx = new RecordComponentsListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordComponentsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LPAREN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 18035977498918913L) != 0)) {
				{
				setState(394);
				recordComponents();
				}
			}

			setState(397);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentsContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public LastRecordComponentContext lastRecordComponent() {
			return getRuleContext(LastRecordComponentContext.class,0);
		}
		public RecordComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponents; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentsContext recordComponents() throws RecognitionException {
		RecordComponentsContext _localctx = new RecordComponentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recordComponents);
		int _la;
		try {
			int _alt;
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				recordComponent();
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						match(COMMA);
						setState(401);
						recordComponent();
						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(407);
					match(COMMA);
					setState(408);
					lastRecordComponent();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				lastRecordComponent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext type;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			annotations(true);
			setState(415);
			((RecordComponentContext)_localctx).type = typeType(true);
			setState(416);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastRecordComponentContext extends ParserRuleContext {
		public TypeTypeContext type;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaLanguageParser.ELLIPSIS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public LastRecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastRecordComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLastRecordComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastRecordComponentContext lastRecordComponent() throws RecognitionException {
		LastRecordComponentContext _localctx = new LastRecordComponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lastRecordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			annotations(true);
			setState(419);
			((LastRecordComponentContext)_localctx).type = typeType(true);
			setState(420);
			match(ELLIPSIS);
			setState(421);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<RecordBodyDeclarationContext> recordBodyDeclaration() {
			return getRuleContexts(RecordBodyDeclarationContext.class);
		}
		public RecordBodyDeclarationContext recordBodyDeclaration(int i) {
			return getRuleContext(RecordBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LCURLY);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028812048202823L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 9007267974217729L) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
				{
				{
				setState(424);
				recordBodyDeclaration();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordBodyDeclarationContext extends ParserRuleContext {
		public CompactConstructorDeclarationContext compactConstructorDeclaration() {
			return getRuleContext(CompactConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public RecordBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordBodyDeclarationContext recordBodyDeclaration() throws RecognitionException {
		RecordBodyDeclarationContext _localctx = new RecordBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_recordBodyDeclaration);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				compactConstructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				classBodyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompactConstructorDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CompactConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compactConstructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCompactConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompactConstructorDeclarationContext compactConstructorDeclaration() throws RecognitionException {
		CompactConstructorDeclarationContext _localctx = new CompactConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compactConstructorDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					((CompactConstructorDeclarationContext)_localctx).modifier = modifier();
					((CompactConstructorDeclarationContext)_localctx).mods.add(((CompactConstructorDeclarationContext)_localctx).modifier);
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(442);
			id();
			setState(443);
			constructorBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExtendsContext extends ParserRuleContext {
		public TypeTypeContext type;
		public TerminalNode EXTENDS_CLAUSE() { return getToken(JavaLanguageParser.EXTENDS_CLAUSE, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ClassExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExtendsContext classExtends() throws RecognitionException {
		ClassExtendsContext _localctx = new ClassExtendsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(EXTENDS_CLAUSE);
			setState(446);
			((ClassExtendsContext)_localctx).type = typeType(false);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode LITERAL_IMPLEMENTS() { return getToken(JavaLanguageParser.LITERAL_IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_implementsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(LITERAL_IMPLEMENTS);
			setState(449);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LT);
			setState(452);
			typeParameter();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				typeParameter();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeUpperBoundsContext typeUpperBounds() {
			return getRuleContext(TypeUpperBoundsContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			annotations(false);
			setState(463);
			id();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_CLAUSE) {
				{
				setState(464);
				typeUpperBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeUpperBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS_CLAUSE() { return getToken(JavaLanguageParser.EXTENDS_CLAUSE, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeUpperBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeUpperBounds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeUpperBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeUpperBoundsContext typeUpperBounds() throws RecognitionException {
		TypeUpperBoundsContext _localctx = new TypeUpperBoundsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeUpperBounds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(EXTENDS_CLAUSE);
			setState(468);
			annotations(false);
			setState(469);
			typeBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeBoundTypeContext> typeBoundType() {
			return getRuleContexts(TypeBoundTypeContext.class);
		}
		public TypeBoundTypeContext typeBoundType(int i) {
			return getRuleContext(TypeBoundTypeContext.class,i);
		}
		public List<TerminalNode> BAND() { return getTokens(JavaLanguageParser.BAND); }
		public TerminalNode BAND(int i) {
			return getToken(JavaLanguageParser.BAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			typeBoundType();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAND) {
				{
				{
				setState(472);
				match(BAND);
				setState(473);
				typeBoundType();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundTypeContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() {
			return getRuleContext(ClassOrInterfaceOrPrimitiveTypeContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public TypeBoundTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoundType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeBoundType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundTypeContext typeBoundType() throws RecognitionException {
		TypeBoundTypeContext _localctx = new TypeBoundTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeBoundType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			annotations(false);
			setState(480);
			classOrInterfaceOrPrimitiveType();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(481);
				arrayDeclarator();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TerminalNode ENUM() { return getToken(JavaLanguageParser.ENUM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration(List<ModifierContext> mods) throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 46, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ENUM);
			setState(488);
			id();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_IMPLEMENTS) {
				{
				setState(489);
				implementsClause();
				}
			}

			setState(492);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaLanguageParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(LCURLY);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 18035977498918913L) != 0)) {
				{
				setState(495);
				enumConstants();
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(498);
				match(COMMA);
				}
			}

			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(501);
				enumBodyDeclarations();
				}
			}

			setState(504);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			enumConstant();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					enumConstant();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			annotations(true);
			setState(515);
			id();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(516);
				arguments();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(519);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(SEMI);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028812048202823L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 9007267974217729L) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
				{
				{
				setState(523);
				classBodyDeclaration();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TerminalNode LITERAL_INTERFACE() { return getToken(JavaLanguageParser.LITERAL_INTERFACE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceExtendsContext interfaceExtends() {
			return getRuleContext(InterfaceExtendsContext.class,0);
		}
		public PermittedSubclassesAndInterfacesContext permittedSubclassesAndInterfaces() {
			return getRuleContext(PermittedSubclassesAndInterfacesContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration(List<ModifierContext> mods) throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 56, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(LITERAL_INTERFACE);
			setState(530);
			id();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(531);
				typeParameters();
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS_CLAUSE) {
				{
				setState(534);
				interfaceExtends();
				}
			}

			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_PERMITS) {
				{
				setState(537);
				permittedSubclassesAndInterfaces();
				}
			}

			setState(540);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS_CLAUSE() { return getToken(JavaLanguageParser.EXTENDS_CLAUSE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceExtendsContext interfaceExtends() throws RecognitionException {
		InterfaceExtendsContext _localctx = new InterfaceExtendsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(EXTENDS_CLAUSE);
			setState(543);
			typeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(LCURLY);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028812048202823L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 9007267974217729L) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
				{
				{
				setState(546);
				classBodyDeclaration();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(LCURLY);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028803458268231L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 9007267974217729L) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
				{
				{
				setState(555);
				interfaceBodyDeclaration();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	 
		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassBlockContext extends ClassBodyDeclarationContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LITERAL_STATIC() { return getToken(JavaLanguageParser.LITERAL_STATIC, 0); }
		public ClassBlockContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ClassBodyDeclarationContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassDefContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyClassContext extends ClassBodyDeclarationContext {
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public EmptyClassContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEmptyClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new EmptyClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ClassBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERAL_STATIC) {
					{
					setState(564);
					match(LITERAL_STATIC);
					}
				}

				setState(567);
				block();
				}
				break;
			case 3:
				_localctx = new ClassDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						((ClassDefContext)_localctx).modifier = modifier();
						((ClassDefContext)_localctx).mods.add(((ClassDefContext)_localctx).modifier);
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(574);
				memberDeclaration(((ClassDefContext) _localctx).mods);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration(List<ModifierContext> mods) throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 66, RULE_memberDeclaration);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				recordDeclaration(mods);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				methodDeclaration(mods);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				fieldDeclaration(mods);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				constructorDeclaration(mods);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				interfaceDeclaration(mods);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				annotationTypeDeclaration(mods);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				classDeclaration(mods);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(584);
				enumDeclaration(mods);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeParametersContext typeParams;
		public TypeTypeContext type;
		public ArrayDeclaratorContext arrayDeclarator;
		public List<ArrayDeclaratorContext> cStyleArrDec = new ArrayList<ArrayDeclaratorContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ThrowsListContext throwsList() {
			return getRuleContext(ThrowsListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(List<ModifierContext> mods) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 68, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(587);
				((MethodDeclarationContext)_localctx).typeParams = typeParameters();
				}
			}

			setState(590);
			((MethodDeclarationContext)_localctx).type = typeType(true);
			setState(591);
			id();
			setState(592);
			formalParameters();
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(593);
				((MethodDeclarationContext)_localctx).arrayDeclarator = arrayDeclarator();
				((MethodDeclarationContext)_localctx).cStyleArrDec.add(((MethodDeclarationContext)_localctx).arrayDeclarator);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_THROWS) {
				{
				setState(599);
				throwsList();
				}
			}

			setState(602);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodBody);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowsListContext extends ParserRuleContext {
		public TerminalNode LITERAL_THROWS() { return getToken(JavaLanguageParser.LITERAL_THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ThrowsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitThrowsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsListContext throwsList() throws RecognitionException {
		ThrowsListContext _localctx = new ThrowsListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_throwsList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(LITERAL_THROWS);
			setState(609);
			qualifiedNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public ConstructorBlockContext constructorBody;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ThrowsListContext throwsList() {
			return getRuleContext(ThrowsListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration(List<ModifierContext> mods) throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 74, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(611);
				typeParameters();
				}
			}

			setState(614);
			id();
			setState(615);
			formalParameters();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_THROWS) {
				{
				setState(616);
				throwsList();
				}
			}

			setState(619);
			((ConstructorDeclarationContext)_localctx).constructorBody = constructorBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration(List<ModifierContext> mods) throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 76, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			((FieldDeclarationContext)_localctx).type = typeType(true);
			setState(622);
			variableDeclarators(_localctx.mods, _localctx.type);
			setState(623);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case ABSTRACT:
			case STRICTFP:
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
			case IDENT:
			case LITERAL_PRIVATE:
			case LITERAL_PUBLIC:
			case LITERAL_PROTECTED:
			case LITERAL_STATIC:
			case LITERAL_TRANSIENT:
			case LITERAL_NATIVE:
			case LITERAL_SYNCHRONIZED:
			case LITERAL_VOLATILE:
			case LITERAL_CLASS:
			case LITERAL_INTERFACE:
			case LITERAL_DEFAULT:
			case LT:
			case ENUM:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(625);
						((InterfaceBodyDeclarationContext)_localctx).modifier = modifier();
						((InterfaceBodyDeclarationContext)_localctx).mods.add(((InterfaceBodyDeclarationContext)_localctx).modifier);
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(631);
				interfaceMemberDeclaration(_localctx.mods);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration(List<ModifierContext> mods) throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 80, RULE_interfaceMemberDeclaration);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				fieldDeclaration(mods);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				recordDeclaration(mods);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				interfaceMethodDeclaration(mods);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				interfaceDeclaration(mods);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				annotationTypeDeclaration(mods);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				classDeclaration(mods);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				enumDeclaration(mods);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public ArrayDeclaratorContext arrayDeclarator;
		public List<ArrayDeclaratorContext> cStyleArrDec = new ArrayList<ArrayDeclaratorContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ThrowsListContext throwsList() {
			return getRuleContext(ThrowsListContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration(List<ModifierContext> mods) throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 82, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(644);
				typeParameters();
				}
			}

			setState(647);
			((InterfaceMethodDeclarationContext)_localctx).type = typeType(true);
			setState(648);
			id();
			setState(649);
			formalParameters();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(650);
				((InterfaceMethodDeclarationContext)_localctx).arrayDeclarator = arrayDeclarator();
				((InterfaceMethodDeclarationContext)_localctx).cStyleArrDec.add(((InterfaceMethodDeclarationContext)_localctx).arrayDeclarator);
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_THROWS) {
				{
				setState(656);
				throwsList();
				}
			}

			setState(659);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods, TypeTypeContext type) {
			super(parent, invokingState);
			this.mods = mods;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators(List<ModifierContext> mods,TypeTypeContext type) throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState(), mods, type);
		enterRule(_localctx, 84, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			variableDeclarator(mods, type);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(662);
				match(COMMA);
				setState(663);
				variableDeclarator(mods, type);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(JavaLanguageParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods, TypeTypeContext type) {
			super(parent, invokingState);
			this.mods = mods;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator(List<ModifierContext> mods,TypeTypeContext type) throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState(), mods, type);
		enterRule(_localctx, 86, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			id();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(670);
				arrayDeclarator();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(676);
				match(ASSIGN);
				setState(677);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public List<VariableModifierContext> mods;
		public ParserRuleContext type;
		public TerminalNode LITERAL_THIS() { return getToken(JavaLanguageParser.LITERAL_THIS, 0); }
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState, List<VariableModifierContext> mods, ParserRuleContext type) {
			super(parent, invokingState);
			this.mods = mods;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId(List<VariableModifierContext> mods,ParserRuleContext type) throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState(), mods, type);
		enterRule(_localctx, 88, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_THIS:
				{
				setState(680);
				match(LITERAL_THIS);
				}
				break;
			case IDENT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				{
				{
				setState(681);
				qualifiedName();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(682);
					match(DOT);
					setState(683);
					match(LITERAL_THIS);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(688);
				arrayDeclarator();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableInitializer);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				arrayInitializer();
				}
				break;
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
			case IDENT:
			case LPAREN:
			case LITERAL_THIS:
			case LITERAL_SUPER:
			case LITERAL_SWITCH:
			case PLUS:
			case MINUS:
			case INC:
			case DEC:
			case BNOT:
			case LNOT:
			case LITERAL_TRUE:
			case LITERAL_FALSE:
			case LITERAL_NULL:
			case LITERAL_NEW:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case AT:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case HEX_FLOAT_LITERAL:
			case HEX_DOUBLE_LITERAL:
			case LITERAL_RECORD:
			case TEXT_BLOCK_LITERAL_BEGIN:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
			case DECIMAL_LITERAL_LONG:
			case DECIMAL_LITERAL:
			case HEX_LITERAL_LONG:
			case HEX_LITERAL:
			case OCT_LITERAL_LONG:
			case OCT_LITERAL:
			case BINARY_LITERAL_LONG:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LCURLY);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 1101264847871L) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 35184372117491L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4385166758159L) != 0)) {
				{
				setState(699);
				variableInitializer();
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(700);
						match(COMMA);
						setState(701);
						variableInitializer();
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
			}

			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(709);
				match(COMMA);
				}
			}

			setState(712);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public boolean createImaginaryNode;
		public ClassOrInterfaceTypeExtendedContext classOrInterfaceTypeExtended;
		public List<ClassOrInterfaceTypeExtendedContext> extended = new ArrayList<ClassOrInterfaceTypeExtendedContext>();
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<ClassOrInterfaceTypeExtendedContext> classOrInterfaceTypeExtended() {
			return getRuleContexts(ClassOrInterfaceTypeExtendedContext.class);
		}
		public ClassOrInterfaceTypeExtendedContext classOrInterfaceTypeExtended(int i) {
			return getRuleContext(ClassOrInterfaceTypeExtendedContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState, boolean createImaginaryNode) {
			super(parent, invokingState);
			this.createImaginaryNode = createImaginaryNode;
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType(boolean createImaginaryNode) throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState(), createImaginaryNode);
		enterRule(_localctx, 94, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			annotations(false);
			setState(715);
			id();
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(716);
				typeArguments();
				}
				break;
			}
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(719);
					((ClassOrInterfaceTypeContext)_localctx).classOrInterfaceTypeExtended = classOrInterfaceTypeExtended();
					((ClassOrInterfaceTypeContext)_localctx).extended.add(((ClassOrInterfaceTypeContext)_localctx).classOrInterfaceTypeExtended);
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeExtendedContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeExtended; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassOrInterfaceTypeExtended(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeExtendedContext classOrInterfaceTypeExtended() throws RecognitionException {
		ClassOrInterfaceTypeExtendedContext _localctx = new ClassOrInterfaceTypeExtendedContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classOrInterfaceTypeExtended);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(DOT);
			setState(726);
			annotations(false);
			setState(727);
			id();
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(728);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	 
		public TypeArgumentContext() { }
		public void copyFrom(TypeArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildCardTypeArgumentContext extends TypeArgumentContext {
		public Token upperBound;
		public Token lowerBound;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaLanguageParser.QUESTION, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode EXTENDS_CLAUSE() { return getToken(JavaLanguageParser.EXTENDS_CLAUSE, 0); }
		public TerminalNode LITERAL_SUPER() { return getToken(JavaLanguageParser.LITERAL_SUPER, 0); }
		public WildCardTypeArgumentContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitWildCardTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeArgumentContext extends TypeArgumentContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public SimpleTypeArgumentContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSimpleTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeArgument);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				typeType(false);
				}
				break;
			case 2:
				_localctx = new WildCardTypeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				annotations(false);
				setState(733);
				match(QUESTION);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS_CLAUSE || _la==LITERAL_SUPER) {
					{
					setState(736);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EXTENDS_CLAUSE:
						{
						setState(734);
						((WildCardTypeArgumentContext)_localctx).upperBound = match(EXTENDS_CLAUSE);
						}
						break;
					case LITERAL_SUPER:
						{
						setState(735);
						((WildCardTypeArgumentContext)_localctx).lowerBound = match(LITERAL_SUPER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(738);
					typeType(false);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			annotations(false);
			setState(744);
			qualifiedName();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				annotations(false);
				setState(747);
				qualifiedName();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LPAREN);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575898352105816064L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 18035977498918913L) != 0)) {
				{
				setState(755);
				formalParameterList();
				}
			}

			setState(758);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				formalParameter();
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(761);
						match(COMMA);
						setState(762);
						formalParameter();
						}
						} 
					}
					setState(767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(768);
					match(COMMA);
					setState(769);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier;
		public List<VariableModifierContext> mods = new ArrayList<VariableModifierContext>();
		public TypeTypeContext type;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775);
					((FormalParameterContext)_localctx).variableModifier = variableModifier();
					((FormalParameterContext)_localctx).mods.add(((FormalParameterContext)_localctx).variableModifier);
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(781);
			((FormalParameterContext)_localctx).type = typeType(true);
			setState(782);
			variableDeclaratorId(_localctx.mods, _localctx.type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier;
		public List<VariableModifierContext> mods = new ArrayList<VariableModifierContext>();
		public TypeTypeContext type;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaLanguageParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(784);
					((LastFormalParameterContext)_localctx).variableModifier = variableModifier();
					((LastFormalParameterContext)_localctx).mods.add(((LastFormalParameterContext)_localctx).variableModifier);
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(790);
			((LastFormalParameterContext)_localctx).type = typeType(true);
			setState(791);
			annotations(false);
			setState(792);
			match(ELLIPSIS);
			setState(793);
			variableDeclaratorId(_localctx.mods, _localctx.type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public QualifiedNameExtendedContext qualifiedNameExtended;
		public List<QualifiedNameExtendedContext> extended = new ArrayList<QualifiedNameExtendedContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<QualifiedNameExtendedContext> qualifiedNameExtended() {
			return getRuleContexts(QualifiedNameExtendedContext.class);
		}
		public QualifiedNameExtendedContext qualifiedNameExtended(int i) {
			return getRuleContext(QualifiedNameExtendedContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			id();
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(796);
					((QualifiedNameContext)_localctx).qualifiedNameExtended = qualifiedNameExtended();
					((QualifiedNameContext)_localctx).extended.add(((QualifiedNameContext)_localctx).qualifiedNameExtended);
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameExtendedContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public QualifiedNameExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameExtended; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitQualifiedNameExtended(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameExtendedContext qualifiedNameExtended() throws RecognitionException {
		QualifiedNameExtendedContext _localctx = new QualifiedNameExtendedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qualifiedNameExtended);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(DOT);
			setState(803);
			annotations(false);
			setState(804);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TextBlockLiteralContext textBlockLiteral() {
			return getRuleContext(TextBlockLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaLanguageParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaLanguageParser.STRING_LITERAL, 0); }
		public TerminalNode LITERAL_TRUE() { return getToken(JavaLanguageParser.LITERAL_TRUE, 0); }
		public TerminalNode LITERAL_FALSE() { return getToken(JavaLanguageParser.LITERAL_FALSE, 0); }
		public TerminalNode LITERAL_NULL() { return getToken(JavaLanguageParser.LITERAL_NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL_LONG:
			case DECIMAL_LITERAL:
			case HEX_LITERAL_LONG:
			case HEX_LITERAL:
			case OCT_LITERAL_LONG:
			case OCT_LITERAL:
			case BINARY_LITERAL_LONG:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case HEX_FLOAT_LITERAL:
			case HEX_DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				floatLiteral();
				}
				break;
			case TEXT_BLOCK_LITERAL_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				textBlockLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				match(STRING_LITERAL);
				}
				break;
			case LITERAL_TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				match(LITERAL_TRUE);
				}
				break;
			case LITERAL_FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(812);
				match(LITERAL_FALSE);
				}
				break;
			case LITERAL_NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(813);
				match(LITERAL_NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL_LONG() { return getToken(JavaLanguageParser.DECIMAL_LITERAL_LONG, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaLanguageParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL_LONG() { return getToken(JavaLanguageParser.HEX_LITERAL_LONG, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaLanguageParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL_LONG() { return getToken(JavaLanguageParser.OCT_LITERAL_LONG, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaLanguageParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL_LONG() { return getToken(JavaLanguageParser.BINARY_LITERAL_LONG, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaLanguageParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(JavaLanguageParser.DOUBLE_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaLanguageParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_DOUBLE_LITERAL() { return getToken(JavaLanguageParser.HEX_DOUBLE_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaLanguageParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !(((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextBlockLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_BLOCK_LITERAL_BEGIN() { return getToken(JavaLanguageParser.TEXT_BLOCK_LITERAL_BEGIN, 0); }
		public TerminalNode TEXT_BLOCK_CONTENT() { return getToken(JavaLanguageParser.TEXT_BLOCK_CONTENT, 0); }
		public TerminalNode TEXT_BLOCK_LITERAL_END() { return getToken(JavaLanguageParser.TEXT_BLOCK_LITERAL_END, 0); }
		public TextBlockLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBlockLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTextBlockLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextBlockLiteralContext textBlockLiteral() throws RecognitionException {
		TextBlockLiteralContext _localctx = new TextBlockLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_textBlockLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(TEXT_BLOCK_LITERAL_BEGIN);
			setState(821);
			match(TEXT_BLOCK_CONTENT);
			setState(822);
			match(TEXT_BLOCK_LITERAL_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationsContext extends ParserRuleContext {
		public boolean createImaginaryNode;
		public AnnotationContext annotation;
		public List<AnnotationContext> anno = new ArrayList<AnnotationContext>();
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationsContext(ParserRuleContext parent, int invokingState, boolean createImaginaryNode) {
			super(parent, invokingState);
			this.createImaginaryNode = createImaginaryNode;
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations(boolean createImaginaryNode) throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState(), createImaginaryNode);
		enterRule(_localctx, 122, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(824);
					((AnnotationsContext)_localctx).annotation = annotation();
					((AnnotationsContext)_localctx).anno.add(((AnnotationsContext)_localctx).annotation);
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaLanguageParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(AT);
			setState(831);
			qualifiedName();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(832);
				match(LPAREN);
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(833);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(834);
					elementValue();
					}
					break;
				}
				setState(837);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			elementValuePair();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(841);
				match(COMMA);
				setState(842);
				elementValuePair();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaLanguageParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			id();
			setState(849);
			match(ASSIGN);
			setState(850);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValue);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(LCURLY);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 1101264847871L) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 35184372117491L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4385166758159L) != 0)) {
				{
				setState(858);
				elementValue();
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(859);
						match(COMMA);
						setState(860);
						elementValue();
						}
						} 
					}
					setState(865);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
			}

			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(868);
				match(COMMA);
				}
			}

			setState(871);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TerminalNode AT() { return getToken(JavaLanguageParser.AT, 0); }
		public TerminalNode LITERAL_INTERFACE() { return getToken(JavaLanguageParser.LITERAL_INTERFACE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration(List<ModifierContext> mods) throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState(), mods);
		enterRule(_localctx, 134, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(AT);
			setState(874);
			match(LITERAL_INTERFACE);
			setState(875);
			id();
			setState(876);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(LCURLY);
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028803458268231L) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 2828401303477157889L) != 0) || _la==LITERAL_UNDERSCORE) {
				{
				{
				setState(879);
				annotationTypeElementDeclaration();
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case ABSTRACT:
			case STRICTFP:
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
			case IDENT:
			case LITERAL_PRIVATE:
			case LITERAL_PUBLIC:
			case LITERAL_PROTECTED:
			case LITERAL_STATIC:
			case LITERAL_TRANSIENT:
			case LITERAL_NATIVE:
			case LITERAL_SYNCHRONIZED:
			case LITERAL_VOLATILE:
			case LITERAL_CLASS:
			case LITERAL_INTERFACE:
			case LITERAL_DEFAULT:
			case ENUM:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						((AnnotationTypeElementDeclarationContext)_localctx).modifier = modifier();
						((AnnotationTypeElementDeclarationContext)_localctx).mods.add(((AnnotationTypeElementDeclarationContext)_localctx).modifier);
						}
						} 
					}
					setState(892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(893);
				annotationTypeElementRest(_localctx.mods);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods) {
			super(parent, invokingState);
			this.mods = mods;
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
	 
		public AnnotationTypeElementRestContext() { }
		public void copyFrom(AnnotationTypeElementRestContext ctx) {
			super.copyFrom(ctx);
			this.mods = ctx.mods;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationFieldContext extends AnnotationTypeElementRestContext {
		public TypeTypeContext type;
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationFieldContext(AnnotationTypeElementRestContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeContext extends AnnotationTypeElementRestContext {
		public TypeTypeContext type;
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeContext(AnnotationTypeElementRestContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest(List<ModifierContext> mods) throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState(), mods);
		enterRule(_localctx, 140, RULE_annotationTypeElementRest);
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new AnnotationFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				((AnnotationFieldContext)_localctx).type = typeType(true);
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(898);
					annotationMethodRest(mods, ((AnnotationFieldContext) _localctx).type);
					}
					break;
				case 2:
					{
					setState(899);
					annotationConstantRest(mods, ((AnnotationFieldContext) _localctx).type);
					}
					break;
				}
				setState(902);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				((AnnotationTypeContext)_localctx).type = typeType(true);
				setState(905);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				classDeclaration(mods);
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(908);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(911);
				recordDeclaration(mods);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(912);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(915);
				interfaceDeclaration(mods);
				setState(917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(916);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(919);
				enumDeclaration(mods);
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(920);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new AnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(923);
				annotationTypeDeclaration(mods);
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(924);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public ArrayDeclaratorContext arrayDeclarator;
		public List<ArrayDeclaratorContext> cStyleArrDec = new ArrayList<ArrayDeclaratorContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods, TypeTypeContext type) {
			super(parent, invokingState);
			this.mods = mods;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest(List<ModifierContext> mods,TypeTypeContext type) throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState(), mods, type);
		enterRule(_localctx, 142, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			id();
			setState(930);
			match(LPAREN);
			setState(931);
			match(RPAREN);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==AT) {
				{
				{
				setState(932);
				((AnnotationMethodRestContext)_localctx).arrayDeclarator = arrayDeclarator();
				((AnnotationMethodRestContext)_localctx).cStyleArrDec.add(((AnnotationMethodRestContext)_localctx).arrayDeclarator);
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_DEFAULT) {
				{
				setState(938);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public List<ModifierContext> mods;
		public TypeTypeContext type;
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState, List<ModifierContext> mods, TypeTypeContext type) {
			super(parent, invokingState);
			this.mods = mods;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest(List<ModifierContext> mods,TypeTypeContext type) throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState(), mods, type);
		enterRule(_localctx, 144, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			variableDeclarators(mods, type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode LITERAL_DEFAULT() { return getToken(JavaLanguageParser.LITERAL_DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(LITERAL_DEFAULT);
			setState(944);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitConstructorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBlockContext constructorBlock() throws RecognitionException {
		ConstructorBlockContext _localctx = new ConstructorBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_constructorBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(LCURLY);
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(947);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					blockStatement();
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(956);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
	 
		public ExplicitConstructorInvocationContext() { }
		public void copyFrom(ExplicitConstructorInvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitCtorCallContext extends ExplicitConstructorInvocationContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TerminalNode LITERAL_THIS() { return getToken(JavaLanguageParser.LITERAL_THIS, 0); }
		public TerminalNode LITERAL_SUPER() { return getToken(JavaLanguageParser.LITERAL_SUPER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExplicitCtorCallContext(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitExplicitCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryCtorCallContext extends ExplicitConstructorInvocationContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public TerminalNode LITERAL_SUPER() { return getToken(JavaLanguageParser.LITERAL_SUPER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryCtorCallContext(ExplicitConstructorInvocationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPrimaryCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new ExplicitCtorCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(958);
					typeArguments();
					}
				}

				setState(961);
				_la = _input.LA(1);
				if ( !(_la==LITERAL_THIS || _la==LITERAL_SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(962);
				arguments();
				setState(963);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new PrimaryCtorCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				expr(0);
				setState(966);
				match(DOT);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(967);
					typeArguments();
					}
				}

				setState(970);
				match(LITERAL_SUPER);
				setState(971);
				arguments();
				setState(972);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(LCURLY);
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(977);
					blockStatement();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(983);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarContext extends BlockStatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public LocalVarContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLocalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalTypeContext extends BlockStatementContext {
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public LocalTypeContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLocalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_blockStatement);
		try {
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new LocalVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				if (!(!isYieldStatement())) throw new FailedPredicateException(this, "!isYieldStatement()");
				setState(986);
				localVariableDeclaration();
				setState(987);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				statement();
				}
				break;
			case 3:
				_localctx = new LocalTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public TypeTypeContext type;
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993);
					((LocalVariableDeclarationContext)_localctx).modifier = modifier();
					((LocalVariableDeclarationContext)_localctx).mods.add(((LocalVariableDeclarationContext)_localctx).modifier);
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(999);
			((LocalVariableDeclarationContext)_localctx).type = typeType(true);
			setState(1000);
			variableDeclarators(_localctx.mods, _localctx.type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case ABSTRACT:
			case STRICTFP:
			case LITERAL_PRIVATE:
			case LITERAL_PUBLIC:
			case LITERAL_PROTECTED:
			case LITERAL_STATIC:
			case LITERAL_TRANSIENT:
			case LITERAL_NATIVE:
			case LITERAL_SYNCHRONIZED:
			case LITERAL_VOLATILE:
			case LITERAL_CLASS:
			case LITERAL_INTERFACE:
			case LITERAL_DEFAULT:
			case ENUM:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028798088511495L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 1649267441665L) != 0)) {
					{
					{
					setState(1002);
					((LocalTypeDeclarationContext)_localctx).modifier = modifier();
					((LocalTypeDeclarationContext)_localctx).mods.add(((LocalTypeDeclarationContext)_localctx).modifier);
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1012);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_CLASS:
					{
					setState(1008);
					classDeclaration(_localctx.mods);
					}
					break;
				case ENUM:
					{
					setState(1009);
					enumDeclaration(_localctx.mods);
					}
					break;
				case LITERAL_INTERFACE:
					{
					setState(1010);
					interfaceDeclaration(_localctx.mods);
					}
					break;
				case LITERAL_RECORD:
					{
					setState(1011);
					recordDeclaration(_localctx.mods);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertExpContext extends StatementContext {
		public TerminalNode ASSERT() { return getToken(JavaLanguageParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public AssertExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitAssertExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatementContext {
		public TerminalNode LITERAL_IF() { return getToken(JavaLanguageParser.LITERAL_IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryWithResourceStatContext extends StatementContext {
		public TerminalNode LITERAL_TRY() { return getToken(JavaLanguageParser.LITERAL_TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryWithResourceStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTryWithResourceStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatContext extends StatementContext {
		public TerminalNode LITERAL_TRY() { return getToken(JavaLanguageParser.LITERAL_TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTryStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatContext extends StatementContext {
		public SwitchExpressionOrStatementContext switchExpressionOrStatement() {
			return getRuleContext(SwitchExpressionOrStatementContext.class,0);
		}
		public SwitchStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SyncStatContext extends StatementContext {
		public TerminalNode LITERAL_SYNCHRONIZED() { return getToken(JavaLanguageParser.LITERAL_SYNCHRONIZED, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SyncStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSyncStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatContext extends StatementContext {
		public TerminalNode LITERAL_CONTINUE() { return getToken(JavaLanguageParser.LITERAL_CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ContinueStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatContext extends StatementContext {
		public TerminalNode LITERAL_BREAK() { return getToken(JavaLanguageParser.LITERAL_BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BreakStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatContext extends StatementContext {
		public TerminalNode LITERAL_FOR() { return getToken(JavaLanguageParser.LITERAL_FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelStatContext extends StatementContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLabelStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStatContext extends StatementContext {
		public TerminalNode LITERAL_DO() { return getToken(JavaLanguageParser.LITERAL_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LITERAL_WHILE() { return getToken(JavaLanguageParser.LITERAL_WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public DoStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitDoStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StatementContext {
		public TerminalNode LITERAL_RETURN() { return getToken(JavaLanguageParser.LITERAL_RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatContext extends StatementContext {
		public TerminalNode LITERAL_THROW() { return getToken(JavaLanguageParser.LITERAL_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public ThrowStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitThrowStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatContext extends StatementContext {
		public TerminalNode LITERAL_YIELD() { return getToken(JavaLanguageParser.LITERAL_YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public YieldStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitYieldStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public EmptyStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEmptyStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpStatContext extends StatementContext {
		public ExpressionContext statementExpression;
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitExpStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatContext extends StatementContext {
		public TerminalNode LITERAL_WHILE() { return getToken(JavaLanguageParser.LITERAL_WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				((BlockStatContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				_localctx = new AssertExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				match(ASSERT);
				setState(1019);
				expression();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1020);
					match(COLON);
					setState(1021);
					expression();
					}
				}

				setState(1024);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(LITERAL_IF);
				setState(1027);
				parExpression();
				setState(1028);
				statement();
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1029);
					elseStat();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				match(LITERAL_FOR);
				setState(1033);
				forControl();
				setState(1034);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1036);
				match(LITERAL_WHILE);
				setState(1037);
				parExpression();
				setState(1038);
				statement();
				}
				break;
			case 6:
				_localctx = new DoStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				match(LITERAL_DO);
				setState(1041);
				statement();
				setState(1042);
				match(LITERAL_WHILE);
				setState(1043);
				parExpression();
				setState(1044);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new TryStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1046);
				match(LITERAL_TRY);
				setState(1047);
				block();
				setState(1057);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_CATCH:
					{
					setState(1049); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1048);
							catchClause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1051); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1054);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1053);
						finallyBlock();
						}
						break;
					}
					}
					break;
				case LITERAL_FINALLY:
					{
					setState(1056);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new TryWithResourceStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1059);
				match(LITERAL_TRY);
				setState(1060);
				resourceSpecification();
				setState(1061);
				block();
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1062);
						catchClause();
						}
						} 
					}
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1068);
					finallyBlock();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new YieldStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1071);
				match(LITERAL_YIELD);
				setState(1072);
				expression();
				setState(1073);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new SwitchStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				switchExpressionOrStatement();
				}
				break;
			case 11:
				_localctx = new SyncStatContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1076);
				match(LITERAL_SYNCHRONIZED);
				setState(1077);
				parExpression();
				setState(1078);
				block();
				}
				break;
			case 12:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1080);
				match(LITERAL_RETURN);
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
					{
					setState(1081);
					expression();
					}
				}

				setState(1084);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new ThrowStatContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1085);
				match(LITERAL_THROW);
				setState(1086);
				expression();
				setState(1087);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1089);
				match(LITERAL_BREAK);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
					{
					setState(1090);
					id();
					}
				}

				setState(1093);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1094);
				match(LITERAL_CONTINUE);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) {
					{
					setState(1095);
					id();
					}
				}

				setState(1098);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new EmptyStatContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1099);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new ExpStatContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1100);
				((ExpStatContext)_localctx).statementExpression = expression();
				setState(1101);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new LabelStatContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1103);
				id();
				setState(1104);
				match(COLON);
				setState(1105);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchExpressionOrStatementContext extends ParserRuleContext {
		public TerminalNode LITERAL_SWITCH() { return getToken(JavaLanguageParser.LITERAL_SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(JavaLanguageParser.LCURLY, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(JavaLanguageParser.RCURLY, 0); }
		public SwitchExpressionOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpressionOrStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchExpressionOrStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExpressionOrStatementContext switchExpressionOrStatement() throws RecognitionException {
		SwitchExpressionOrStatementContext _localctx = new SwitchExpressionOrStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_switchExpressionOrStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(LITERAL_SWITCH);
			setState(1110);
			parExpression();
			setState(1111);
			match(LCURLY);
			switchBlockDepth++;
			setState(1113);
			switchBlock();
			switchBlockDepth--;
			setState(1115);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
	 
		public SwitchBlockContext() { }
		public void copyFrom(SwitchBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchRulesContext extends SwitchBlockContext {
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchRulesContext(SwitchBlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchRules(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlocksContext extends SwitchBlockContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup;
		public List<SwitchBlockStatementGroupContext> groups = new ArrayList<SwitchBlockStatementGroupContext>();
		public SwitchLabelContext switchLabel;
		public List<SwitchLabelContext> emptyLabels = new ArrayList<SwitchLabelContext>();
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlocksContext(SwitchBlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new SwitchRulesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1117);
					switchLabeledRule();
					}
					}
					setState(1120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LITERAL_CASE || _la==LITERAL_DEFAULT );
				}
				break;
			case 2:
				_localctx = new SwitchBlocksContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1122);
						((SwitchBlocksContext)_localctx).switchBlockStatementGroup = switchBlockStatementGroup();
						((SwitchBlocksContext)_localctx).groups.add(((SwitchBlocksContext)_localctx).switchBlockStatementGroup);
						}
						} 
					}
					setState(1127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LITERAL_CASE || _la==LITERAL_DEFAULT) {
					{
					{
					setState(1128);
					((SwitchBlocksContext)_localctx).switchLabel = switchLabel();
					((SwitchBlocksContext)_localctx).emptyLabels.add(((SwitchBlocksContext)_localctx).switchLabel);
					}
					}
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public SwitchLabeledExpressionContext switchLabeledExpression() {
			return getRuleContext(SwitchLabeledExpressionContext.class,0);
		}
		public SwitchLabeledBlockContext switchLabeledBlock() {
			return getRuleContext(SwitchLabeledBlockContext.class,0);
		}
		public SwitchLabeledThrowContext switchLabeledThrow() {
			return getRuleContext(SwitchLabeledThrowContext.class,0);
		}
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchLabeledRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_switchLabeledRule);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				switchLabeledExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				switchLabeledBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				switchLabeledThrow();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabeledExpressionContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(JavaLanguageParser.LAMBDA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public SwitchLabeledExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchLabeledExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledExpressionContext switchLabeledExpression() throws RecognitionException {
		SwitchLabeledExpressionContext _localctx = new SwitchLabeledExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_switchLabeledExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			switchLabel();
			setState(1142);
			match(LAMBDA);
			setState(1143);
			expression();
			setState(1144);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabeledBlockContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(JavaLanguageParser.LAMBDA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchLabeledBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchLabeledBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledBlockContext switchLabeledBlock() throws RecognitionException {
		SwitchLabeledBlockContext _localctx = new SwitchLabeledBlockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_switchLabeledBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			switchLabel();
			setState(1147);
			match(LAMBDA);
			setState(1148);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabeledThrowContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(JavaLanguageParser.LAMBDA, 0); }
		public TerminalNode LITERAL_THROW() { return getToken(JavaLanguageParser.LITERAL_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public SwitchLabeledThrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledThrow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchLabeledThrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabeledThrowContext switchLabeledThrow() throws RecognitionException {
		SwitchLabeledThrowContext _localctx = new SwitchLabeledThrowContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switchLabeledThrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			switchLabel();
			setState(1151);
			match(LAMBDA);
			setState(1152);
			match(LITERAL_THROW);
			setState(1153);
			expression();
			setState(1154);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode LITERAL_ELSE() { return getToken(JavaLanguageParser.LITERAL_ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(LITERAL_ELSE);
			setState(1157);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode LITERAL_CATCH() { return getToken(JavaLanguageParser.LITERAL_CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public CatchParameterContext catchParameter() {
			return getRuleContext(CatchParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(LITERAL_CATCH);
			setState(1160);
			match(LPAREN);
			setState(1161);
			catchParameter();
			setState(1162);
			match(RPAREN);
			setState(1163);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier;
		public List<VariableModifierContext> mods = new ArrayList<VariableModifierContext>();
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCatchParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchParameterContext catchParameter() throws RecognitionException {
		CatchParameterContext _localctx = new CatchParameterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_catchParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					((CatchParameterContext)_localctx).variableModifier = variableModifier();
					((CatchParameterContext)_localctx).mods.add(((CatchParameterContext)_localctx).variableModifier);
					}
					} 
				}
				setState(1170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1171);
			catchType();
			setState(1172);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<TerminalNode> BOR() { return getTokens(JavaLanguageParser.BOR); }
		public TerminalNode BOR(int i) {
			return getToken(JavaLanguageParser.BOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			classOrInterfaceType(false);
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOR) {
				{
				{
				setState(1175);
				match(BOR);
				setState(1176);
				classOrInterfaceType(false);
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode LITERAL_FINALLY() { return getToken(JavaLanguageParser.LITERAL_FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(LITERAL_FINALLY);
			setState(1183);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaLanguageParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(LPAREN);
			setState(1186);
			resources();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1187);
				match(SEMI);
				}
			}

			setState(1190);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaLanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaLanguageParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			resource();
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1193);
					match(SEMI);
					setState(1194);
					resource();
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public ResourceDeclarationContext resourceDeclaration() {
			return getRuleContext(ResourceDeclarationContext.class,0);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_resource);
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				resourceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				variableAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier;
		public List<VariableModifierContext> mods = new ArrayList<VariableModifierContext>();
		public ClassOrInterfaceTypeContext type;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaLanguageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitResourceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceDeclarationContext resourceDeclaration() throws RecognitionException {
		ResourceDeclarationContext _localctx = new ResourceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_resourceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1204);
					((ResourceDeclarationContext)_localctx).variableModifier = variableModifier();
					((ResourceDeclarationContext)_localctx).mods.add(((ResourceDeclarationContext)_localctx).variableModifier);
					}
					} 
				}
				setState(1209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(1210);
			((ResourceDeclarationContext)_localctx).type = classOrInterfaceType(true);
			setState(1211);
			variableDeclaratorId(_localctx.mods, _localctx.type);
			setState(1212);
			match(ASSIGN);
			setState(1213);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAccessContext extends ParserRuleContext {
		public FieldAccessNoIdentContext fieldAccessNoIdent;
		public List<FieldAccessNoIdentContext> accessList = new ArrayList<FieldAccessNoIdentContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LITERAL_THIS() { return getToken(JavaLanguageParser.LITERAL_THIS, 0); }
		public List<FieldAccessNoIdentContext> fieldAccessNoIdent() {
			return getRuleContexts(FieldAccessNoIdentContext.class);
		}
		public FieldAccessNoIdentContext fieldAccessNoIdent(int i) {
			return getRuleContext(FieldAccessNoIdentContext.class,i);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitVariableAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_variableAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1215);
					((VariableAccessContext)_localctx).fieldAccessNoIdent = fieldAccessNoIdent();
					((VariableAccessContext)_localctx).accessList.add(((VariableAccessContext)_localctx).fieldAccessNoIdent);
					}
					} 
				}
				setState(1220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				{
				setState(1221);
				id();
				}
				break;
			case LITERAL_THIS:
				{
				setState(1222);
				match(LITERAL_THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessNoIdentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public FieldAccessNoIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccessNoIdent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFieldAccessNoIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessNoIdentContext fieldAccessNoIdent() throws RecognitionException {
		FieldAccessNoIdentContext _localctx = new FieldAccessNoIdentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fieldAccessNoIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			expr(0);
			setState(1226);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public BlockStatementContext blockStatement;
		public List<BlockStatementContext> slists = new ArrayList<BlockStatementContext>();
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1228);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1233);
					((SwitchBlockStatementGroupContext)_localctx).blockStatement = blockStatement();
					((SwitchBlockStatementGroupContext)_localctx).slists.add(((SwitchBlockStatementGroupContext)_localctx).blockStatement);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	 
		public SwitchLabelContext() { }
		public void copyFrom(SwitchLabelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultLabelContext extends SwitchLabelContext {
		public TerminalNode LITERAL_DEFAULT() { return getToken(JavaLanguageParser.LITERAL_DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public DefaultLabelContext(SwitchLabelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitDefaultLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseLabelContext extends SwitchLabelContext {
		public TerminalNode LITERAL_CASE() { return getToken(JavaLanguageParser.LITERAL_CASE, 0); }
		public CaseConstantsContext caseConstants() {
			return getRuleContext(CaseConstantsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public CaseLabelContext(SwitchLabelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_switchLabel);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_CASE:
				_localctx = new CaseLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(LITERAL_CASE);
				setState(1239);
				caseConstants();
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1240);
					match(COLON);
					}
					break;
				}
				}
				break;
			case LITERAL_DEFAULT:
				_localctx = new DefaultLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(LITERAL_DEFAULT);
				setState(1245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1244);
					match(COLON);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseConstantsContext extends ParserRuleContext {
		public List<CaseConstantContext> caseConstant() {
			return getRuleContexts(CaseConstantContext.class);
		}
		public CaseConstantContext caseConstant(int i) {
			return getRuleContext(CaseConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public CaseConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCaseConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConstantsContext caseConstants() throws RecognitionException {
		CaseConstantsContext _localctx = new CaseConstantsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_caseConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			caseConstant();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1250);
					match(COMMA);
					setState(1251);
					caseConstant();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseConstantContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LITERAL_DEFAULT() { return getToken(JavaLanguageParser.LITERAL_DEFAULT, 0); }
		public CaseConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCaseConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConstantContext caseConstant() throws RecognitionException {
		CaseConstantContext _localctx = new CaseConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_caseConstant);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
				match(LITERAL_DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
	 
		public ForControlContext() { }
		public void copyFrom(ForControlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForContext extends ForControlContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public EnhancedForControlWithRecordPatternContext enhancedForControlWithRecordPattern() {
			return getRuleContext(EnhancedForControlWithRecordPatternContext.class,0);
		}
		public EnhancedForContext(ForControlContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnhancedFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForForContext extends ForControlContext {
		public ExpressionContext forCond;
		public ExpressionListContext forUpdate;
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JavaLanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaLanguageParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForForContext(ForControlContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitForFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_forControl);
		int _la;
		try {
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new EnhancedForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				match(LPAREN);
				setState(1265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1263);
					enhancedForControl();
					}
					break;
				case 2:
					{
					setState(1264);
					enhancedForControlWithRecordPattern();
					}
					break;
				}
				setState(1267);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ForForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				match(LPAREN);
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 37156484702796807L) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 35184372117491L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4385166758159L) != 0)) {
					{
					setState(1270);
					forInit();
					}
				}

				setState(1273);
				match(SEMI);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
					{
					setState(1274);
					((ForForContext)_localctx).forCond = expression();
					}
				}

				setState(1277);
				match(SEMI);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
					{
					setState(1278);
					((ForForContext)_localctx).forUpdate = expressionList();
					}
				}

				setState(1281);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_forInit);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifierContext variableModifier;
		public List<VariableModifierContext> mods = new ArrayList<VariableModifierContext>();
		public TypeTypeContext type;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1288);
					((EnhancedForControlContext)_localctx).variableModifier = variableModifier();
					((EnhancedForControlContext)_localctx).mods.add(((EnhancedForControlContext)_localctx).variableModifier);
					}
					} 
				}
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1294);
			((EnhancedForControlContext)_localctx).type = typeType(true);
			setState(1295);
			variableDeclaratorId(_localctx.mods, _localctx.type);
			setState(1296);
			match(COLON);
			setState(1297);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlWithRecordPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlWithRecordPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControlWithRecordPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitEnhancedForControlWithRecordPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlWithRecordPatternContext enhancedForControlWithRecordPattern() throws RecognitionException {
		EnhancedForControlWithRecordPatternContext _localctx = new EnhancedForControlWithRecordPatternContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enhancedForControlWithRecordPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			pattern();
			setState(1300);
			match(COLON);
			setState(1301);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(LPAREN);
			setState(1304);
			expression();
			setState(1305);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext startExp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			((ExpressionListContext)_localctx).startExp = expression();
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1308);
				match(COMMA);
				setState(1309);
				expression();
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RefOpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public RefOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRefOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL_SUPER() { return getToken(JavaLanguageParser.LITERAL_SUPER, 0); }
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public SuperExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSuperExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanceOfExpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL_INSTANCEOF() { return getToken(JavaLanguageParser.LITERAL_INSTANCEOF, 0); }
		public PrimaryPatternContext primaryPattern() {
			return getRuleContext(PrimaryPatternContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public InstanceOfExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInstanceOfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitShiftContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(JavaLanguageParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaLanguageParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaLanguageParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaLanguageParser.GT, i);
		}
		public BitShiftContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBitShift(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpContext extends ExprContext {
		public TerminalNode LITERAL_NEW() { return getToken(JavaLanguageParser.LITERAL_NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JavaLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaLanguageParser.MINUS, 0); }
		public TerminalNode INC() { return getToken(JavaLanguageParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaLanguageParser.DEC, 0); }
		public TerminalNode BNOT() { return getToken(JavaLanguageParser.BNOT, 0); }
		public TerminalNode LNOT() { return getToken(JavaLanguageParser.LNOT, 0); }
		public PrefixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExpContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TypeCastParametersContext typeCastParameters() {
			return getRuleContext(TypeCastParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CastExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCastExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(JavaLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLanguageParser.RBRACK, 0); }
		public IndexOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitIndexOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvOpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InvOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInvOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitExpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL_NEW() { return getToken(JavaLanguageParser.LITERAL_NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public InitExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleMethodCallContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SimpleMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSimpleMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpContext extends ExprContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(JavaLanguageParser.LAMBDA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLambdaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL_THIS() { return getToken(JavaLanguageParser.LITERAL_THIS, 0); }
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public ThisExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitThisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ExprContext {
		public Token postfix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(JavaLanguageParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaLanguageParser.DEC, 0); }
		public PostfixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodRefContext extends ExprContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(JavaLanguageParser.DOUBLE_COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LITERAL_NEW() { return getToken(JavaLanguageParser.LITERAL_NEW, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMethodRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryOpContext extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JavaLanguageParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaLanguageParser.QUESTION, 0); }
		public TernaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends ExprContext {
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(JavaLanguageParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(JavaLanguageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaLanguageParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(JavaLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaLanguageParser.MINUS, 0); }
		public TerminalNode LE() { return getToken(JavaLanguageParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaLanguageParser.GE, 0); }
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(JavaLanguageParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JavaLanguageParser.NOT_EQUAL, 0); }
		public TerminalNode BAND() { return getToken(JavaLanguageParser.BAND, 0); }
		public TerminalNode BXOR() { return getToken(JavaLanguageParser.BXOR, 0); }
		public TerminalNode BOR() { return getToken(JavaLanguageParser.BOR, 0); }
		public TerminalNode LAND() { return getToken(JavaLanguageParser.LAND, 0); }
		public TerminalNode LOR() { return getToken(JavaLanguageParser.LOR, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaLanguageParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(JavaLanguageParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(JavaLanguageParser.MINUS_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(JavaLanguageParser.STAR_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaLanguageParser.DIV_ASSIGN, 0); }
		public TerminalNode BAND_ASSIGN() { return getToken(JavaLanguageParser.BAND_ASSIGN, 0); }
		public TerminalNode BOR_ASSIGN() { return getToken(JavaLanguageParser.BOR_ASSIGN, 0); }
		public TerminalNode BXOR_ASSIGN() { return getToken(JavaLanguageParser.BXOR_ASSIGN, 0); }
		public TerminalNode SR_ASSIGN() { return getToken(JavaLanguageParser.SR_ASSIGN, 0); }
		public TerminalNode BSR_ASSIGN() { return getToken(JavaLanguageParser.BSR_ASSIGN, 0); }
		public TerminalNode SL_ASSIGN() { return getToken(JavaLanguageParser.SL_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaLanguageParser.MOD_ASSIGN, 0); }
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ExprContext {
		public Token bop;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1318);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new SimpleMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1319);
				id();
				setState(1320);
				match(LPAREN);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
					{
					setState(1321);
					expressionList();
					}
				}

				setState(1324);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new NewExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1326);
				match(LITERAL_NEW);
				setState(1327);
				creator();
				}
				break;
			case 4:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1328);
				((PrefixContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 51L) != 0)) ) {
					((PrefixContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1329);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new PrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1330);
				((PrefixContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BNOT || _la==LNOT) ) {
					((PrefixContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1331);
				expr(19);
				}
				break;
			case 6:
				{
				_localctx = new MethodRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1332);
				typeType(false);
				setState(1333);
				match(DOUBLE_COLON);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1334);
					typeArguments();
					}
				}

				setState(1339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
				case LITERAL_RECORD:
				case LITERAL_YIELD:
				case LITERAL_NON_SEALED:
				case LITERAL_SEALED:
				case LITERAL_PERMITS:
				case LITERAL_WHEN:
				case LITERAL_UNDERSCORE:
					{
					setState(1337);
					id();
					}
					break;
				case LITERAL_NEW:
					{
					setState(1338);
					match(LITERAL_NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				{
				_localctx = new MethodRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1341);
				classType();
				setState(1342);
				match(DOUBLE_COLON);
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1343);
					typeArguments();
					}
				}

				setState(1346);
				match(LITERAL_NEW);
				}
				break;
			case 8:
				{
				_localctx = new CastExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1348);
				match(LPAREN);
				setState(1349);
				typeCastParameters();
				setState(1350);
				match(RPAREN);
				setState(1351);
				expr(15);
				}
				break;
			case 9:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1353);
				lambdaParameters();
				setState(1354);
				match(LAMBDA);
				setState(1357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_VOID:
				case LITERAL_BOOLEAN:
				case LITERAL_BYTE:
				case LITERAL_CHAR:
				case LITERAL_SHORT:
				case LITERAL_INT:
				case LITERAL_FLOAT:
				case LITERAL_LONG:
				case LITERAL_DOUBLE:
				case IDENT:
				case LPAREN:
				case LITERAL_THIS:
				case LITERAL_SUPER:
				case LITERAL_SWITCH:
				case PLUS:
				case MINUS:
				case INC:
				case DEC:
				case BNOT:
				case LNOT:
				case LITERAL_TRUE:
				case LITERAL_FALSE:
				case LITERAL_NULL:
				case LITERAL_NEW:
				case CHAR_LITERAL:
				case STRING_LITERAL:
				case AT:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
				case HEX_FLOAT_LITERAL:
				case HEX_DOUBLE_LITERAL:
				case LITERAL_RECORD:
				case TEXT_BLOCK_LITERAL_BEGIN:
				case LITERAL_YIELD:
				case LITERAL_NON_SEALED:
				case LITERAL_SEALED:
				case LITERAL_PERMITS:
				case LITERAL_WHEN:
				case LITERAL_UNDERSCORE:
				case DECIMAL_LITERAL_LONG:
				case DECIMAL_LITERAL:
				case HEX_LITERAL_LONG:
				case HEX_LITERAL:
				case OCT_LITERAL_LONG:
				case OCT_LITERAL:
				case BINARY_LITERAL_LONG:
				case BINARY_LITERAL:
					{
					setState(1355);
					expr(0);
					}
					break;
				case LCURLY:
					{
					setState(1356);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1471);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1361);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1362);
						((BinOpContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==DIV || _la==MOD) ) {
							((BinOpContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1363);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1364);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1365);
						((BinOpContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinOpContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1366);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1367);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1368);
							match(LT);
							setState(1369);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1370);
							match(GT);
							setState(1371);
							match(GT);
							setState(1372);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1373);
							match(GT);
							setState(1374);
							match(GT);
							}
							break;
						}
						setState(1377);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1378);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1379);
						((BinOpContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 15L) != 0)) ) {
							((BinOpContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1380);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1381);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1382);
						((BinOpContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NOT_EQUAL || _la==EQUAL) ) {
							((BinOpContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1383);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1384);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1385);
						((BinOpContext)_localctx).bop = match(BAND);
						setState(1386);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1387);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1388);
						((BinOpContext)_localctx).bop = match(BXOR);
						setState(1389);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1390);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1391);
						((BinOpContext)_localctx).bop = match(BOR);
						setState(1392);
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1393);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1394);
						((BinOpContext)_localctx).bop = match(LAND);
						setState(1395);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1396);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1397);
						((BinOpContext)_localctx).bop = match(LOR);
						setState(1398);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new TernaryOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1399);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1400);
						((TernaryOpContext)_localctx).bop = match(QUESTION);
						setState(1401);
						expr(0);
						setState(1402);
						match(COLON);
						setState(1403);
						expr(3);
						}
						break;
					case 12:
						{
						_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1405);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1406);
						((BinOpContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 536608769L) != 0)) ) {
							((BinOpContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1407);
						expr(2);
						}
						break;
					case 13:
						{
						_localctx = new RefOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1408);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1409);
						((RefOpContext)_localctx).bop = match(DOT);
						setState(1410);
						id();
						}
						break;
					case 14:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1411);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1412);
						((MethodCallContext)_localctx).bop = match(DOT);
						setState(1413);
						id();
						setState(1414);
						match(LPAREN);
						setState(1416);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
							{
							setState(1415);
							expressionList();
							}
						}

						setState(1418);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ThisExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1420);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1421);
						((ThisExpContext)_localctx).bop = match(DOT);
						setState(1422);
						match(LITERAL_THIS);
						}
						break;
					case 16:
						{
						_localctx = new InitExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1423);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1424);
						((InitExpContext)_localctx).bop = match(DOT);
						setState(1425);
						match(LITERAL_NEW);
						setState(1427);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1426);
							nonWildcardTypeArguments();
							}
						}

						setState(1429);
						innerCreator();
						}
						break;
					case 17:
						{
						_localctx = new SuperExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1430);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1431);
						((SuperExpContext)_localctx).bop = match(DOT);
						setState(1433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1432);
							nonWildcardTypeArguments();
							}
						}

						setState(1435);
						match(LITERAL_SUPER);
						setState(1437);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1436);
							superSuffix();
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new InvOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1439);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1440);
						((InvOpContext)_localctx).bop = match(DOT);
						setState(1441);
						nonWildcardTypeArguments();
						setState(1442);
						id();
						setState(1443);
						match(LPAREN);
						setState(1445);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
							{
							setState(1444);
							expressionList();
							}
						}

						setState(1447);
						match(RPAREN);
						}
						break;
					case 19:
						{
						_localctx = new IndexOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1449);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1450);
						match(LBRACK);
						setState(1451);
						expr(0);
						setState(1452);
						match(RBRACK);
						}
						break;
					case 20:
						{
						_localctx = new PostfixContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1454);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1455);
						((PostfixContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((PostfixContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 21:
						{
						_localctx = new MethodRefContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1456);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1457);
						match(DOUBLE_COLON);
						setState(1459);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1458);
							typeArguments();
							}
						}

						setState(1463);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENT:
						case LITERAL_RECORD:
						case LITERAL_YIELD:
						case LITERAL_NON_SEALED:
						case LITERAL_SEALED:
						case LITERAL_PERMITS:
						case LITERAL_WHEN:
						case LITERAL_UNDERSCORE:
							{
							setState(1461);
							id();
							}
							break;
						case LITERAL_NEW:
							{
							setState(1462);
							match(LITERAL_NEW);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 22:
						{
						_localctx = new InstanceOfExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1465);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1466);
						((InstanceOfExpContext)_localctx).bop = match(LITERAL_INSTANCEOF);
						setState(1469);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1467);
							primaryPattern();
							}
							break;
						case 2:
							{
							setState(1468);
							typeType(true);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastParametersContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BAND() { return getTokens(JavaLanguageParser.BAND); }
		public TerminalNode BAND(int i) {
			return getToken(JavaLanguageParser.BAND, i);
		}
		public TypeCastParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeCastParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastParametersContext typeCastParameters() throws RecognitionException {
		TypeCastParametersContext _localctx = new TypeCastParametersContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeCastParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			typeType(true);
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAND) {
				{
				{
				setState(1477);
				match(BAND);
				setState(1478);
				typeType(true);
				}
				}
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
	 
		public LambdaParametersContext() { }
		public void copyFrom(LambdaParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleLambdaParamContext extends LambdaParametersContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SingleLambdaParamContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSingleLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiLambdaParamContext extends LambdaParametersContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public MultiLambdaParamsContext multiLambdaParams() {
			return getRuleContext(MultiLambdaParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public MultiLambdaParamContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMultiLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormalLambdaParamContext extends LambdaParametersContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalLambdaParamContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitFormalLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_lambdaParameters);
		int _la;
		try {
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				_localctx = new SingleLambdaParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				id();
				}
				break;
			case 2:
				_localctx = new FormalLambdaParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				match(LPAREN);
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575898352105816064L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 18035977498918913L) != 0)) {
					{
					setState(1486);
					formalParameterList();
					}
				}

				setState(1489);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new MultiLambdaParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(LPAREN);
				setState(1491);
				multiLambdaParams();
				setState(1492);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiLambdaParamsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public MultiLambdaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLambdaParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitMultiLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLambdaParamsContext multiLambdaParams() throws RecognitionException {
		MultiLambdaParamsContext _localctx = new MultiLambdaParamsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multiLambdaParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			id();
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1497);
				match(COMMA);
				setState(1498);
				id();
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPrimaryContext extends PrimaryContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ParenPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitParenPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchPrimaryContext extends PrimaryContext {
		public SwitchExpressionOrStatementContext switchExpressionOrStatement() {
			return getRuleContext(SwitchExpressionOrStatementContext.class,0);
		}
		public SwitchPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSwitchPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitivePrimaryContext extends PrimaryContext {
		public PrimitiveTypeContext type;
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public TerminalNode LITERAL_CLASS() { return getToken(JavaLanguageParser.LITERAL_CLASS, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public PrimitivePrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPrimitivePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TokenPrimaryContext extends PrimaryContext {
		public TerminalNode LITERAL_THIS() { return getToken(JavaLanguageParser.LITERAL_THIS, 0); }
		public TerminalNode LITERAL_SUPER() { return getToken(JavaLanguageParser.LITERAL_SUPER, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TokenPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTokenPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassRefPrimaryContext extends PrimaryContext {
		public ClassOrInterfaceTypeContext type;
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public TerminalNode LITERAL_CLASS() { return getToken(JavaLanguageParser.LITERAL_CLASS, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public ClassRefPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassRefPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPrimaryContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitLiteralPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_primary);
		int _la;
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new SwitchPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
				switchExpressionOrStatement();
				}
				break;
			case 2:
				_localctx = new ParenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				match(LPAREN);
				setState(1506);
				expr(0);
				setState(1507);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new TokenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				match(LITERAL_THIS);
				}
				break;
			case 4:
				_localctx = new TokenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1510);
				match(LITERAL_SUPER);
				}
				break;
			case 5:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1511);
				literal();
				}
				break;
			case 6:
				_localctx = new TokenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1512);
				id();
				}
				break;
			case 7:
				_localctx = new ClassRefPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1513);
				((ClassRefPrimaryContext)_localctx).type = classOrInterfaceType(false);
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==AT) {
					{
					{
					setState(1514);
					arrayDeclarator();
					}
					}
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1520);
				match(DOT);
				setState(1521);
				match(LITERAL_CLASS);
				}
				break;
			case 8:
				_localctx = new PrimitivePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1523);
				((PrimitivePrimaryContext)_localctx).type = primitiveType();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==AT) {
					{
					{
					setState(1524);
					arrayDeclarator();
					}
					}
					setState(1529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1530);
				match(DOT);
				setState(1531);
				match(LITERAL_CLASS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassTypeContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1535);
				classOrInterfaceType(false);
				setState(1536);
				match(DOT);
				}
				break;
			}
			setState(1540);
			annotations(false);
			setState(1541);
			id();
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1542);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_creator);
		try {
			setState(1557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				nonWildcardTypeArguments();
				setState(1546);
				createdName();
				setState(1547);
				classCreatorRest();
				}
				break;
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
			case IDENT:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				annotations(false);
				setState(1550);
				createdName();
				setState(1555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
				case AT:
					{
					setState(1551);
					annotations(false);
					setState(1552);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1554);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameContext extends ParserRuleContext {
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
	 
		public CreatedNameContext() { }
		public void copyFrom(CreatedNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNamePrimitiveContext extends CreatedNameContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNamePrimitiveContext(CreatedNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCreatedNamePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameObjectContext extends CreatedNameContext {
		public CreatedNameExtendedContext createdNameExtended;
		public List<CreatedNameExtendedContext> extended = new ArrayList<CreatedNameExtendedContext>();
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public List<CreatedNameExtendedContext> createdNameExtended() {
			return getRuleContexts(CreatedNameExtendedContext.class);
		}
		public CreatedNameExtendedContext createdNameExtended(int i) {
			return getRuleContext(CreatedNameExtendedContext.class,i);
		}
		public CreatedNameObjectContext(CreatedNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCreatedNameObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_createdName);
		int _la;
		try {
			setState(1571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				_localctx = new CreatedNameObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				annotations(false);
				setState(1560);
				id();
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1561);
					typeArgumentsOrDiamond();
					}
				}

				setState(1567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1564);
					((CreatedNameObjectContext)_localctx).createdNameExtended = createdNameExtended();
					((CreatedNameObjectContext)_localctx).extended.add(((CreatedNameObjectContext)_localctx).createdNameExtended);
					}
					}
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
				_localctx = new CreatedNamePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameExtendedContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public CreatedNameExtendedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdNameExtended; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitCreatedNameExtended(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameExtendedContext createdNameExtended() throws RecognitionException {
		CreatedNameExtendedContext _localctx = new CreatedNameExtendedContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_createdNameExtended);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(DOT);
			setState(1574);
			annotations(false);
			setState(1575);
			id();
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1576);
				typeArgumentsOrDiamond();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerCreatorContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			annotations(false);
			setState(1580);
			id();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1581);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1584);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JavaLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLanguageParser.RBRACK, 0); }
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public List<BracketsWithExpContext> bracketsWithExp() {
			return getRuleContexts(BracketsWithExpContext.class);
		}
		public BracketsWithExpContext bracketsWithExp(int i) {
			return getRuleContext(BracketsWithExpContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(LBRACK);
			setState(1609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1587);
				match(RBRACK);
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==AT) {
					{
					{
					setState(1588);
					arrayDeclarator();
					}
					}
					setState(1593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1594);
				arrayInitializer();
				}
				break;
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
			case IDENT:
			case LPAREN:
			case LITERAL_THIS:
			case LITERAL_SUPER:
			case LITERAL_SWITCH:
			case PLUS:
			case MINUS:
			case INC:
			case DEC:
			case BNOT:
			case LNOT:
			case LITERAL_TRUE:
			case LITERAL_FALSE:
			case LITERAL_NULL:
			case LITERAL_NEW:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case AT:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case HEX_FLOAT_LITERAL:
			case HEX_DOUBLE_LITERAL:
			case LITERAL_RECORD:
			case TEXT_BLOCK_LITERAL_BEGIN:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
			case DECIMAL_LITERAL_LONG:
			case DECIMAL_LITERAL:
			case HEX_LITERAL_LONG:
			case HEX_LITERAL:
			case OCT_LITERAL_LONG:
			case OCT_LITERAL:
			case BINARY_LITERAL_LONG:
			case BINARY_LITERAL:
				{
				setState(1595);
				expression();
				setState(1596);
				match(RBRACK);
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1597);
						bracketsWithExp();
						}
						} 
					}
					setState(1602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1603);
						arrayDeclarator();
						}
						} 
					}
					setState(1608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketsWithExpContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaLanguageParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaLanguageParser.RBRACK, 0); }
		public BracketsWithExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketsWithExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitBracketsWithExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsWithExpContext bracketsWithExp() throws RecognitionException {
		BracketsWithExpContext _localctx = new BracketsWithExpContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_bracketsWithExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			annotations(false);
			setState(1612);
			match(LBRACK);
			setState(1613);
			expression();
			setState(1614);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			arguments();
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1617);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
	 
		public TypeArgumentsOrDiamondContext() { }
		public void copyFrom(TypeArgumentsOrDiamondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgsContext extends TypeArgumentsOrDiamondContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgsContext(TypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiamondContext extends TypeArgumentsOrDiamondContext {
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public DiamondContext(TypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_typeArgumentsOrDiamond);
		try {
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				_localctx = new DiamondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				match(LT);
				setState(1621);
				match(GT);
				}
				break;
			case 2:
				_localctx = new TypeArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
	 
		public NonWildcardTypeArgumentsOrDiamondContext() { }
		public void copyFrom(NonWildcardTypeArgumentsOrDiamondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardDiamondContext extends NonWildcardTypeArgumentsOrDiamondContext {
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public NonWildcardDiamondContext(NonWildcardTypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitNonWildcardDiamond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgsContext extends NonWildcardTypeArgumentsOrDiamondContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgsContext(NonWildcardTypeArgumentsOrDiamondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				_localctx = new NonWildcardDiamondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				match(LT);
				setState(1626);
				match(GT);
				}
				break;
			case 2:
				_localctx = new NonWildcardTypeArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1627);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public TypeArgumentsTypeListContext typeArgumentsTypeList() {
			return getRuleContext(TypeArgumentsTypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(LT);
			setState(1631);
			typeArgumentsTypeList();
			setState(1632);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsTypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public TypeArgumentsTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeArgumentsTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsTypeListContext typeArgumentsTypeList() throws RecognitionException {
		TypeArgumentsTypeListContext _localctx = new TypeArgumentsTypeListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_typeArgumentsTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			typeType(false);
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1635);
				match(COMMA);
				setState(1636);
				typeType(false);
				}
				}
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			typeType(false);
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1643);
				match(COMMA);
				setState(1644);
				typeType(false);
				}
				}
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTypeContext extends ParserRuleContext {
		public boolean createImaginaryNode;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() {
			return getRuleContext(ClassOrInterfaceOrPrimitiveTypeContext.class,0);
		}
		public List<ArrayDeclaratorContext> arrayDeclarator() {
			return getRuleContexts(ArrayDeclaratorContext.class);
		}
		public ArrayDeclaratorContext arrayDeclarator(int i) {
			return getRuleContext(ArrayDeclaratorContext.class,i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeTypeContext(ParserRuleContext parent, int invokingState, boolean createImaginaryNode) {
			super(parent, invokingState);
			this.createImaginaryNode = createImaginaryNode;
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType(boolean createImaginaryNode) throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState(), createImaginaryNode);
		enterRule(_localctx, 254, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			annotations(false);
			setState(1651);
			classOrInterfaceOrPrimitiveType();
			setState(1655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1652);
					arrayDeclarator();
					}
					} 
				}
				setState(1657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceOrPrimitiveTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceOrPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceOrPrimitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitClassOrInterfaceOrPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceOrPrimitiveTypeContext classOrInterfaceOrPrimitiveType() throws RecognitionException {
		ClassOrInterfaceOrPrimitiveTypeContext _localctx = new ClassOrInterfaceOrPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_classOrInterfaceOrPrimitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case AT:
			case LITERAL_RECORD:
			case LITERAL_YIELD:
			case LITERAL_NON_SEALED:
			case LITERAL_SEALED:
			case LITERAL_PERMITS:
			case LITERAL_WHEN:
			case LITERAL_UNDERSCORE:
				{
				setState(1658);
				classOrInterfaceType(false);
				}
				break;
			case LITERAL_VOID:
			case LITERAL_BOOLEAN:
			case LITERAL_BYTE:
			case LITERAL_CHAR:
			case LITERAL_SHORT:
			case LITERAL_INT:
			case LITERAL_FLOAT:
			case LITERAL_LONG:
			case LITERAL_DOUBLE:
				{
				setState(1659);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclaratorContext extends ParserRuleContext {
		public AnnotationsContext anno;
		public TerminalNode LBRACK() { return getToken(JavaLanguageParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaLanguageParser.RBRACK, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclaratorContext arrayDeclarator() throws RecognitionException {
		ArrayDeclaratorContext _localctx = new ArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			((ArrayDeclaratorContext)_localctx).anno = annotations(false);
			setState(1663);
			match(LBRACK);
			setState(1664);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode LITERAL_BOOLEAN() { return getToken(JavaLanguageParser.LITERAL_BOOLEAN, 0); }
		public TerminalNode LITERAL_CHAR() { return getToken(JavaLanguageParser.LITERAL_CHAR, 0); }
		public TerminalNode LITERAL_BYTE() { return getToken(JavaLanguageParser.LITERAL_BYTE, 0); }
		public TerminalNode LITERAL_SHORT() { return getToken(JavaLanguageParser.LITERAL_SHORT, 0); }
		public TerminalNode LITERAL_INT() { return getToken(JavaLanguageParser.LITERAL_INT, 0); }
		public TerminalNode LITERAL_LONG() { return getToken(JavaLanguageParser.LITERAL_LONG, 0); }
		public TerminalNode LITERAL_FLOAT() { return getToken(JavaLanguageParser.LITERAL_FLOAT, 0); }
		public TerminalNode LITERAL_DOUBLE() { return getToken(JavaLanguageParser.LITERAL_DOUBLE, 0); }
		public TerminalNode LITERAL_VOID() { return getToken(JavaLanguageParser.LITERAL_VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 287667426198290432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaLanguageParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaLanguageParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(LT);
			setState(1669);
			typeArgument();
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1670);
				match(COMMA);
				setState(1671);
				typeArgument();
				}
				}
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1677);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixContext extends ParserRuleContext {
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
	 
		public SuperSuffixContext() { }
		public void copyFrom(SuperSuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixDotContext extends SuperSuffixContext {
		public TerminalNode DOT() { return getToken(JavaLanguageParser.DOT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperSuffixDotContext(SuperSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSuperSuffixDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixSimpleContext extends SuperSuffixContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperSuffixSimpleContext(SuperSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitSuperSuffixSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_superSuffix);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new SuperSuffixSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				match(LPAREN);
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
					{
					setState(1680);
					expressionList();
					}
				}

				setState(1683);
				match(RPAREN);
				}
				break;
			case DOT:
				_localctx = new SuperSuffixDotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				match(DOT);
				setState(1685);
				id();
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1686);
					match(LPAREN);
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
						{
						setState(1687);
						expressionList();
						}
					}

					setState(1690);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(LPAREN);
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & -2313161358608162803L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & -54021599296225279L) != 0)) {
				{
				setState(1696);
				expressionList();
				}
			}

			setState(1699);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public InnerPatternContext innerPattern() {
			return getRuleContext(InnerPatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			innerPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerPatternContext extends ParserRuleContext {
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public RecordPatternContext recordPattern() {
			return getRuleContext(RecordPatternContext.class,0);
		}
		public PrimaryPatternContext primaryPattern() {
			return getRuleContext(PrimaryPatternContext.class,0);
		}
		public InnerPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitInnerPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerPatternContext innerPattern() throws RecognitionException {
		InnerPatternContext _localctx = new InnerPatternContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_innerPattern);
		try {
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703);
				guardedPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				recordPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1705);
				primaryPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardedPatternContext extends ParserRuleContext {
		public PrimaryPatternContext primaryPattern() {
			return getRuleContext(PrimaryPatternContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitGuardedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_guardedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			primaryPattern();
			setState(1709);
			guard();
			setState(1710);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode LAND() { return getToken(JavaLanguageParser.LAND, 0); }
		public TerminalNode LITERAL_WHEN() { return getToken(JavaLanguageParser.LITERAL_WHEN, 0); }
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_la = _input.LA(1);
			if ( !(_la==LAND || _la==LITERAL_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryPatternContext extends ParserRuleContext {
		public PrimaryPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryPattern; }
	 
		public PrimaryPatternContext() { }
		public void copyFrom(PrimaryPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternVariableDefContext extends PrimaryPatternContext {
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public PatternVariableDefContext(PrimaryPatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPatternVariableDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPatternContext extends PrimaryPatternContext {
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public InnerPatternContext innerPattern() {
			return getRuleContext(InnerPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public ParenPatternContext(PrimaryPatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitParenPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecordPatternDefContext extends PrimaryPatternContext {
		public RecordPatternContext recordPattern() {
			return getRuleContext(RecordPatternContext.class,0);
		}
		public RecordPatternDefContext(PrimaryPatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordPatternDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryPatternContext primaryPattern() throws RecognitionException {
		PrimaryPatternContext _localctx = new PrimaryPatternContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_primaryPattern);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				_localctx = new PatternVariableDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				typePattern();
				}
				break;
			case 2:
				_localctx = new ParenPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				match(LPAREN);
				setState(1716);
				innerPattern();
				setState(1717);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new RecordPatternDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1719);
				recordPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypePatternContext extends ParserRuleContext {
		public TypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePattern; }
	 
		public TypePatternContext() { }
		public void copyFrom(TypePatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypePatternDefContext extends TypePatternContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public TypeTypeContext type;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypePatternDefContext(TypePatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitTypePatternDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnnamedPatternDefContext extends TypePatternContext {
		public TerminalNode LITERAL_UNDERSCORE() { return getToken(JavaLanguageParser.LITERAL_UNDERSCORE, 0); }
		public UnnamedPatternDefContext(TypePatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitUnnamedPatternDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePatternContext typePattern() throws RecognitionException {
		TypePatternContext _localctx = new TypePatternContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_typePattern);
		try {
			int _alt;
			setState(1732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				_localctx = new TypePatternDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1722);
						((TypePatternDefContext)_localctx).modifier = modifier();
						((TypePatternDefContext)_localctx).mods.add(((TypePatternDefContext)_localctx).modifier);
						}
						} 
					}
					setState(1727);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1728);
				((TypePatternDefContext)_localctx).type = typeType(true);
				setState(1729);
				id();
				}
				break;
			case 2:
				_localctx = new UnnamedPatternDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1731);
				match(LITERAL_UNDERSCORE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordPatternContext extends ParserRuleContext {
		public ModifierContext modifier;
		public List<ModifierContext> mods = new ArrayList<ModifierContext>();
		public TypeTypeContext type;
		public TerminalNode LPAREN() { return getToken(JavaLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaLanguageParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public RecordComponentPatternListContext recordComponentPatternList() {
			return getRuleContext(RecordComponentPatternListContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public RecordPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordPatternContext recordPattern() throws RecognitionException {
		RecordPatternContext _localctx = new RecordPatternContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_recordPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1734);
					((RecordPatternContext)_localctx).modifier = modifier();
					((RecordPatternContext)_localctx).mods.add(((RecordPatternContext)_localctx).modifier);
					}
					} 
				}
				setState(1739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1740);
			((RecordPatternContext)_localctx).type = typeType(true);
			setState(1741);
			match(LPAREN);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 36028935528512519L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 18035977498918913L) != 0)) {
				{
				setState(1742);
				recordComponentPatternList();
				}
			}

			setState(1745);
			match(RPAREN);
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1746);
				id();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordComponentPatternListContext extends ParserRuleContext {
		public List<InnerPatternContext> innerPattern() {
			return getRuleContexts(InnerPatternContext.class);
		}
		public InnerPatternContext innerPattern(int i) {
			return getRuleContext(InnerPatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public RecordComponentPatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentPatternList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitRecordComponentPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentPatternListContext recordComponentPatternList() throws RecognitionException {
		RecordComponentPatternListContext _localctx = new RecordComponentPatternListContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_recordComponentPatternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			innerPattern();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1750);
				match(COMMA);
				setState(1751);
				innerPattern();
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PermittedSubclassesAndInterfacesContext extends ParserRuleContext {
		public TerminalNode LITERAL_PERMITS() { return getToken(JavaLanguageParser.LITERAL_PERMITS, 0); }
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLanguageParser.COMMA, i);
		}
		public PermittedSubclassesAndInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permittedSubclassesAndInterfaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitPermittedSubclassesAndInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermittedSubclassesAndInterfacesContext permittedSubclassesAndInterfaces() throws RecognitionException {
		PermittedSubclassesAndInterfacesContext _localctx = new PermittedSubclassesAndInterfacesContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_permittedSubclassesAndInterfaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			match(LITERAL_PERMITS);
			setState(1758);
			classOrInterfaceType(false);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1759);
				match(COMMA);
				setState(1760);
				classOrInterfaceType(false);
				}
				}
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode LITERAL_UNDERSCORE() { return getToken(JavaLanguageParser.LITERAL_UNDERSCORE, 0); }
		public TerminalNode LITERAL_RECORD() { return getToken(JavaLanguageParser.LITERAL_RECORD, 0); }
		public TerminalNode LITERAL_YIELD() { return getToken(JavaLanguageParser.LITERAL_YIELD, 0); }
		public TerminalNode LITERAL_NON_SEALED() { return getToken(JavaLanguageParser.LITERAL_NON_SEALED, 0); }
		public TerminalNode LITERAL_SEALED() { return getToken(JavaLanguageParser.LITERAL_SEALED, 0); }
		public TerminalNode LITERAL_PERMITS() { return getToken(JavaLanguageParser.LITERAL_PERMITS, 0); }
		public TerminalNode IDENT() { return getToken(JavaLanguageParser.IDENT, 0); }
		public TerminalNode LITERAL_WHEN() { return getToken(JavaLanguageParser.LITERAL_WHEN, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLanguageParserVisitor ) return ((JavaLanguageParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !(_la==IDENT || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 16797313L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 77:
			return blockStatement_sempred((BlockStatementContext)_localctx, predIndex);
		case 109:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean blockStatement_sempred(BlockStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !isYieldStatement();
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 30);
		case 14:
			return precpred(_ctx, 29);
		case 15:
			return precpred(_ctx, 28);
		case 16:
			return precpred(_ctx, 27);
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 25);
		case 19:
			return precpred(_ctx, 24);
		case 20:
			return precpred(_ctx, 21);
		case 21:
			return precpred(_ctx, 18);
		case 22:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00e9\u06e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0001\u0000\u0003\u0000\u0122\b\u0000\u0001\u0000\u0005\u0000\u0125"+
		"\b\u0000\n\u0000\f\u0000\u0128\t\u0000\u0001\u0000\u0005\u0000\u012b\b"+
		"\u0000\n\u0000\f\u0000\u012e\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0139\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u013e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0143\b"+
		"\u0002\u0001\u0003\u0005\u0003\u0146\b\u0003\n\u0003\f\u0003\u0149\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003\u014d\b\u0003\u000b\u0003\f\u0003"+
		"\u014e\u0003\u0003\u0151\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0158\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0169\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u016d"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0172\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0175\b\u0007\u0001\u0007\u0003\u0007\u0178\b"+
		"\u0007\u0001\u0007\u0003\u0007\u017b\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0182\b\b\u0001\b\u0001\b\u0003\b\u0186\b\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u018c\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0193\b\n\n\n\f\n\u0196\t\n\u0001\n\u0001\n"+
		"\u0003\n\u019a\b\n\u0001\n\u0003\n\u019d\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\r\u01aa\b\r\n\r\f\r\u01ad\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b3\b\u000e\u0001\u000f\u0005\u000f\u01b6\b\u000f"+
		"\n\u000f\f\u000f\u01b9\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01c8\b\u0012\n"+
		"\u0012\f\u0012\u01cb\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01d2\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01db"+
		"\b\u0015\n\u0015\f\u0015\u01de\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u01e3\b\u0016\n\u0016\f\u0016\u01e6\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01eb\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01f1\b\u0018\u0001\u0018\u0003\u0018\u01f4"+
		"\b\u0018\u0001\u0018\u0003\u0018\u01f7\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01fe\b\u0019\n\u0019"+
		"\f\u0019\u0201\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0206\b\u001a\u0001\u001a\u0003\u001a\u0209\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u020d\b\u001b\n\u001b\f\u001b\u0210\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0215\b\u001c\u0001\u001c\u0003\u001c"+
		"\u0218\b\u001c\u0001\u001c\u0003\u001c\u021b\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0224\b\u001e\n\u001e\f\u001e\u0227\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u022d\b\u001f\n\u001f\f\u001f\u0230"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0236\b \u0001 "+
		"\u0001 \u0005 \u023a\b \n \f \u023d\t \u0001 \u0003 \u0240\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u024a\b!\u0001\"\u0003"+
		"\"\u024d\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0253\b\"\n\"\f\""+
		"\u0256\t\"\u0001\"\u0003\"\u0259\b\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u025f\b#\u0001$\u0001$\u0001$\u0001%\u0003%\u0265\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u026a\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0005"+
		"\'\u0273\b\'\n\'\f\'\u0276\t\'\u0001\'\u0001\'\u0003\'\u027a\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0283\b(\u0001)\u0003"+
		")\u0286\b)\u0001)\u0001)\u0001)\u0001)\u0005)\u028c\b)\n)\f)\u028f\t)"+
		"\u0001)\u0003)\u0292\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u0299"+
		"\b*\n*\f*\u029c\t*\u0001+\u0001+\u0005+\u02a0\b+\n+\f+\u02a3\t+\u0001"+
		"+\u0001+\u0003+\u02a7\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u02ad\b,\u0003"+
		",\u02af\b,\u0001,\u0005,\u02b2\b,\n,\f,\u02b5\t,\u0001-\u0001-\u0003-"+
		"\u02b9\b-\u0001.\u0001.\u0001.\u0001.\u0005.\u02bf\b.\n.\f.\u02c2\t.\u0003"+
		".\u02c4\b.\u0001.\u0003.\u02c7\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003"+
		"/\u02ce\b/\u0001/\u0005/\u02d1\b/\n/\f/\u02d4\t/\u00010\u00010\u00010"+
		"\u00010\u00030\u02da\b0\u00011\u00011\u00011\u00011\u00011\u00031\u02e1"+
		"\b1\u00011\u00031\u02e4\b1\u00031\u02e6\b1\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00052\u02ee\b2\n2\f2\u02f1\t2\u00013\u00013\u00033\u02f5"+
		"\b3\u00013\u00013\u00014\u00014\u00014\u00054\u02fc\b4\n4\f4\u02ff\t4"+
		"\u00014\u00014\u00034\u0303\b4\u00014\u00034\u0306\b4\u00015\u00055\u0309"+
		"\b5\n5\f5\u030c\t5\u00015\u00015\u00015\u00016\u00056\u0312\b6\n6\f6\u0315"+
		"\t6\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00057\u031e\b7\n"+
		"7\f7\u0321\t7\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019"+
		"\u00019\u00019\u00019\u00019\u00039\u032f\b9\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001=\u0005=\u033a\b=\n=\f=\u033d\t=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u0344\b>\u0001>\u0003>\u0347\b>\u0001"+
		"?\u0001?\u0001?\u0005?\u034c\b?\n?\f?\u034f\t?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0003A\u0358\bA\u0001B\u0001B\u0001B\u0001B\u0005"+
		"B\u035e\bB\nB\fB\u0361\tB\u0003B\u0363\bB\u0001B\u0003B\u0366\bB\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0005D\u0371"+
		"\bD\nD\fD\u0374\tD\u0001D\u0001D\u0001E\u0005E\u0379\bE\nE\fE\u037c\t"+
		"E\u0001E\u0001E\u0003E\u0380\bE\u0001F\u0001F\u0001F\u0003F\u0385\bF\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u038e\bF\u0001F\u0001"+
		"F\u0003F\u0392\bF\u0001F\u0001F\u0003F\u0396\bF\u0001F\u0001F\u0003F\u039a"+
		"\bF\u0001F\u0001F\u0003F\u039e\bF\u0003F\u03a0\bF\u0001G\u0001G\u0001"+
		"G\u0001G\u0005G\u03a6\bG\nG\fG\u03a9\tG\u0001G\u0003G\u03ac\bG\u0001H"+
		"\u0001H\u0001I\u0001I\u0001I\u0001J\u0001J\u0003J\u03b5\bJ\u0001J\u0005"+
		"J\u03b8\bJ\nJ\fJ\u03bb\tJ\u0001J\u0001J\u0001K\u0003K\u03c0\bK\u0001K"+
		"\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03c9\bK\u0001K\u0001"+
		"K\u0001K\u0001K\u0003K\u03cf\bK\u0001L\u0001L\u0005L\u03d3\bL\nL\fL\u03d6"+
		"\tL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u03e0"+
		"\bM\u0001N\u0005N\u03e3\bN\nN\fN\u03e6\tN\u0001N\u0001N\u0001N\u0001O"+
		"\u0005O\u03ec\bO\nO\fO\u03ef\tO\u0001O\u0001O\u0001O\u0001O\u0003O\u03f5"+
		"\bO\u0001O\u0003O\u03f8\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u03ff"+
		"\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0407\bP\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0004P\u041a\bP\u000bP\fP\u041b\u0001"+
		"P\u0003P\u041f\bP\u0001P\u0003P\u0422\bP\u0001P\u0001P\u0001P\u0001P\u0005"+
		"P\u0428\bP\nP\fP\u042b\tP\u0001P\u0003P\u042e\bP\u0001P\u0001P\u0001P"+
		"\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u043b"+
		"\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0444\bP\u0001"+
		"P\u0001P\u0001P\u0003P\u0449\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u0454\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001R\u0004R\u045f\bR\u000bR\fR\u0460\u0001R\u0005"+
		"R\u0464\bR\nR\fR\u0467\tR\u0001R\u0005R\u046a\bR\nR\fR\u046d\tR\u0003"+
		"R\u046f\bR\u0001S\u0001S\u0001S\u0003S\u0474\bS\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001Y\u0005Y\u048f\bY\nY\fY\u0492\tY\u0001Y\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001Z\u0005Z\u049a\bZ\nZ\fZ\u049d\tZ\u0001[\u0001[\u0001[\u0001\\\u0001"+
		"\\\u0001\\\u0003\\\u04a5\b\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0005"+
		"]\u04ac\b]\n]\f]\u04af\t]\u0001^\u0001^\u0003^\u04b3\b^\u0001_\u0005_"+
		"\u04b6\b_\n_\f_\u04b9\t_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001`\u0005"+
		"`\u04c1\b`\n`\f`\u04c4\t`\u0001`\u0001`\u0003`\u04c8\b`\u0001a\u0001a"+
		"\u0001a\u0001b\u0004b\u04ce\bb\u000bb\fb\u04cf\u0001b\u0004b\u04d3\bb"+
		"\u000bb\fb\u04d4\u0001c\u0001c\u0001c\u0003c\u04da\bc\u0001c\u0001c\u0003"+
		"c\u04de\bc\u0003c\u04e0\bc\u0001d\u0001d\u0001d\u0005d\u04e5\bd\nd\fd"+
		"\u04e8\td\u0001e\u0001e\u0001e\u0003e\u04ed\be\u0001f\u0001f\u0001f\u0003"+
		"f\u04f2\bf\u0001f\u0001f\u0001f\u0001f\u0003f\u04f8\bf\u0001f\u0001f\u0003"+
		"f\u04fc\bf\u0001f\u0001f\u0003f\u0500\bf\u0001f\u0003f\u0503\bf\u0001"+
		"g\u0001g\u0003g\u0507\bg\u0001h\u0005h\u050a\bh\nh\fh\u050d\th\u0001h"+
		"\u0001h\u0001h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001j\u0001"+
		"j\u0001j\u0001j\u0001k\u0001k\u0001k\u0005k\u051f\bk\nk\fk\u0522\tk\u0001"+
		"l\u0001l\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u052b\bm\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003"+
		"m\u0538\bm\u0001m\u0001m\u0003m\u053c\bm\u0001m\u0001m\u0001m\u0003m\u0541"+
		"\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0003m\u054e\bm\u0003m\u0550\bm\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003"+
		"m\u0560\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0003m\u0589\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0003m\u0594\bm\u0001m\u0001m\u0001m\u0001m\u0003m\u059a\bm\u0001"+
		"m\u0001m\u0003m\u059e\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003"+
		"m\u05a6\bm\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0003m\u05b4\bm\u0001m\u0001m\u0003m\u05b8\bm\u0001"+
		"m\u0001m\u0001m\u0001m\u0003m\u05be\bm\u0005m\u05c0\bm\nm\fm\u05c3\tm"+
		"\u0001n\u0001n\u0001n\u0005n\u05c8\bn\nn\fn\u05cb\tn\u0001o\u0001o\u0001"+
		"o\u0003o\u05d0\bo\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u05d7\bo\u0001"+
		"p\u0001p\u0001p\u0005p\u05dc\bp\np\fp\u05df\tp\u0001q\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0005q\u05ec\bq\nq"+
		"\fq\u05ef\tq\u0001q\u0001q\u0001q\u0001q\u0001q\u0005q\u05f6\bq\nq\fq"+
		"\u05f9\tq\u0001q\u0001q\u0001q\u0003q\u05fe\bq\u0001r\u0001r\u0001r\u0003"+
		"r\u0603\br\u0001r\u0001r\u0001r\u0003r\u0608\br\u0001s\u0001s\u0001s\u0001"+
		"s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u0614\bs\u0003s\u0616"+
		"\bs\u0001t\u0001t\u0001t\u0003t\u061b\bt\u0001t\u0005t\u061e\bt\nt\ft"+
		"\u0621\tt\u0001t\u0003t\u0624\bt\u0001u\u0001u\u0001u\u0001u\u0003u\u062a"+
		"\bu\u0001v\u0001v\u0001v\u0003v\u062f\bv\u0001v\u0001v\u0001w\u0001w\u0001"+
		"w\u0005w\u0636\bw\nw\fw\u0639\tw\u0001w\u0001w\u0001w\u0001w\u0005w\u063f"+
		"\bw\nw\fw\u0642\tw\u0001w\u0005w\u0645\bw\nw\fw\u0648\tw\u0003w\u064a"+
		"\bw\u0001x\u0001x\u0001x\u0001x\u0001x\u0001y\u0001y\u0003y\u0653\by\u0001"+
		"z\u0001z\u0001z\u0003z\u0658\bz\u0001{\u0001{\u0001{\u0003{\u065d\b{\u0001"+
		"|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0005}\u0666\b}\n}\f}\u0669"+
		"\t}\u0001~\u0001~\u0001~\u0005~\u066e\b~\n~\f~\u0671\t~\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0005\u007f\u0676\b\u007f\n\u007f\f\u007f\u0679\t\u007f"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u067d\b\u0080\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0005\u0083\u0689\b\u0083\n\u0083\f\u0083\u068c"+
		"\t\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0003\u0084\u0692"+
		"\b\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003"+
		"\u0084\u0699\b\u0084\u0001\u0084\u0003\u0084\u069c\b\u0084\u0003\u0084"+
		"\u069e\b\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u06a2\b\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0003\u0087\u06ab\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u06b9\b\u008a\u0001\u008b\u0005"+
		"\u008b\u06bc\b\u008b\n\u008b\f\u008b\u06bf\t\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0003\u008b\u06c5\b\u008b\u0001\u008c\u0005\u008c"+
		"\u06c8\b\u008c\n\u008c\f\u008c\u06cb\t\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0003\u008c\u06d0\b\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u06d4"+
		"\b\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u06d9\b\u008d"+
		"\n\u008d\f\u008d\u06dc\t\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0005\u008e\u06e2\b\u008e\n\u008e\f\u008e\u06e5\t\u008e\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0000\u0001\u00da\u0090\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0000\u000e\u0001\u0000\u00e2\u00e9\u0001\u0000\u00c0"+
		"\u00c3\u0001\u0000NO\u0002\u0000}~\u0081\u0082\u0001\u0000\u0083\u0084"+
		"\u0002\u0000<<\u007f\u0080\u0001\u0000}~\u0001\u0000ux\u0001\u0000st\u0002"+
		"\u0000PPbl\u0001\u0000\u0081\u0082\u0001\u000019\u0002\u0000oo\u00d6\u00d6"+
		"\u0006\u0000::\u00c8\u00c8\u00cf\u00cf\u00d1\u00d3\u00d6\u00d6\u00e0\u00e0"+
		"\u078f\u0000\u0121\u0001\u0000\u0000\u0000\u0002\u0131\u0001\u0000\u0000"+
		"\u0000\u0004\u0142\u0001\u0000\u0000\u0000\u0006\u0150\u0001\u0000\u0000"+
		"\u0000\b\u0157\u0001\u0000\u0000\u0000\n\u0168\u0001\u0000\u0000\u0000"+
		"\f\u016c\u0001\u0000\u0000\u0000\u000e\u016e\u0001\u0000\u0000\u0000\u0010"+
		"\u017e\u0001\u0000\u0000\u0000\u0012\u0189\u0001\u0000\u0000\u0000\u0014"+
		"\u019c\u0001\u0000\u0000\u0000\u0016\u019e\u0001\u0000\u0000\u0000\u0018"+
		"\u01a2\u0001\u0000\u0000\u0000\u001a\u01a7\u0001\u0000\u0000\u0000\u001c"+
		"\u01b2\u0001\u0000\u0000\u0000\u001e\u01b7\u0001\u0000\u0000\u0000 \u01bd"+
		"\u0001\u0000\u0000\u0000\"\u01c0\u0001\u0000\u0000\u0000$\u01c3\u0001"+
		"\u0000\u0000\u0000&\u01ce\u0001\u0000\u0000\u0000(\u01d3\u0001\u0000\u0000"+
		"\u0000*\u01d7\u0001\u0000\u0000\u0000,\u01df\u0001\u0000\u0000\u0000."+
		"\u01e7\u0001\u0000\u0000\u00000\u01ee\u0001\u0000\u0000\u00002\u01fa\u0001"+
		"\u0000\u0000\u00004\u0202\u0001\u0000\u0000\u00006\u020a\u0001\u0000\u0000"+
		"\u00008\u0211\u0001\u0000\u0000\u0000:\u021e\u0001\u0000\u0000\u0000<"+
		"\u0221\u0001\u0000\u0000\u0000>\u022a\u0001\u0000\u0000\u0000@\u023f\u0001"+
		"\u0000\u0000\u0000B\u0249\u0001\u0000\u0000\u0000D\u024c\u0001\u0000\u0000"+
		"\u0000F\u025e\u0001\u0000\u0000\u0000H\u0260\u0001\u0000\u0000\u0000J"+
		"\u0264\u0001\u0000\u0000\u0000L\u026d\u0001\u0000\u0000\u0000N\u0279\u0001"+
		"\u0000\u0000\u0000P\u0282\u0001\u0000\u0000\u0000R\u0285\u0001\u0000\u0000"+
		"\u0000T\u0295\u0001\u0000\u0000\u0000V\u029d\u0001\u0000\u0000\u0000X"+
		"\u02ae\u0001\u0000\u0000\u0000Z\u02b8\u0001\u0000\u0000\u0000\\\u02ba"+
		"\u0001\u0000\u0000\u0000^\u02ca\u0001\u0000\u0000\u0000`\u02d5\u0001\u0000"+
		"\u0000\u0000b\u02e5\u0001\u0000\u0000\u0000d\u02e7\u0001\u0000\u0000\u0000"+
		"f\u02f2\u0001\u0000\u0000\u0000h\u0305\u0001\u0000\u0000\u0000j\u030a"+
		"\u0001\u0000\u0000\u0000l\u0313\u0001\u0000\u0000\u0000n\u031b\u0001\u0000"+
		"\u0000\u0000p\u0322\u0001\u0000\u0000\u0000r\u032e\u0001\u0000\u0000\u0000"+
		"t\u0330\u0001\u0000\u0000\u0000v\u0332\u0001\u0000\u0000\u0000x\u0334"+
		"\u0001\u0000\u0000\u0000z\u033b\u0001\u0000\u0000\u0000|\u033e\u0001\u0000"+
		"\u0000\u0000~\u0348\u0001\u0000\u0000\u0000\u0080\u0350\u0001\u0000\u0000"+
		"\u0000\u0082\u0357\u0001\u0000\u0000\u0000\u0084\u0359\u0001\u0000\u0000"+
		"\u0000\u0086\u0369\u0001\u0000\u0000\u0000\u0088\u036e\u0001\u0000\u0000"+
		"\u0000\u008a\u037f\u0001\u0000\u0000\u0000\u008c\u039f\u0001\u0000\u0000"+
		"\u0000\u008e\u03a1\u0001\u0000\u0000\u0000\u0090\u03ad\u0001\u0000\u0000"+
		"\u0000\u0092\u03af\u0001\u0000\u0000\u0000\u0094\u03b2\u0001\u0000\u0000"+
		"\u0000\u0096\u03ce\u0001\u0000\u0000\u0000\u0098\u03d0\u0001\u0000\u0000"+
		"\u0000\u009a\u03df\u0001\u0000\u0000\u0000\u009c\u03e4\u0001\u0000\u0000"+
		"\u0000\u009e\u03f7\u0001\u0000\u0000\u0000\u00a0\u0453\u0001\u0000\u0000"+
		"\u0000\u00a2\u0455\u0001\u0000\u0000\u0000\u00a4\u046e\u0001\u0000\u0000"+
		"\u0000\u00a6\u0473\u0001\u0000\u0000\u0000\u00a8\u0475\u0001\u0000\u0000"+
		"\u0000\u00aa\u047a\u0001\u0000\u0000\u0000\u00ac\u047e\u0001\u0000\u0000"+
		"\u0000\u00ae\u0484\u0001\u0000\u0000\u0000\u00b0\u0487\u0001\u0000\u0000"+
		"\u0000\u00b2\u0490\u0001\u0000\u0000\u0000\u00b4\u0496\u0001\u0000\u0000"+
		"\u0000\u00b6\u049e\u0001\u0000\u0000\u0000\u00b8\u04a1\u0001\u0000\u0000"+
		"\u0000\u00ba\u04a8\u0001\u0000\u0000\u0000\u00bc\u04b2\u0001\u0000\u0000"+
		"\u0000\u00be\u04b7\u0001\u0000\u0000\u0000\u00c0\u04c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u04c9\u0001\u0000\u0000\u0000\u00c4\u04cd\u0001\u0000\u0000"+
		"\u0000\u00c6\u04df\u0001\u0000\u0000\u0000\u00c8\u04e1\u0001\u0000\u0000"+
		"\u0000\u00ca\u04ec\u0001\u0000\u0000\u0000\u00cc\u0502\u0001\u0000\u0000"+
		"\u0000\u00ce\u0506\u0001\u0000\u0000\u0000\u00d0\u050b\u0001\u0000\u0000"+
		"\u0000\u00d2\u0513\u0001\u0000\u0000\u0000\u00d4\u0517\u0001\u0000\u0000"+
		"\u0000\u00d6\u051b\u0001\u0000\u0000\u0000\u00d8\u0523\u0001\u0000\u0000"+
		"\u0000\u00da\u054f\u0001\u0000\u0000\u0000\u00dc\u05c4\u0001\u0000\u0000"+
		"\u0000\u00de\u05d6\u0001\u0000\u0000\u0000\u00e0\u05d8\u0001\u0000\u0000"+
		"\u0000\u00e2\u05fd\u0001\u0000\u0000\u0000\u00e4\u0602\u0001\u0000\u0000"+
		"\u0000\u00e6\u0615\u0001\u0000\u0000\u0000\u00e8\u0623\u0001\u0000\u0000"+
		"\u0000\u00ea\u0625\u0001\u0000\u0000\u0000\u00ec\u062b\u0001\u0000\u0000"+
		"\u0000\u00ee\u0632\u0001\u0000\u0000\u0000\u00f0\u064b\u0001\u0000\u0000"+
		"\u0000\u00f2\u0650\u0001\u0000\u0000\u0000\u00f4\u0657\u0001\u0000\u0000"+
		"\u0000\u00f6\u065c\u0001\u0000\u0000\u0000\u00f8\u065e\u0001\u0000\u0000"+
		"\u0000\u00fa\u0662\u0001\u0000\u0000\u0000\u00fc\u066a\u0001\u0000\u0000"+
		"\u0000\u00fe\u0672\u0001\u0000\u0000\u0000\u0100\u067c\u0001\u0000\u0000"+
		"\u0000\u0102\u067e\u0001\u0000\u0000\u0000\u0104\u0682\u0001\u0000\u0000"+
		"\u0000\u0106\u0684\u0001\u0000\u0000\u0000\u0108\u069d\u0001\u0000\u0000"+
		"\u0000\u010a\u069f\u0001\u0000\u0000\u0000\u010c\u06a5\u0001\u0000\u0000"+
		"\u0000\u010e\u06aa\u0001\u0000\u0000\u0000\u0110\u06ac\u0001\u0000\u0000"+
		"\u0000\u0112\u06b0\u0001\u0000\u0000\u0000\u0114\u06b8\u0001\u0000\u0000"+
		"\u0000\u0116\u06c4\u0001\u0000\u0000\u0000\u0118\u06c9\u0001\u0000\u0000"+
		"\u0000\u011a\u06d5\u0001\u0000\u0000\u0000\u011c\u06dd\u0001\u0000\u0000"+
		"\u0000\u011e\u06e6\u0001\u0000\u0000\u0000\u0120\u0122\u0003\u0002\u0001"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0126\u0001\u0000\u0000\u0000\u0123\u0125\u0003\u0004\u0002"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u012c\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0003\u0006\u0003\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0000\u0000"+
		"\u0001\u0130\u0001\u0001\u0000\u0000\u0000\u0131\u0132\u0003z=\u0000\u0132"+
		"\u0133\u0005,\u0000\u0000\u0133\u0134\u0003n7\u0000\u0134\u0135\u0005"+
		"-\u0000\u0000\u0135\u0003\u0001\u0000\u0000\u0000\u0136\u0138\u0005\u001e"+
		"\u0000\u0000\u0137\u0139\u0005@\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0003n7\u0000\u013b\u013c\u0005;\u0000\u0000\u013c"+
		"\u013e\u0005<\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005-\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u0143\u0005"+
		"-\u0000\u0000\u0142\u0136\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0005\u0001\u0000\u0000\u0000\u0144\u0146\u0003\n\u0005"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u0151\u0003\b\u0004\u0000\u014b\u014d\u0005-\u0000\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0147\u0001\u0000\u0000\u0000"+
		"\u0150\u014c\u0001\u0000\u0000\u0000\u0151\u0007\u0001\u0000\u0000\u0000"+
		"\u0152\u0158\u0003\u000e\u0007\u0000\u0153\u0158\u0003.\u0017\u0000\u0154"+
		"\u0158\u00038\u001c\u0000\u0155\u0158\u0003\u0086C\u0000\u0156\u0158\u0003"+
		"\u0010\b\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000"+
		"\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\t\u0001\u0000\u0000"+
		"\u0000\u0159\u0169\u0003|>\u0000\u015a\u0169\u0005>\u0000\u0000\u015b"+
		"\u0169\u0005?\u0000\u0000\u015c\u0169\u0005=\u0000\u0000\u015d\u0169\u0005"+
		"@\u0000\u0000\u015e\u0169\u0005(\u0000\u0000\u015f\u0169\u0005^\u0000"+
		"\u0000\u0160\u0169\u0005\'\u0000\u0000\u0161\u0169\u0005)\u0000\u0000"+
		"\u0162\u0169\u0005B\u0000\u0000\u0163\u0169\u0005C\u0000\u0000\u0164\u0169"+
		"\u0005A\u0000\u0000\u0165\u0169\u0005D\u0000\u0000\u0166\u0169\u0005\u00d1"+
		"\u0000\u0000\u0167\u0169\u0005\u00d2\u0000\u0000\u0168\u0159\u0001\u0000"+
		"\u0000\u0000\u0168\u015a\u0001\u0000\u0000\u0000\u0168\u015b\u0001\u0000"+
		"\u0000\u0000\u0168\u015c\u0001\u0000\u0000\u0000\u0168\u015d\u0001\u0000"+
		"\u0000\u0000\u0168\u015e\u0001\u0000\u0000\u0000\u0168\u015f\u0001\u0000"+
		"\u0000\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000"+
		"\u0000\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000"+
		"\u0000\u0000\u0168\u0164\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u000b\u0001\u0000\u0000\u0000\u016a\u016d\u0005\'\u0000"+
		"\u0000\u016b\u016d\u0003|>\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\r\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005E\u0000\u0000\u016f\u0171\u0003\u011e\u008f\u0000\u0170\u0172\u0003"+
		"$\u0012\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0175\u0003 \u0010"+
		"\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0178\u0003\"\u0011\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u017b\u0003\u011c\u008e\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0003<\u001e\u0000\u017d"+
		"\u000f\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u00c8\u0000\u0000\u017f"+
		"\u0181\u0003\u011e\u008f\u0000\u0180\u0182\u0003$\u0012\u0000\u0181\u0180"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u0185\u0003\u0012\t\u0000\u0184\u0186\u0003"+
		"\"\u0011\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0003\u001a"+
		"\r\u0000\u0188\u0011\u0001\u0000\u0000\u0000\u0189\u018b\u0005L\u0000"+
		"\u0000\u018a\u018c\u0003\u0014\n\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005M\u0000\u0000\u018e\u0013\u0001\u0000\u0000\u0000\u018f"+
		"\u0194\u0003\u0016\u000b\u0000\u0190\u0191\u0005J\u0000\u0000\u0191\u0193"+
		"\u0003\u0016\u000b\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0199\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0005J\u0000\u0000\u0198\u019a\u0003"+
		"\u0018\f\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u019d\u0003\u0018"+
		"\f\u0000\u019c\u018f\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u0015\u0001\u0000\u0000\u0000\u019e\u019f\u0003z=\u0000\u019f"+
		"\u01a0\u0003\u00fe\u007f\u0000\u01a0\u01a1\u0003\u011e\u008f\u0000\u01a1"+
		"\u0017\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003z=\u0000\u01a3\u01a4\u0003"+
		"\u00fe\u007f\u0000\u01a4\u01a5\u0005\u00ab\u0000\u0000\u01a5\u01a6\u0003"+
		"\u011e\u008f\u0000\u01a6\u0019\u0001\u0000\u0000\u0000\u01a7\u01ab\u0005"+
		"H\u0000\u0000\u01a8\u01aa\u0003\u001c\u000e\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0005I\u0000"+
		"\u0000\u01af\u001b\u0001\u0000\u0000\u0000\u01b0\u01b3\u0003\u001e\u000f"+
		"\u0000\u01b1\u01b3\u0003@ \u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b3\u001d\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0003\n\u0005\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\u011e\u008f\u0000\u01bb\u01bc"+
		"\u0003\u0094J\u0000\u01bc\u001f\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"\u0012\u0000\u0000\u01be\u01bf\u0003\u00fe\u007f\u0000\u01bf!\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005K\u0000\u0000\u01c1\u01c2\u0003\u00fc~\u0000"+
		"\u01c2#\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005u\u0000\u0000\u01c4\u01c9"+
		"\u0003&\u0013\u0000\u01c5\u01c6\u0005J\u0000\u0000\u01c6\u01c8\u0003&"+
		"\u0013\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0005v\u0000\u0000\u01cd%\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0003z=\u0000\u01cf\u01d1\u0003\u011e\u008f\u0000\u01d0\u01d2"+
		"\u0003(\u0014\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\'\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005\u0012"+
		"\u0000\u0000\u01d4\u01d5\u0003z=\u0000\u01d5\u01d6\u0003*\u0015\u0000"+
		"\u01d6)\u0001\u0000\u0000\u0000\u01d7\u01dc\u0003,\u0016\u0000\u01d8\u01d9"+
		"\u0005r\u0000\u0000\u01d9\u01db\u0003,\u0016\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd+\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u0003z=\u0000\u01e0"+
		"\u01e4\u0003\u0100\u0080\u0000\u01e1\u01e3\u0003\u0102\u0081\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"-\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0005\u0099\u0000\u0000\u01e8\u01ea\u0003\u011e\u008f\u0000\u01e9\u01eb"+
		"\u0003\"\u0011\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003"+
		"0\u0018\u0000\u01ed/\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005H\u0000"+
		"\u0000\u01ef\u01f1\u00032\u0019\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0005J\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f7\u00036\u001b\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005I\u0000\u0000\u01f91\u0001\u0000\u0000\u0000\u01fa\u01ff\u00034"+
		"\u001a\u0000\u01fb\u01fc\u0005J\u0000\u0000\u01fc\u01fe\u00034\u001a\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u02003\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0003z=\u0000\u0203\u0205\u0003\u011e\u008f\u0000\u0204\u0206\u0003"+
		"\u010a\u0085\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0003"+
		"<\u001e\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u02095\u0001\u0000\u0000\u0000\u020a\u020e\u0005-\u0000\u0000"+
		"\u020b\u020d\u0003@ \u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u0210"+
		"\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0001\u0000\u0000\u0000\u020f7\u0001\u0000\u0000\u0000\u0210\u020e\u0001"+
		"\u0000\u0000\u0000\u0211\u0212\u0005G\u0000\u0000\u0212\u0214\u0003\u011e"+
		"\u008f\u0000\u0213\u0215\u0003$\u0012\u0000\u0214\u0213\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000\u0000"+
		"\u0000\u0216\u0218\u0003:\u001d\u0000\u0217\u0216\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000"+
		"\u0219\u021b\u0003\u011c\u008e\u0000\u021a\u0219\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0003>\u001f\u0000\u021d9\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u0012\u0000\u0000\u021f\u0220\u0003\u00fc~\u0000\u0220;\u0001\u0000"+
		"\u0000\u0000\u0221\u0225\u0005H\u0000\u0000\u0222\u0224\u0003@ \u0000"+
		"\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005I\u0000\u0000\u0229=\u0001\u0000\u0000\u0000\u022a\u022e"+
		"\u0005H\u0000\u0000\u022b\u022d\u0003N\'\u0000\u022c\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001\u0000"+
		"\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005I\u0000"+
		"\u0000\u0232?\u0001\u0000\u0000\u0000\u0233\u0240\u0005-\u0000\u0000\u0234"+
		"\u0236\u0005@\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0240"+
		"\u0003\u0098L\u0000\u0238\u023a\u0003\n\u0005\u0000\u0239\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0240\u0003"+
		"B!\u0000\u023f\u0233\u0001\u0000\u0000\u0000\u023f\u0235\u0001\u0000\u0000"+
		"\u0000\u023f\u023b\u0001\u0000\u0000\u0000\u0240A\u0001\u0000\u0000\u0000"+
		"\u0241\u024a\u0003\u0010\b\u0000\u0242\u024a\u0003D\"\u0000\u0243\u024a"+
		"\u0003L&\u0000\u0244\u024a\u0003J%\u0000\u0245\u024a\u00038\u001c\u0000"+
		"\u0246\u024a\u0003\u0086C\u0000\u0247\u024a\u0003\u000e\u0007\u0000\u0248"+
		"\u024a\u0003.\u0017\u0000\u0249\u0241\u0001\u0000\u0000\u0000\u0249\u0242"+
		"\u0001\u0000\u0000\u0000\u0249\u0243\u0001\u0000\u0000\u0000\u0249\u0244"+
		"\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000\u0000\u0000\u0249\u0246"+
		"\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u0248"+
		"\u0001\u0000\u0000\u0000\u024aC\u0001\u0000\u0000\u0000\u024b\u024d\u0003"+
		"$\u0012\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0003\u00fe"+
		"\u007f\u0000\u024f\u0250\u0003\u011e\u008f\u0000\u0250\u0254\u0003f3\u0000"+
		"\u0251\u0253\u0003\u0102\u0081\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000"+
		"\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u0259\u0003H$\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0003F#\u0000\u025bE\u0001\u0000"+
		"\u0000\u0000\u025c\u025f\u0003\u0098L\u0000\u025d\u025f\u0005-\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000"+
		"\u025fG\u0001\u0000\u0000\u0000\u0260\u0261\u0005Q\u0000\u0000\u0261\u0262"+
		"\u0003d2\u0000\u0262I\u0001\u0000\u0000\u0000\u0263\u0265\u0003$\u0012"+
		"\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267\u0003\u011e\u008f"+
		"\u0000\u0267\u0269\u0003f3\u0000\u0268\u026a\u0003H$\u0000\u0269\u0268"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0003\u0094J\u0000\u026cK\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0003\u00fe\u007f\u0000\u026e\u026f\u0003T*\u0000"+
		"\u026f\u0270\u0005-\u0000\u0000\u0270M\u0001\u0000\u0000\u0000\u0271\u0273"+
		"\u0003\n\u0005\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276\u0001"+
		"\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u0274\u0001"+
		"\u0000\u0000\u0000\u0277\u027a\u0003P(\u0000\u0278\u027a\u0005-\u0000"+
		"\u0000\u0279\u0274\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000"+
		"\u0000\u027aO\u0001\u0000\u0000\u0000\u027b\u0283\u0003L&\u0000\u027c"+
		"\u0283\u0003\u0010\b\u0000\u027d\u0283\u0003R)\u0000\u027e\u0283\u0003"+
		"8\u001c\u0000\u027f\u0283\u0003\u0086C\u0000\u0280\u0283\u0003\u000e\u0007"+
		"\u0000\u0281\u0283\u0003.\u0017\u0000\u0282\u027b\u0001\u0000\u0000\u0000"+
		"\u0282\u027c\u0001\u0000\u0000\u0000\u0282\u027d\u0001\u0000\u0000\u0000"+
		"\u0282\u027e\u0001\u0000\u0000\u0000\u0282\u027f\u0001\u0000\u0000\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000"+
		"\u0283Q\u0001\u0000\u0000\u0000\u0284\u0286\u0003$\u0012\u0000\u0285\u0284"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0003\u00fe\u007f\u0000\u0288\u0289"+
		"\u0003\u011e\u008f\u0000\u0289\u028d\u0003f3\u0000\u028a\u028c\u0003\u0102"+
		"\u0081\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c\u028f\u0001\u0000"+
		"\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u0290\u0292\u0003H$\u0000\u0291\u0290\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0003F#\u0000\u0294S\u0001\u0000\u0000\u0000\u0295\u029a"+
		"\u0003V+\u0000\u0296\u0297\u0005J\u0000\u0000\u0297\u0299\u0003V+\u0000"+
		"\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000"+
		"\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029bU\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d"+
		"\u02a1\u0003\u011e\u008f\u0000\u029e\u02a0\u0003\u0102\u0081\u0000\u029f"+
		"\u029e\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1"+
		"\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a5\u0005P\u0000\u0000\u02a5\u02a7\u0003Z-\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7W\u0001\u0000"+
		"\u0000\u0000\u02a8\u02af\u0005N\u0000\u0000\u02a9\u02ac\u0003n7\u0000"+
		"\u02aa\u02ab\u0005;\u0000\u0000\u02ab\u02ad\u0005N\u0000\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af"+
		"\u0001\u0000\u0000\u0000\u02ae\u02a8\u0001\u0000\u0000\u0000\u02ae\u02a9"+
		"\u0001\u0000\u0000\u0000\u02af\u02b3\u0001\u0000\u0000\u0000\u02b0\u02b2"+
		"\u0003\u0102\u0081\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4Y\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b9\u0003\\.\u0000\u02b7\u02b9\u0003\u00d8"+
		"l\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9[\u0001\u0000\u0000\u0000\u02ba\u02c3\u0005H\u0000\u0000\u02bb"+
		"\u02c0\u0003Z-\u0000\u02bc\u02bd\u0005J\u0000\u0000\u02bd\u02bf\u0003"+
		"Z-\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c3\u02bb\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c7\u0005J\u0000\u0000"+
		"\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005I\u0000\u0000\u02c9"+
		"]\u0001\u0000\u0000\u0000\u02ca\u02cb\u0003z=\u0000\u02cb\u02cd\u0003"+
		"\u011e\u008f\u0000\u02cc\u02ce\u0003\u0106\u0083\u0000\u02cd\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d2\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d1\u0003`0\u0000\u02d0\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3_\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005;\u0000\u0000\u02d6"+
		"\u02d7\u0003z=\u0000\u02d7\u02d9\u0003\u011e\u008f\u0000\u02d8\u02da\u0003"+
		"\u0106\u0083\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02daa\u0001\u0000\u0000\u0000\u02db\u02e6\u0003\u00fe"+
		"\u007f\u0000\u02dc\u02dd\u0003z=\u0000\u02dd\u02e3\u0005m\u0000\u0000"+
		"\u02de\u02e1\u0005\u0012\u0000\u0000\u02df\u02e1\u0005O\u0000\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4\u0003\u00fe\u007f\u0000\u02e3"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e5\u02db\u0001\u0000\u0000\u0000\u02e5"+
		"\u02dc\u0001\u0000\u0000\u0000\u02e6c\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0003z=\u0000\u02e8\u02ef\u0003n7\u0000\u02e9\u02ea\u0005J\u0000\u0000"+
		"\u02ea\u02eb\u0003z=\u0000\u02eb\u02ec\u0003n7\u0000\u02ec\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ed\u02e9\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001"+
		"\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f0e\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f4\u0005L\u0000\u0000\u02f3\u02f5\u0003h4\u0000"+
		"\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0005M\u0000\u0000\u02f7"+
		"g\u0001\u0000\u0000\u0000\u02f8\u02fd\u0003j5\u0000\u02f9\u02fa\u0005"+
		"J\u0000\u0000\u02fa\u02fc\u0003j5\u0000\u02fb\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0302\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0301\u0005J\u0000\u0000"+
		"\u0301\u0303\u0003l6\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304\u0306"+
		"\u0003l6\u0000\u0305\u02f8\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000"+
		"\u0000\u0000\u0306i\u0001\u0000\u0000\u0000\u0307\u0309\u0003\f\u0006"+
		"\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0309\u030c\u0001\u0000\u0000"+
		"\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000"+
		"\u0000\u030b\u030d\u0001\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0003\u00fe\u007f\u0000\u030e\u030f\u0003X,\u0000\u030f"+
		"k\u0001\u0000\u0000\u0000\u0310\u0312\u0003\f\u0006\u0000\u0311\u0310"+
		"\u0001\u0000\u0000\u0000\u0312\u0315\u0001\u0000\u0000\u0000\u0313\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0316"+
		"\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0316\u0317"+
		"\u0003\u00fe\u007f\u0000\u0317\u0318\u0003z=\u0000\u0318\u0319\u0005\u00ab"+
		"\u0000\u0000\u0319\u031a\u0003X,\u0000\u031am\u0001\u0000\u0000\u0000"+
		"\u031b\u031f\u0003\u011e\u008f\u0000\u031c\u031e\u0003p8\u0000\u031d\u031c"+
		"\u0001\u0000\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f\u031d"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320o\u0001"+
		"\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0323\u0005"+
		";\u0000\u0000\u0323\u0324\u0003z=\u0000\u0324\u0325\u0003\u011e\u008f"+
		"\u0000\u0325q\u0001\u0000\u0000\u0000\u0326\u032f\u0003t:\u0000\u0327"+
		"\u032f\u0003v;\u0000\u0328\u032f\u0003x<\u0000\u0329\u032f\u0005\u008a"+
		"\u0000\u0000\u032a\u032f\u0005\u008b\u0000\u0000\u032b\u032f\u0005\u0085"+
		"\u0000\u0000\u032c\u032f\u0005\u0086\u0000\u0000\u032d\u032f\u0005\u0087"+
		"\u0000\u0000\u032e\u0326\u0001\u0000\u0000\u0000\u032e\u0327\u0001\u0000"+
		"\u0000\u0000\u032e\u0328\u0001\u0000\u0000\u0000\u032e\u0329\u0001\u0000"+
		"\u0000\u0000\u032e\u032a\u0001\u0000\u0000\u0000\u032e\u032b\u0001\u0000"+
		"\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032d\u0001\u0000"+
		"\u0000\u0000\u032fs\u0001\u0000\u0000\u0000\u0330\u0331\u0007\u0000\u0000"+
		"\u0000\u0331u\u0001\u0000\u0000\u0000\u0332\u0333\u0007\u0001\u0000\u0000"+
		"\u0333w\u0001\u0000\u0000\u0000\u0334\u0335\u0005\u00cc\u0000\u0000\u0335"+
		"\u0336\u0005\u00cd\u0000\u0000\u0336\u0337\u0005\u00ce\u0000\u0000\u0337"+
		"y\u0001\u0000\u0000\u0000\u0338\u033a\u0003|>\u0000\u0339\u0338\u0001"+
		"\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000\u0000\u033b\u0339\u0001"+
		"\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c{\u0001\u0000"+
		"\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u00aa"+
		"\u0000\u0000\u033f\u0346\u0003n7\u0000\u0340\u0343\u0005L\u0000\u0000"+
		"\u0341\u0344\u0003~?\u0000\u0342\u0344\u0003\u0082A\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0343\u0344"+
		"\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0347"+
		"\u0005M\u0000\u0000\u0346\u0340\u0001\u0000\u0000\u0000\u0346\u0347\u0001"+
		"\u0000\u0000\u0000\u0347}\u0001\u0000\u0000\u0000\u0348\u034d\u0003\u0080"+
		"@\u0000\u0349\u034a\u0005J\u0000\u0000\u034a\u034c\u0003\u0080@\u0000"+
		"\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034f\u0001\u0000\u0000\u0000"+
		"\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000"+
		"\u034e\u007f\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0003\u011e\u008f\u0000\u0351\u0352\u0005P\u0000\u0000\u0352"+
		"\u0353\u0003\u0082A\u0000\u0353\u0081\u0001\u0000\u0000\u0000\u0354\u0358"+
		"\u0003\u00d8l\u0000\u0355\u0358\u0003|>\u0000\u0356\u0358\u0003\u0084"+
		"B\u0000\u0357\u0354\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000"+
		"\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0358\u0083\u0001\u0000\u0000"+
		"\u0000\u0359\u0362\u0005H\u0000\u0000\u035a\u035f\u0003\u0082A\u0000\u035b"+
		"\u035c\u0005J\u0000\u0000\u035c\u035e\u0003\u0082A\u0000\u035d\u035b\u0001"+
		"\u0000\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0363\u0001"+
		"\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0362\u035a\u0001"+
		"\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0365\u0001"+
		"\u0000\u0000\u0000\u0364\u0366\u0005J\u0000\u0000\u0365\u0364\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0005I\u0000\u0000\u0368\u0085\u0001\u0000\u0000"+
		"\u0000\u0369\u036a\u0005\u00aa\u0000\u0000\u036a\u036b\u0005G\u0000\u0000"+
		"\u036b\u036c\u0003\u011e\u008f\u0000\u036c\u036d\u0003\u0088D\u0000\u036d"+
		"\u0087\u0001\u0000\u0000\u0000\u036e\u0372\u0005H\u0000\u0000\u036f\u0371"+
		"\u0003\u008aE\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0374\u0001"+
		"\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001"+
		"\u0000\u0000\u0000\u0373\u0375\u0001\u0000\u0000\u0000\u0374\u0372\u0001"+
		"\u0000\u0000\u0000\u0375\u0376\u0005I\u0000\u0000\u0376\u0089\u0001\u0000"+
		"\u0000\u0000\u0377\u0379\u0003\n\u0005\u0000\u0378\u0377\u0001\u0000\u0000"+
		"\u0000\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000"+
		"\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037d\u0001\u0000\u0000"+
		"\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u0380\u0003\u008cF\u0000"+
		"\u037e\u0380\u0005-\u0000\u0000\u037f\u037a\u0001\u0000\u0000\u0000\u037f"+
		"\u037e\u0001\u0000\u0000\u0000\u0380\u008b\u0001\u0000\u0000\u0000\u0381"+
		"\u0384\u0003\u00fe\u007f\u0000\u0382\u0385\u0003\u008eG\u0000\u0383\u0385"+
		"\u0003\u0090H\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0384\u0383\u0001"+
		"\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0005"+
		"-\u0000\u0000\u0387\u03a0\u0001\u0000\u0000\u0000\u0388\u0389\u0003\u00fe"+
		"\u007f\u0000\u0389\u038a\u0005-\u0000\u0000\u038a\u03a0\u0001\u0000\u0000"+
		"\u0000\u038b\u038d\u0003\u000e\u0007\u0000\u038c\u038e\u0005-\u0000\u0000"+
		"\u038d\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000"+
		"\u038e\u03a0\u0001\u0000\u0000\u0000\u038f\u0391\u0003\u0010\b\u0000\u0390"+
		"\u0392\u0005-\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0391\u0392"+
		"\u0001\u0000\u0000\u0000\u0392\u03a0\u0001\u0000\u0000\u0000\u0393\u0395"+
		"\u00038\u001c\u0000\u0394\u0396\u0005-\u0000\u0000\u0395\u0394\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u03a0\u0001\u0000"+
		"\u0000\u0000\u0397\u0399\u0003.\u0017\u0000\u0398\u039a\u0005-\u0000\u0000"+
		"\u0399\u0398\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000"+
		"\u039a\u03a0\u0001\u0000\u0000\u0000\u039b\u039d\u0003\u0086C\u0000\u039c"+
		"\u039e\u0005-\u0000\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u0001\u0000\u0000\u0000\u039e\u03a0\u0001\u0000\u0000\u0000\u039f\u0381"+
		"\u0001\u0000\u0000\u0000\u039f\u0388\u0001\u0000\u0000\u0000\u039f\u038b"+
		"\u0001\u0000\u0000\u0000\u039f\u038f\u0001\u0000\u0000\u0000\u039f\u0393"+
		"\u0001\u0000\u0000\u0000\u039f\u0397\u0001\u0000\u0000\u0000\u039f\u039b"+
		"\u0001\u0000\u0000\u0000\u03a0\u008d\u0001\u0000\u0000\u0000\u03a1\u03a2"+
		"\u0003\u011e\u008f\u0000\u03a2\u03a3\u0005L\u0000\u0000\u03a3\u03a7\u0005"+
		"M\u0000\u0000\u03a4\u03a6\u0003\u0102\u0081\u0000\u03a5\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03ac\u0003\u0092"+
		"I\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u008f\u0001\u0000\u0000\u0000\u03ad\u03ae\u0003T*\u0000\u03ae"+
		"\u0091\u0001\u0000\u0000\u0000\u03af\u03b0\u0005^\u0000\u0000\u03b0\u03b1"+
		"\u0003\u0082A\u0000\u03b1\u0093\u0001\u0000\u0000\u0000\u03b2\u03b4\u0005"+
		"H\u0000\u0000\u03b3\u03b5\u0003\u0096K\u0000\u03b4\u03b3\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b8\u0003\u009aM\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b8\u03bb\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000"+
		"\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bc\u0001\u0000\u0000\u0000"+
		"\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005I\u0000\u0000\u03bd"+
		"\u0095\u0001\u0000\u0000\u0000\u03be\u03c0\u0003\u0106\u0083\u0000\u03bf"+
		"\u03be\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0007\u0002\u0000\u0000\u03c2"+
		"\u03c3\u0003\u010a\u0085\u0000\u03c3\u03c4\u0005-\u0000\u0000\u03c4\u03cf"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c6\u0003\u00dam\u0000\u03c6\u03c8\u0005"+
		";\u0000\u0000\u03c7\u03c9\u0003\u0106\u0083\u0000\u03c8\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cb\u0005O\u0000\u0000\u03cb\u03cc\u0003\u010a\u0085"+
		"\u0000\u03cc\u03cd\u0005-\u0000\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000"+
		"\u03ce\u03bf\u0001\u0000\u0000\u0000\u03ce\u03c5\u0001\u0000\u0000\u0000"+
		"\u03cf\u0097\u0001\u0000\u0000\u0000\u03d0\u03d4\u0005H\u0000\u0000\u03d1"+
		"\u03d3\u0003\u009aM\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d7\u0001\u0000\u0000\u0000\u03d6\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005I\u0000\u0000\u03d8\u0099\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0004M\u0000\u0000\u03da\u03db\u0003\u009c"+
		"N\u0000\u03db\u03dc\u0005-\u0000\u0000\u03dc\u03e0\u0001\u0000\u0000\u0000"+
		"\u03dd\u03e0\u0003\u00a0P\u0000\u03de\u03e0\u0003\u009eO\u0000\u03df\u03d9"+
		"\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03df\u03de"+
		"\u0001\u0000\u0000\u0000\u03e0\u009b\u0001\u0000\u0000\u0000\u03e1\u03e3"+
		"\u0003\n\u0005\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e7\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e8\u0003\u00fe\u007f\u0000\u03e8\u03e9\u0003"+
		"T*\u0000\u03e9\u009d\u0001\u0000\u0000\u0000\u03ea\u03ec\u0003\n\u0005"+
		"\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000"+
		"\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ee\u03f4\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000"+
		"\u0000\u03f0\u03f5\u0003\u000e\u0007\u0000\u03f1\u03f5\u0003.\u0017\u0000"+
		"\u03f2\u03f5\u00038\u001c\u0000\u03f3\u03f5\u0003\u0010\b\u0000\u03f4"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f4\u03f1\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f8\u0005-\u0000\u0000\u03f7\u03ed"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f6\u0001\u0000\u0000\u0000\u03f8\u009f"+
		"\u0001\u0000\u0000\u0000\u03f9\u0454\u0003\u0098L\u0000\u03fa\u03fb\u0005"+
		"\u0097\u0000\u0000\u03fb\u03fe\u0003\u00d8l\u0000\u03fc\u03fd\u0005R\u0000"+
		"\u0000\u03fd\u03ff\u0003\u00d8l\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000"+
		"\u0400\u0401\u0005-\u0000\u0000\u0401\u0454\u0001\u0000\u0000\u0000\u0402"+
		"\u0403\u0005S\u0000\u0000\u0403\u0404\u0003\u00d4j\u0000\u0404\u0406\u0003"+
		"\u00a0P\u0000\u0405\u0407\u0003\u00aeW\u0000\u0406\u0405\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0454\u0001\u0000\u0000"+
		"\u0000\u0408\u0409\u0005[\u0000\u0000\u0409\u040a\u0003\u00ccf\u0000\u040a"+
		"\u040b\u0003\u00a0P\u0000\u040b\u0454\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u0005T\u0000\u0000\u040d\u040e\u0003\u00d4j\u0000\u040e\u040f\u0003\u00a0"+
		"P\u0000\u040f\u0454\u0001\u0000\u0000\u0000\u0410\u0411\u0005U\u0000\u0000"+
		"\u0411\u0412\u0003\u00a0P\u0000\u0412\u0413\u0005T\u0000\u0000\u0413\u0414"+
		"\u0003\u00d4j\u0000\u0414\u0415\u0005-\u0000\u0000\u0415\u0454\u0001\u0000"+
		"\u0000\u0000\u0416\u0417\u0005_\u0000\u0000\u0417\u0421\u0003\u0098L\u0000"+
		"\u0418\u041a\u0003\u00b0X\u0000\u0419\u0418\u0001\u0000\u0000\u0000\u041a"+
		"\u041b\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041c\u041e\u0001\u0000\u0000\u0000\u041d"+
		"\u041f\u0003\u00b6[\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041e\u041f"+
		"\u0001\u0000\u0000\u0000\u041f\u0422\u0001\u0000\u0000\u0000\u0420\u0422"+
		"\u0003\u00b6[\u0000\u0421\u0419\u0001\u0000\u0000\u0000\u0421\u0420\u0001"+
		"\u0000\u0000\u0000\u0422\u0454\u0001\u0000\u0000\u0000\u0423\u0424\u0005"+
		"_\u0000\u0000\u0424\u0425\u0003\u00b8\\\u0000\u0425\u0429\u0003\u0098"+
		"L\u0000\u0426\u0428\u0003\u00b0X\u0000\u0427\u0426\u0001\u0000\u0000\u0000"+
		"\u0428\u042b\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000"+
		"\u0429\u042a\u0001\u0000\u0000\u0000\u042a\u042d\u0001\u0000\u0000\u0000"+
		"\u042b\u0429\u0001\u0000\u0000\u0000\u042c\u042e\u0003\u00b6[\u0000\u042d"+
		"\u042c\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e"+
		"\u0454\u0001\u0000\u0000\u0000\u042f\u0430\u0005\u00cf\u0000\u0000\u0430"+
		"\u0431\u0003\u00d8l\u0000\u0431\u0432\u0005-\u0000\u0000\u0432\u0454\u0001"+
		"\u0000\u0000\u0000\u0433\u0454\u0003\u00a2Q\u0000\u0434\u0435\u0005C\u0000"+
		"\u0000\u0435\u0436\u0003\u00d4j\u0000\u0436\u0437\u0003\u0098L\u0000\u0437"+
		"\u0454\u0001\u0000\u0000\u0000\u0438\u043a\u0005X\u0000\u0000\u0439\u043b"+
		"\u0003\u00d8l\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043a\u043b\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u0454\u0005"+
		"-\u0000\u0000\u043d\u043e\u0005Z\u0000\u0000\u043e\u043f\u0003\u00d8l"+
		"\u0000\u043f\u0440\u0005-\u0000\u0000\u0440\u0454\u0001\u0000\u0000\u0000"+
		"\u0441\u0443\u0005V\u0000\u0000\u0442\u0444\u0003\u011e\u008f\u0000\u0443"+
		"\u0442\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444"+
		"\u0445\u0001\u0000\u0000\u0000\u0445\u0454\u0005-\u0000\u0000\u0446\u0448"+
		"\u0005W\u0000\u0000\u0447\u0449\u0003\u011e\u008f\u0000\u0448\u0447\u0001"+
		"\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u044a\u0001"+
		"\u0000\u0000\u0000\u044a\u0454\u0005-\u0000\u0000\u044b\u0454\u0005-\u0000"+
		"\u0000\u044c\u044d\u0003\u00d8l\u0000\u044d\u044e\u0005-\u0000\u0000\u044e"+
		"\u0454\u0001\u0000\u0000\u0000\u044f\u0450\u0003\u011e\u008f\u0000\u0450"+
		"\u0451\u0005R\u0000\u0000\u0451\u0452\u0003\u00a0P\u0000\u0452\u0454\u0001"+
		"\u0000\u0000\u0000\u0453\u03f9\u0001\u0000\u0000\u0000\u0453\u03fa\u0001"+
		"\u0000\u0000\u0000\u0453\u0402\u0001\u0000\u0000\u0000\u0453\u0408\u0001"+
		"\u0000\u0000\u0000\u0453\u040c\u0001\u0000\u0000\u0000\u0453\u0410\u0001"+
		"\u0000\u0000\u0000\u0453\u0416\u0001\u0000\u0000\u0000\u0453\u0423\u0001"+
		"\u0000\u0000\u0000\u0453\u042f\u0001\u0000\u0000\u0000\u0453\u0433\u0001"+
		"\u0000\u0000\u0000\u0453\u0434\u0001\u0000\u0000\u0000\u0453\u0438\u0001"+
		"\u0000\u0000\u0000\u0453\u043d\u0001\u0000\u0000\u0000\u0453\u0441\u0001"+
		"\u0000\u0000\u0000\u0453\u0446\u0001\u0000\u0000\u0000\u0453\u044b\u0001"+
		"\u0000\u0000\u0000\u0453\u044c\u0001\u0000\u0000\u0000\u0453\u044f\u0001"+
		"\u0000\u0000\u0000\u0454\u00a1\u0001\u0000\u0000\u0000\u0455\u0456\u0005"+
		"Y\u0000\u0000\u0456\u0457\u0003\u00d4j\u0000\u0457\u0458\u0005H\u0000"+
		"\u0000\u0458\u0459\u0006Q\uffff\uffff\u0000\u0459\u045a\u0003\u00a4R\u0000"+
		"\u045a\u045b\u0006Q\uffff\uffff\u0000\u045b\u045c\u0005I\u0000\u0000\u045c"+
		"\u00a3\u0001\u0000\u0000\u0000\u045d\u045f\u0003\u00a6S\u0000\u045e\u045d"+
		"\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u045e"+
		"\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u046f"+
		"\u0001\u0000\u0000\u0000\u0462\u0464\u0003\u00c4b\u0000\u0463\u0462\u0001"+
		"\u0000\u0000\u0000\u0464\u0467\u0001\u0000\u0000\u0000\u0465\u0463\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u046b\u0001"+
		"\u0000\u0000\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0468\u046a\u0003"+
		"\u00c6c\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u046a\u046d\u0001\u0000"+
		"\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000"+
		"\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000"+
		"\u0000\u0000\u046e\u045e\u0001\u0000\u0000\u0000\u046e\u0465\u0001\u0000"+
		"\u0000\u0000\u046f\u00a5\u0001\u0000\u0000\u0000\u0470\u0474\u0003\u00a8"+
		"T\u0000\u0471\u0474\u0003\u00aaU\u0000\u0472\u0474\u0003\u00acV\u0000"+
		"\u0473\u0470\u0001\u0000\u0000\u0000\u0473\u0471\u0001\u0000\u0000\u0000"+
		"\u0473\u0472\u0001\u0000\u0000\u0000\u0474\u00a7\u0001\u0000\u0000\u0000"+
		"\u0475\u0476\u0003\u00c6c\u0000\u0476\u0477\u0005\u00b5\u0000\u0000\u0477"+
		"\u0478\u0003\u00d8l\u0000\u0478\u0479\u0005-\u0000\u0000\u0479\u00a9\u0001"+
		"\u0000\u0000\u0000\u047a\u047b\u0003\u00c6c\u0000\u047b\u047c\u0005\u00b5"+
		"\u0000\u0000\u047c\u047d\u0003\u0098L\u0000\u047d\u00ab\u0001\u0000\u0000"+
		"\u0000\u047e\u047f\u0003\u00c6c\u0000\u047f\u0480\u0005\u00b5\u0000\u0000"+
		"\u0480\u0481\u0005Z\u0000\u0000\u0481\u0482\u0003\u00d8l\u0000\u0482\u0483"+
		"\u0005-\u0000\u0000\u0483\u00ad\u0001\u0000\u0000\u0000\u0484\u0485\u0005"+
		"\\\u0000\u0000\u0485\u0486\u0003\u00a0P\u0000\u0486\u00af\u0001\u0000"+
		"\u0000\u0000\u0487\u0488\u0005`\u0000\u0000\u0488\u0489\u0005L\u0000\u0000"+
		"\u0489\u048a\u0003\u00b2Y\u0000\u048a\u048b\u0005M\u0000\u0000\u048b\u048c"+
		"\u0003\u0098L\u0000\u048c\u00b1\u0001\u0000\u0000\u0000\u048d\u048f\u0003"+
		"\f\u0006\u0000\u048e\u048d\u0001\u0000\u0000\u0000\u048f\u0492\u0001\u0000"+
		"\u0000\u0000\u0490\u048e\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000"+
		"\u0000\u0000\u0491\u0493\u0001\u0000\u0000\u0000\u0492\u0490\u0001\u0000"+
		"\u0000\u0000\u0493\u0494\u0003\u00b4Z\u0000\u0494\u0495\u0003\u011e\u008f"+
		"\u0000\u0495\u00b3\u0001\u0000\u0000\u0000\u0496\u049b\u0003^/\u0000\u0497"+
		"\u0498\u0005p\u0000\u0000\u0498\u049a\u0003^/\u0000\u0499\u0497\u0001"+
		"\u0000\u0000\u0000\u049a\u049d\u0001\u0000\u0000\u0000\u049b\u0499\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u00b5\u0001"+
		"\u0000\u0000\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049e\u049f\u0005"+
		"a\u0000\u0000\u049f\u04a0\u0003\u0098L\u0000\u04a0\u00b7\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0005L\u0000\u0000\u04a2\u04a4\u0003\u00ba]\u0000\u04a3"+
		"\u04a5\u0005-\u0000\u0000\u04a4\u04a3\u0001\u0000\u0000\u0000\u04a4\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u04a7"+
		"\u0005M\u0000\u0000\u04a7\u00b9\u0001\u0000\u0000\u0000\u04a8\u04ad\u0003"+
		"\u00bc^\u0000\u04a9\u04aa\u0005-\u0000\u0000\u04aa\u04ac\u0003\u00bc^"+
		"\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac\u04af\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000"+
		"\u0000\u04ae\u00bb\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b3\u0003\u00be_\u0000\u04b1\u04b3\u0003\u00c0`\u0000\u04b2"+
		"\u04b0\u0001\u0000\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3"+
		"\u00bd\u0001\u0000\u0000\u0000\u04b4\u04b6\u0003\f\u0006\u0000\u04b5\u04b4"+
		"\u0001\u0000\u0000\u0000\u04b6\u04b9\u0001\u0000\u0000\u0000\u04b7\u04b5"+
		"\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000\u04b8\u04ba"+
		"\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04ba\u04bb"+
		"\u0003^/\u0000\u04bb\u04bc\u0003X,\u0000\u04bc\u04bd\u0005P\u0000\u0000"+
		"\u04bd\u04be\u0003\u00d8l\u0000\u04be\u00bf\u0001\u0000\u0000\u0000\u04bf"+
		"\u04c1\u0003\u00c2a\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c3"+
		"\u0001\u0000\u0000\u0000\u04c3\u04c7\u0001\u0000\u0000\u0000\u04c4\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c8\u0003\u011e\u008f\u0000\u04c6\u04c8"+
		"\u0005N\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c7\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c8\u00c1\u0001\u0000\u0000\u0000\u04c9\u04ca\u0003"+
		"\u00dam\u0000\u04ca\u04cb\u0005;\u0000\u0000\u04cb\u00c3\u0001\u0000\u0000"+
		"\u0000\u04cc\u04ce\u0003\u00c6c\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000"+
		"\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d1\u04d3\u0003\u009aM\u0000\u04d2\u04d1\u0001\u0000\u0000\u0000\u04d3"+
		"\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4"+
		"\u04d5\u0001\u0000\u0000\u0000\u04d5\u00c5\u0001\u0000\u0000\u0000\u04d6"+
		"\u04d7\u0005]\u0000\u0000\u04d7\u04d9\u0003\u00c8d\u0000\u04d8\u04da\u0005"+
		"R\u0000\u0000\u04d9\u04d8\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000"+
		"\u0000\u0000\u04da\u04e0\u0001\u0000\u0000\u0000\u04db\u04dd\u0005^\u0000"+
		"\u0000\u04dc\u04de\u0005R\u0000\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000"+
		"\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04e0\u0001\u0000\u0000\u0000"+
		"\u04df\u04d6\u0001\u0000\u0000\u0000\u04df\u04db\u0001\u0000\u0000\u0000"+
		"\u04e0\u00c7\u0001\u0000\u0000\u0000\u04e1\u04e6\u0003\u00cae\u0000\u04e2"+
		"\u04e3\u0005J\u0000\u0000\u04e3\u04e5\u0003\u00cae\u0000\u04e4\u04e2\u0001"+
		"\u0000\u0000\u0000\u04e5\u04e8\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7\u00c9\u0001"+
		"\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e9\u04ed\u0003"+
		"\u010c\u0086\u0000\u04ea\u04ed\u0003\u00d8l\u0000\u04eb\u04ed\u0005^\u0000"+
		"\u0000\u04ec\u04e9\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000"+
		"\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ed\u00cb\u0001\u0000\u0000"+
		"\u0000\u04ee\u04f1\u0005L\u0000\u0000\u04ef\u04f2\u0003\u00d0h\u0000\u04f0"+
		"\u04f2\u0003\u00d2i\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f4"+
		"\u0005M\u0000\u0000\u04f4\u0503\u0001\u0000\u0000\u0000\u04f5\u04f7\u0005"+
		"L\u0000\u0000\u04f6\u04f8\u0003\u00ceg\u0000\u04f7\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000"+
		"\u0000\u04f9\u04fb\u0005-\u0000\u0000\u04fa\u04fc\u0003\u00d8l\u0000\u04fb"+
		"\u04fa\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc"+
		"\u04fd\u0001\u0000\u0000\u0000\u04fd\u04ff\u0005-\u0000\u0000\u04fe\u0500"+
		"\u0003\u00d6k\u0000\u04ff\u04fe\u0001\u0000\u0000\u0000\u04ff\u0500\u0001"+
		"\u0000\u0000\u0000\u0500\u0501\u0001\u0000\u0000\u0000\u0501\u0503\u0005"+
		"M\u0000\u0000\u0502\u04ee\u0001\u0000\u0000\u0000\u0502\u04f5\u0001\u0000"+
		"\u0000\u0000\u0503\u00cd\u0001\u0000\u0000\u0000\u0504\u0507\u0003\u009c"+
		"N\u0000\u0505\u0507\u0003\u00d6k\u0000\u0506\u0504\u0001\u0000\u0000\u0000"+
		"\u0506\u0505\u0001\u0000\u0000\u0000\u0507\u00cf\u0001\u0000\u0000\u0000"+
		"\u0508\u050a\u0003\f\u0006\u0000\u0509\u0508\u0001\u0000\u0000\u0000\u050a"+
		"\u050d\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b"+
		"\u050c\u0001\u0000\u0000\u0000\u050c\u050e\u0001\u0000\u0000\u0000\u050d"+
		"\u050b\u0001\u0000\u0000\u0000\u050e\u050f\u0003\u00fe\u007f\u0000\u050f"+
		"\u0510\u0003X,\u0000\u0510\u0511\u0005R\u0000\u0000\u0511\u0512\u0003"+
		"\u00d8l\u0000\u0512\u00d1\u0001\u0000\u0000\u0000\u0513\u0514\u0003\u010c"+
		"\u0086\u0000\u0514\u0515\u0005R\u0000\u0000\u0515\u0516\u0003\u00d8l\u0000"+
		"\u0516\u00d3\u0001\u0000\u0000\u0000\u0517\u0518\u0005L\u0000\u0000\u0518"+
		"\u0519\u0003\u00d8l\u0000\u0519\u051a\u0005M\u0000\u0000\u051a\u00d5\u0001"+
		"\u0000\u0000\u0000\u051b\u0520\u0003\u00d8l\u0000\u051c\u051d\u0005J\u0000"+
		"\u0000\u051d\u051f\u0003\u00d8l\u0000\u051e\u051c\u0001\u0000\u0000\u0000"+
		"\u051f\u0522\u0001\u0000\u0000\u0000\u0520\u051e\u0001\u0000\u0000\u0000"+
		"\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u00d7\u0001\u0000\u0000\u0000"+
		"\u0522\u0520\u0001\u0000\u0000\u0000\u0523\u0524\u0003\u00dam\u0000\u0524"+
		"\u00d9\u0001\u0000\u0000\u0000\u0525\u0526\u0006m\uffff\uffff\u0000\u0526"+
		"\u0550\u0003\u00e2q\u0000\u0527\u0528\u0003\u011e\u008f\u0000\u0528\u052a"+
		"\u0005L\u0000\u0000\u0529\u052b\u0003\u00d6k\u0000\u052a\u0529\u0001\u0000"+
		"\u0000\u0000\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000"+
		"\u0000\u0000\u052c\u052d\u0005M\u0000\u0000\u052d\u0550\u0001\u0000\u0000"+
		"\u0000\u052e\u052f\u0005\u0088\u0000\u0000\u052f\u0550\u0003\u00e6s\u0000"+
		"\u0530\u0531\u0007\u0003\u0000\u0000\u0531\u0550\u0003\u00dam\u0014\u0532"+
		"\u0533\u0007\u0004\u0000\u0000\u0533\u0550\u0003\u00dam\u0013\u0534\u0535"+
		"\u0003\u00fe\u007f\u0000\u0535\u0537\u0005\u00b3\u0000\u0000\u0536\u0538"+
		"\u0003\u0106\u0083\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537\u0538"+
		"\u0001\u0000\u0000\u0000\u0538\u053b\u0001\u0000\u0000\u0000\u0539\u053c"+
		"\u0003\u011e\u008f\u0000\u053a\u053c\u0005\u0088\u0000\u0000\u053b\u0539"+
		"\u0001\u0000\u0000\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053c\u0550"+
		"\u0001\u0000\u0000\u0000\u053d\u053e\u0003\u00e4r\u0000\u053e\u0540\u0005"+
		"\u00b3\u0000\u0000\u053f\u0541\u0003\u0106\u0083\u0000\u0540\u053f\u0001"+
		"\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0542\u0001"+
		"\u0000\u0000\u0000\u0542\u0543\u0005\u0088\u0000\u0000\u0543\u0550\u0001"+
		"\u0000\u0000\u0000\u0544\u0545\u0005L\u0000\u0000\u0545\u0546\u0003\u00dc"+
		"n\u0000\u0546\u0547\u0005M\u0000\u0000\u0547\u0548\u0003\u00dam\u000f"+
		"\u0548\u0550\u0001\u0000\u0000\u0000\u0549\u054a\u0003\u00deo\u0000\u054a"+
		"\u054d\u0005\u00b5\u0000\u0000\u054b\u054e\u0003\u00dam\u0000\u054c\u054e"+
		"\u0003\u0098L\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054c\u0001"+
		"\u0000\u0000\u0000\u054e\u0550\u0001\u0000\u0000\u0000\u054f\u0525\u0001"+
		"\u0000\u0000\u0000\u054f\u0527\u0001\u0000\u0000\u0000\u054f\u052e\u0001"+
		"\u0000\u0000\u0000\u054f\u0530\u0001\u0000\u0000\u0000\u054f\u0532\u0001"+
		"\u0000\u0000\u0000\u054f\u0534\u0001\u0000\u0000\u0000\u054f\u053d\u0001"+
		"\u0000\u0000\u0000\u054f\u0544\u0001\u0000\u0000\u0000\u054f\u0549\u0001"+
		"\u0000\u0000\u0000\u0550\u05c1\u0001\u0000\u0000\u0000\u0551\u0552\n\u000e"+
		"\u0000\u0000\u0552\u0553\u0007\u0005\u0000\u0000\u0553\u05c0\u0003\u00da"+
		"m\u000f\u0554\u0555\n\r\u0000\u0000\u0555\u0556\u0007\u0006\u0000\u0000"+
		"\u0556\u05c0\u0003\u00dam\u000e\u0557\u055f\n\f\u0000\u0000\u0558\u0559"+
		"\u0005u\u0000\u0000\u0559\u0560\u0005u\u0000\u0000\u055a\u055b\u0005v"+
		"\u0000\u0000\u055b\u055c\u0005v\u0000\u0000\u055c\u0560\u0005v\u0000\u0000"+
		"\u055d\u055e\u0005v\u0000\u0000\u055e\u0560\u0005v\u0000\u0000\u055f\u0558"+
		"\u0001\u0000\u0000\u0000\u055f\u055a\u0001\u0000\u0000\u0000\u055f\u055d"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u05c0"+
		"\u0003\u00dam\r\u0562\u0563\n\n\u0000\u0000\u0563\u0564\u0007\u0007\u0000"+
		"\u0000\u0564\u05c0\u0003\u00dam\u000b\u0565\u0566\n\t\u0000\u0000\u0566"+
		"\u0567\u0007\b\u0000\u0000\u0567\u05c0\u0003\u00dam\n\u0568\u0569\n\b"+
		"\u0000\u0000\u0569\u056a\u0005r\u0000\u0000\u056a\u05c0\u0003\u00dam\t"+
		"\u056b\u056c\n\u0007\u0000\u0000\u056c\u056d\u0005q\u0000\u0000\u056d"+
		"\u05c0\u0003\u00dam\b\u056e\u056f\n\u0006\u0000\u0000\u056f\u0570\u0005"+
		"p\u0000\u0000\u0570\u05c0\u0003\u00dam\u0007\u0571\u0572\n\u0005\u0000"+
		"\u0000\u0572\u0573\u0005o\u0000\u0000\u0573\u05c0\u0003\u00dam\u0006\u0574"+
		"\u0575\n\u0004\u0000\u0000\u0575\u0576\u0005n\u0000\u0000\u0576\u05c0"+
		"\u0003\u00dam\u0005\u0577\u0578\n\u0003\u0000\u0000\u0578\u0579\u0005"+
		"m\u0000\u0000\u0579\u057a\u0003\u00dam\u0000\u057a\u057b\u0005R\u0000"+
		"\u0000\u057b\u057c\u0003\u00dam\u0003\u057c\u05c0\u0001\u0000\u0000\u0000"+
		"\u057d\u057e\n\u0002\u0000\u0000\u057e\u057f\u0007\t\u0000\u0000\u057f"+
		"\u05c0\u0003\u00dam\u0002\u0580\u0581\n\u001e\u0000\u0000\u0581\u0582"+
		"\u0005;\u0000\u0000\u0582\u05c0\u0003\u011e\u008f\u0000\u0583\u0584\n"+
		"\u001d\u0000\u0000\u0584\u0585\u0005;\u0000\u0000\u0585\u0586\u0003\u011e"+
		"\u008f\u0000\u0586\u0588\u0005L\u0000\u0000\u0587\u0589\u0003\u00d6k\u0000"+
		"\u0588\u0587\u0001\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000\u0000"+
		"\u0589\u058a\u0001\u0000\u0000\u0000\u058a\u058b\u0005M\u0000\u0000\u058b"+
		"\u05c0\u0001\u0000\u0000\u0000\u058c\u058d\n\u001c\u0000\u0000\u058d\u058e"+
		"\u0005;\u0000\u0000\u058e\u05c0\u0005N\u0000\u0000\u058f\u0590\n\u001b"+
		"\u0000\u0000\u0590\u0591\u0005;\u0000\u0000\u0591\u0593\u0005\u0088\u0000"+
		"\u0000\u0592\u0594\u0003\u00f8|\u0000\u0593\u0592\u0001\u0000\u0000\u0000"+
		"\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0595\u0001\u0000\u0000\u0000"+
		"\u0595\u05c0\u0003\u00ecv\u0000\u0596\u0597\n\u001a\u0000\u0000\u0597"+
		"\u0599\u0005;\u0000\u0000\u0598\u059a\u0003\u00f8|\u0000\u0599\u0598\u0001"+
		"\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a\u059b\u0001"+
		"\u0000\u0000\u0000\u059b\u059d\u0005O\u0000\u0000\u059c\u059e\u0003\u0108"+
		"\u0084\u0000\u059d\u059c\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000"+
		"\u0000\u0000\u059e\u05c0\u0001\u0000\u0000\u0000\u059f\u05a0\n\u0019\u0000"+
		"\u0000\u05a0\u05a1\u0005;\u0000\u0000\u05a1\u05a2\u0003\u00f8|\u0000\u05a2"+
		"\u05a3\u0003\u011e\u008f\u0000\u05a3\u05a5\u0005L\u0000\u0000\u05a4\u05a6"+
		"\u0003\u00d6k\u0000\u05a5\u05a4\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005"+
		"M\u0000\u0000\u05a8\u05c0\u0001\u0000\u0000\u0000\u05a9\u05aa\n\u0018"+
		"\u0000\u0000\u05aa\u05ab\u0005/\u0000\u0000\u05ab\u05ac\u0003\u00dam\u0000"+
		"\u05ac\u05ad\u00050\u0000\u0000\u05ad\u05c0\u0001\u0000\u0000\u0000\u05ae"+
		"\u05af\n\u0015\u0000\u0000\u05af\u05c0\u0007\n\u0000\u0000\u05b0\u05b1"+
		"\n\u0012\u0000\u0000\u05b1\u05b3\u0005\u00b3\u0000\u0000\u05b2\u05b4\u0003"+
		"\u0106\u0083\u0000\u05b3\u05b2\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b7\u0001\u0000\u0000\u0000\u05b5\u05b8\u0003"+
		"\u011e\u008f\u0000\u05b6\u05b8\u0005\u0088\u0000\u0000\u05b7\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b7\u05b6\u0001\u0000\u0000\u0000\u05b8\u05c0\u0001"+
		"\u0000\u0000\u0000\u05b9\u05ba\n\u000b\u0000\u0000\u05ba\u05bd\u0005y"+
		"\u0000\u0000\u05bb\u05be\u0003\u0114\u008a\u0000\u05bc\u05be\u0003\u00fe"+
		"\u007f\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05bd\u05bc\u0001\u0000"+
		"\u0000\u0000\u05be\u05c0\u0001\u0000\u0000\u0000\u05bf\u0551\u0001\u0000"+
		"\u0000\u0000\u05bf\u0554\u0001\u0000\u0000\u0000\u05bf\u0557\u0001\u0000"+
		"\u0000\u0000\u05bf\u0562\u0001\u0000\u0000\u0000\u05bf\u0565\u0001\u0000"+
		"\u0000\u0000\u05bf\u0568\u0001\u0000\u0000\u0000\u05bf\u056b\u0001\u0000"+
		"\u0000\u0000\u05bf\u056e\u0001\u0000\u0000\u0000\u05bf\u0571\u0001\u0000"+
		"\u0000\u0000\u05bf\u0574\u0001\u0000\u0000\u0000\u05bf\u0577\u0001\u0000"+
		"\u0000\u0000\u05bf\u057d\u0001\u0000\u0000\u0000\u05bf\u0580\u0001\u0000"+
		"\u0000\u0000\u05bf\u0583\u0001\u0000\u0000\u0000\u05bf\u058c\u0001\u0000"+
		"\u0000\u0000\u05bf\u058f\u0001\u0000\u0000\u0000\u05bf\u0596\u0001\u0000"+
		"\u0000\u0000\u05bf\u059f\u0001\u0000\u0000\u0000\u05bf\u05a9\u0001\u0000"+
		"\u0000\u0000\u05bf\u05ae\u0001\u0000\u0000\u0000\u05bf\u05b0\u0001\u0000"+
		"\u0000\u0000\u05bf\u05b9\u0001\u0000\u0000\u0000\u05c0\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c2\u00db\u0001\u0000\u0000\u0000\u05c3\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c9\u0003\u00fe\u007f\u0000\u05c5\u05c6\u0005r\u0000"+
		"\u0000\u05c6\u05c8\u0003\u00fe\u007f\u0000\u05c7\u05c5\u0001\u0000\u0000"+
		"\u0000\u05c8\u05cb\u0001\u0000\u0000\u0000\u05c9\u05c7\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u00dd\u0001\u0000\u0000"+
		"\u0000\u05cb\u05c9\u0001\u0000\u0000\u0000\u05cc\u05d7\u0003\u011e\u008f"+
		"\u0000\u05cd\u05cf\u0005L\u0000\u0000\u05ce\u05d0\u0003h4\u0000\u05cf"+
		"\u05ce\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0"+
		"\u05d1\u0001\u0000\u0000\u0000\u05d1\u05d7\u0005M\u0000\u0000\u05d2\u05d3"+
		"\u0005L\u0000\u0000\u05d3\u05d4\u0003\u00e0p\u0000\u05d4\u05d5\u0005M"+
		"\u0000\u0000\u05d5\u05d7\u0001\u0000\u0000\u0000\u05d6\u05cc\u0001\u0000"+
		"\u0000\u0000\u05d6\u05cd\u0001\u0000\u0000\u0000\u05d6\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d7\u00df\u0001\u0000\u0000\u0000\u05d8\u05dd\u0003\u011e"+
		"\u008f\u0000\u05d9\u05da\u0005J\u0000\u0000\u05da\u05dc\u0003\u011e\u008f"+
		"\u0000\u05db\u05d9\u0001\u0000\u0000\u0000\u05dc\u05df\u0001\u0000\u0000"+
		"\u0000\u05dd\u05db\u0001\u0000\u0000\u0000\u05dd\u05de\u0001\u0000\u0000"+
		"\u0000\u05de\u00e1\u0001\u0000\u0000\u0000\u05df\u05dd\u0001\u0000\u0000"+
		"\u0000\u05e0\u05fe\u0003\u00a2Q\u0000\u05e1\u05e2\u0005L\u0000\u0000\u05e2"+
		"\u05e3\u0003\u00dam\u0000\u05e3\u05e4\u0005M\u0000\u0000\u05e4\u05fe\u0001"+
		"\u0000\u0000\u0000\u05e5\u05fe\u0005N\u0000\u0000\u05e6\u05fe\u0005O\u0000"+
		"\u0000\u05e7\u05fe\u0003r9\u0000\u05e8\u05fe\u0003\u011e\u008f\u0000\u05e9"+
		"\u05ed\u0003^/\u0000\u05ea\u05ec\u0003\u0102\u0081\u0000\u05eb\u05ea\u0001"+
		"\u0000\u0000\u0000\u05ec\u05ef\u0001\u0000\u0000\u0000\u05ed\u05eb\u0001"+
		"\u0000\u0000\u0000\u05ed\u05ee\u0001\u0000\u0000\u0000\u05ee\u05f0\u0001"+
		"\u0000\u0000\u0000\u05ef\u05ed\u0001\u0000\u0000\u0000\u05f0\u05f1\u0005"+
		";\u0000\u0000\u05f1\u05f2\u0005E\u0000\u0000\u05f2\u05fe\u0001\u0000\u0000"+
		"\u0000\u05f3\u05f7\u0003\u0104\u0082\u0000\u05f4\u05f6\u0003\u0102\u0081"+
		"\u0000\u05f5\u05f4\u0001\u0000\u0000\u0000\u05f6\u05f9\u0001\u0000\u0000"+
		"\u0000\u05f7\u05f5\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000"+
		"\u0000\u05f8\u05fa\u0001\u0000\u0000\u0000\u05f9\u05f7\u0001\u0000\u0000"+
		"\u0000\u05fa\u05fb\u0005;\u0000\u0000\u05fb\u05fc\u0005E\u0000\u0000\u05fc"+
		"\u05fe\u0001\u0000\u0000\u0000\u05fd\u05e0\u0001\u0000\u0000\u0000\u05fd"+
		"\u05e1\u0001\u0000\u0000\u0000\u05fd\u05e5\u0001\u0000\u0000\u0000\u05fd"+
		"\u05e6\u0001\u0000\u0000\u0000\u05fd\u05e7\u0001\u0000\u0000\u0000\u05fd"+
		"\u05e8\u0001\u0000\u0000\u0000\u05fd\u05e9\u0001\u0000\u0000\u0000\u05fd"+
		"\u05f3\u0001\u0000\u0000\u0000\u05fe\u00e3\u0001\u0000\u0000\u0000\u05ff"+
		"\u0600\u0003^/\u0000\u0600\u0601\u0005;\u0000\u0000\u0601\u0603\u0001"+
		"\u0000\u0000\u0000\u0602\u05ff\u0001\u0000\u0000\u0000\u0602\u0603\u0001"+
		"\u0000\u0000\u0000\u0603\u0604\u0001\u0000\u0000\u0000\u0604\u0605\u0003"+
		"z=\u0000\u0605\u0607\u0003\u011e\u008f\u0000\u0606\u0608\u0003\u0106\u0083"+
		"\u0000\u0607\u0606\u0001\u0000\u0000\u0000\u0607\u0608\u0001\u0000\u0000"+
		"\u0000\u0608\u00e5\u0001\u0000\u0000\u0000\u0609\u060a\u0003\u00f8|\u0000"+
		"\u060a\u060b\u0003\u00e8t\u0000\u060b\u060c\u0003\u00f2y\u0000\u060c\u0616"+
		"\u0001\u0000\u0000\u0000\u060d\u060e\u0003z=\u0000\u060e\u0613\u0003\u00e8"+
		"t\u0000\u060f\u0610\u0003z=\u0000\u0610\u0611\u0003\u00eew\u0000\u0611"+
		"\u0614\u0001\u0000\u0000\u0000\u0612\u0614\u0003\u00f2y\u0000\u0613\u060f"+
		"\u0001\u0000\u0000\u0000\u0613\u0612\u0001\u0000\u0000\u0000\u0614\u0616"+
		"\u0001\u0000\u0000\u0000\u0615\u0609\u0001\u0000\u0000\u0000\u0615\u060d"+
		"\u0001\u0000\u0000\u0000\u0616\u00e7\u0001\u0000\u0000\u0000\u0617\u0618"+
		"\u0003z=\u0000\u0618\u061a\u0003\u011e\u008f\u0000\u0619\u061b\u0003\u00f4"+
		"z\u0000\u061a\u0619\u0001\u0000\u0000\u0000\u061a\u061b\u0001\u0000\u0000"+
		"\u0000\u061b\u061f\u0001\u0000\u0000\u0000\u061c\u061e\u0003\u00eau\u0000"+
		"\u061d\u061c\u0001\u0000\u0000\u0000\u061e\u0621\u0001\u0000\u0000\u0000"+
		"\u061f\u061d\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000"+
		"\u0620\u0624\u0001\u0000\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000"+
		"\u0622\u0624\u0003\u0104\u0082\u0000\u0623\u0617\u0001\u0000\u0000\u0000"+
		"\u0623\u0622\u0001\u0000\u0000\u0000\u0624\u00e9\u0001\u0000\u0000\u0000"+
		"\u0625\u0626\u0005;\u0000\u0000\u0626\u0627\u0003z=\u0000\u0627\u0629"+
		"\u0003\u011e\u008f\u0000\u0628\u062a\u0003\u00f4z\u0000\u0629\u0628\u0001"+
		"\u0000\u0000\u0000\u0629\u062a\u0001\u0000\u0000\u0000\u062a\u00eb\u0001"+
		"\u0000\u0000\u0000\u062b\u062c\u0003z=\u0000\u062c\u062e\u0003\u011e\u008f"+
		"\u0000\u062d\u062f\u0003\u00f6{\u0000\u062e\u062d\u0001\u0000\u0000\u0000"+
		"\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000\u0000"+
		"\u0630\u0631\u0003\u00f2y\u0000\u0631\u00ed\u0001\u0000\u0000\u0000\u0632"+
		"\u0649\u0005/\u0000\u0000\u0633\u0637\u00050\u0000\u0000\u0634\u0636\u0003"+
		"\u0102\u0081\u0000\u0635\u0634\u0001\u0000\u0000\u0000\u0636\u0639\u0001"+
		"\u0000\u0000\u0000\u0637\u0635\u0001\u0000\u0000\u0000\u0637\u0638\u0001"+
		"\u0000\u0000\u0000\u0638\u063a\u0001\u0000\u0000\u0000\u0639\u0637\u0001"+
		"\u0000\u0000\u0000\u063a\u064a\u0003\\.\u0000\u063b\u063c\u0003\u00d8"+
		"l\u0000\u063c\u0640\u00050\u0000\u0000\u063d\u063f\u0003\u00f0x\u0000"+
		"\u063e\u063d\u0001\u0000\u0000\u0000\u063f\u0642\u0001\u0000\u0000\u0000"+
		"\u0640\u063e\u0001\u0000\u0000\u0000\u0640\u0641\u0001\u0000\u0000\u0000"+
		"\u0641\u0646\u0001\u0000\u0000\u0000\u0642\u0640\u0001\u0000\u0000\u0000"+
		"\u0643\u0645\u0003\u0102\u0081\u0000\u0644\u0643\u0001\u0000\u0000\u0000"+
		"\u0645\u0648\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000\u0000\u0000"+
		"\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u064a\u0001\u0000\u0000\u0000"+
		"\u0648\u0646\u0001\u0000\u0000\u0000\u0649\u0633\u0001\u0000\u0000\u0000"+
		"\u0649\u063b\u0001\u0000\u0000\u0000\u064a\u00ef\u0001\u0000\u0000\u0000"+
		"\u064b\u064c\u0003z=\u0000\u064c\u064d\u0005/\u0000\u0000\u064d\u064e"+
		"\u0003\u00d8l\u0000\u064e\u064f\u00050\u0000\u0000\u064f\u00f1\u0001\u0000"+
		"\u0000\u0000\u0650\u0652\u0003\u010a\u0085\u0000\u0651\u0653\u0003<\u001e"+
		"\u0000\u0652\u0651\u0001\u0000\u0000\u0000\u0652\u0653\u0001\u0000\u0000"+
		"\u0000\u0653\u00f3\u0001\u0000\u0000\u0000\u0654\u0655\u0005u\u0000\u0000"+
		"\u0655\u0658\u0005v\u0000\u0000\u0656\u0658\u0003\u0106\u0083\u0000\u0657"+
		"\u0654\u0001\u0000\u0000\u0000\u0657\u0656\u0001\u0000\u0000\u0000\u0658"+
		"\u00f5\u0001\u0000\u0000\u0000\u0659\u065a\u0005u\u0000\u0000\u065a\u065d"+
		"\u0005v\u0000\u0000\u065b\u065d\u0003\u00f8|\u0000\u065c\u0659\u0001\u0000"+
		"\u0000\u0000\u065c\u065b\u0001\u0000\u0000\u0000\u065d\u00f7\u0001\u0000"+
		"\u0000\u0000\u065e\u065f\u0005u\u0000\u0000\u065f\u0660\u0003\u00fa}\u0000"+
		"\u0660\u0661\u0005v\u0000\u0000\u0661\u00f9\u0001\u0000\u0000\u0000\u0662"+
		"\u0667\u0003\u00fe\u007f\u0000\u0663\u0664\u0005J\u0000\u0000\u0664\u0666"+
		"\u0003\u00fe\u007f\u0000\u0665\u0663\u0001\u0000\u0000\u0000\u0666\u0669"+
		"\u0001\u0000\u0000\u0000\u0667\u0665\u0001\u0000\u0000\u0000\u0667\u0668"+
		"\u0001\u0000\u0000\u0000\u0668\u00fb\u0001\u0000\u0000\u0000\u0669\u0667"+
		"\u0001\u0000\u0000\u0000\u066a\u066f\u0003\u00fe\u007f\u0000\u066b\u066c"+
		"\u0005J\u0000\u0000\u066c\u066e\u0003\u00fe\u007f\u0000\u066d\u066b\u0001"+
		"\u0000\u0000\u0000\u066e\u0671\u0001\u0000\u0000\u0000\u066f\u066d\u0001"+
		"\u0000\u0000\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u00fd\u0001"+
		"\u0000\u0000\u0000\u0671\u066f\u0001\u0000\u0000\u0000\u0672\u0673\u0003"+
		"z=\u0000\u0673\u0677\u0003\u0100\u0080\u0000\u0674\u0676\u0003\u0102\u0081"+
		"\u0000\u0675\u0674\u0001\u0000\u0000\u0000\u0676\u0679\u0001\u0000\u0000"+
		"\u0000\u0677\u0675\u0001\u0000\u0000\u0000\u0677\u0678\u0001\u0000\u0000"+
		"\u0000\u0678\u00ff\u0001\u0000\u0000\u0000\u0679\u0677\u0001\u0000\u0000"+
		"\u0000\u067a\u067d\u0003^/\u0000\u067b\u067d\u0003\u0104\u0082\u0000\u067c"+
		"\u067a\u0001\u0000\u0000\u0000\u067c\u067b\u0001\u0000\u0000\u0000\u067d"+
		"\u0101\u0001\u0000\u0000\u0000\u067e\u067f\u0003z=\u0000\u067f\u0680\u0005"+
		"/\u0000\u0000\u0680\u0681\u00050\u0000\u0000\u0681\u0103\u0001\u0000\u0000"+
		"\u0000\u0682\u0683\u0007\u000b\u0000\u0000\u0683\u0105\u0001\u0000\u0000"+
		"\u0000\u0684\u0685\u0005u\u0000\u0000\u0685\u068a\u0003b1\u0000\u0686"+
		"\u0687\u0005J\u0000\u0000\u0687\u0689\u0003b1\u0000\u0688\u0686\u0001"+
		"\u0000\u0000\u0000\u0689\u068c\u0001\u0000\u0000\u0000\u068a\u0688\u0001"+
		"\u0000\u0000\u0000\u068a\u068b\u0001\u0000\u0000\u0000\u068b\u068d\u0001"+
		"\u0000\u0000\u0000\u068c\u068a\u0001\u0000\u0000\u0000\u068d\u068e\u0005"+
		"v\u0000\u0000\u068e\u0107\u0001\u0000\u0000\u0000\u068f\u0691\u0005L\u0000"+
		"\u0000\u0690\u0692\u0003\u00d6k\u0000\u0691\u0690\u0001\u0000\u0000\u0000"+
		"\u0691\u0692\u0001\u0000\u0000\u0000\u0692\u0693\u0001\u0000\u0000\u0000"+
		"\u0693\u069e\u0005M\u0000\u0000\u0694\u0695\u0005;\u0000\u0000\u0695\u069b"+
		"\u0003\u011e\u008f\u0000\u0696\u0698\u0005L\u0000\u0000\u0697\u0699\u0003"+
		"\u00d6k\u0000\u0698\u0697\u0001\u0000\u0000\u0000\u0698\u0699\u0001\u0000"+
		"\u0000\u0000\u0699\u069a\u0001\u0000\u0000\u0000\u069a\u069c\u0005M\u0000"+
		"\u0000\u069b\u0696\u0001\u0000\u0000\u0000\u069b\u069c\u0001\u0000\u0000"+
		"\u0000\u069c\u069e\u0001\u0000\u0000\u0000\u069d\u068f\u0001\u0000\u0000"+
		"\u0000\u069d\u0694\u0001\u0000\u0000\u0000\u069e\u0109\u0001\u0000\u0000"+
		"\u0000\u069f\u06a1\u0005L\u0000\u0000\u06a0\u06a2\u0003\u00d6k\u0000\u06a1"+
		"\u06a0\u0001\u0000\u0000\u0000\u06a1\u06a2\u0001\u0000\u0000\u0000\u06a2"+
		"\u06a3\u0001\u0000\u0000\u0000\u06a3\u06a4\u0005M\u0000\u0000\u06a4\u010b"+
		"\u0001\u0000\u0000\u0000\u06a5\u06a6\u0003\u010e\u0087\u0000\u06a6\u010d"+
		"\u0001\u0000\u0000\u0000\u06a7\u06ab\u0003\u0110\u0088\u0000\u06a8\u06ab"+
		"\u0003\u0118\u008c\u0000\u06a9\u06ab\u0003\u0114\u008a\u0000\u06aa\u06a7"+
		"\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000\u0000\u0000\u06aa\u06a9"+
		"\u0001\u0000\u0000\u0000\u06ab\u010f\u0001\u0000\u0000\u0000\u06ac\u06ad"+
		"\u0003\u0114\u008a\u0000\u06ad\u06ae\u0003\u0112\u0089\u0000\u06ae\u06af"+
		"\u0003\u00d8l\u0000\u06af\u0111\u0001\u0000\u0000\u0000\u06b0\u06b1\u0007"+
		"\f\u0000\u0000\u06b1\u0113\u0001\u0000\u0000\u0000\u06b2\u06b9\u0003\u0116"+
		"\u008b\u0000\u06b3\u06b4\u0005L\u0000\u0000\u06b4\u06b5\u0003\u010e\u0087"+
		"\u0000\u06b5\u06b6\u0005M\u0000\u0000\u06b6\u06b9\u0001\u0000\u0000\u0000"+
		"\u06b7\u06b9\u0003\u0118\u008c\u0000\u06b8\u06b2\u0001\u0000\u0000\u0000"+
		"\u06b8\u06b3\u0001\u0000\u0000\u0000\u06b8\u06b7\u0001\u0000\u0000\u0000"+
		"\u06b9\u0115\u0001\u0000\u0000\u0000\u06ba\u06bc\u0003\n\u0005\u0000\u06bb"+
		"\u06ba\u0001\u0000\u0000\u0000\u06bc\u06bf\u0001\u0000\u0000\u0000\u06bd"+
		"\u06bb\u0001\u0000\u0000\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be"+
		"\u06c0\u0001\u0000\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000\u06c0"+
		"\u06c1\u0003\u00fe\u007f\u0000\u06c1\u06c2\u0003\u011e\u008f\u0000\u06c2"+
		"\u06c5\u0001\u0000\u0000\u0000\u06c3\u06c5\u0005\u00e0\u0000\u0000\u06c4"+
		"\u06bd\u0001\u0000\u0000\u0000\u06c4\u06c3\u0001\u0000\u0000\u0000\u06c5"+
		"\u0117\u0001\u0000\u0000\u0000\u06c6\u06c8\u0003\n\u0005\u0000\u06c7\u06c6"+
		"\u0001\u0000\u0000\u0000\u06c8\u06cb\u0001\u0000\u0000\u0000\u06c9\u06c7"+
		"\u0001\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000\u0000\u0000\u06ca\u06cc"+
		"\u0001\u0000\u0000\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cc\u06cd"+
		"\u0003\u00fe\u007f\u0000\u06cd\u06cf\u0005L\u0000\u0000\u06ce\u06d0\u0003"+
		"\u011a\u008d\u0000\u06cf\u06ce\u0001\u0000\u0000\u0000\u06cf\u06d0\u0001"+
		"\u0000\u0000\u0000\u06d0\u06d1\u0001\u0000\u0000\u0000\u06d1\u06d3\u0005"+
		"M\u0000\u0000\u06d2\u06d4\u0003\u011e\u008f\u0000\u06d3\u06d2\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000\u06d4\u0119\u0001\u0000"+
		"\u0000\u0000\u06d5\u06da\u0003\u010e\u0087\u0000\u06d6\u06d7\u0005J\u0000"+
		"\u0000\u06d7\u06d9\u0003\u010e\u0087\u0000\u06d8\u06d6\u0001\u0000\u0000"+
		"\u0000\u06d9\u06dc\u0001\u0000\u0000\u0000\u06da\u06d8\u0001\u0000\u0000"+
		"\u0000\u06da\u06db\u0001\u0000\u0000\u0000\u06db\u011b\u0001\u0000\u0000"+
		"\u0000\u06dc\u06da\u0001\u0000\u0000\u0000\u06dd\u06de\u0005\u00d3\u0000"+
		"\u0000\u06de\u06e3\u0003^/\u0000\u06df\u06e0\u0005J\u0000\u0000\u06e0"+
		"\u06e2\u0003^/\u0000\u06e1\u06df\u0001\u0000\u0000\u0000\u06e2\u06e5\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001"+
		"\u0000\u0000\u0000\u06e4\u011d\u0001\u0000\u0000\u0000\u06e5\u06e3\u0001"+
		"\u0000\u0000\u0000\u06e6\u06e7\u0007\r\u0000\u0000\u06e7\u011f\u0001\u0000"+
		"\u0000\u0000\u00d4\u0121\u0126\u012c\u0138\u013d\u0142\u0147\u014e\u0150"+
		"\u0157\u0168\u016c\u0171\u0174\u0177\u017a\u0181\u0185\u018b\u0194\u0199"+
		"\u019c\u01ab\u01b2\u01b7\u01c9\u01d1\u01dc\u01e4\u01ea\u01f0\u01f3\u01f6"+
		"\u01ff\u0205\u0208\u020e\u0214\u0217\u021a\u0225\u022e\u0235\u023b\u023f"+
		"\u0249\u024c\u0254\u0258\u025e\u0264\u0269\u0274\u0279\u0282\u0285\u028d"+
		"\u0291\u029a\u02a1\u02a6\u02ac\u02ae\u02b3\u02b8\u02c0\u02c3\u02c6\u02cd"+
		"\u02d2\u02d9\u02e0\u02e3\u02e5\u02ef\u02f4\u02fd\u0302\u0305\u030a\u0313"+
		"\u031f\u032e\u033b\u0343\u0346\u034d\u0357\u035f\u0362\u0365\u0372\u037a"+
		"\u037f\u0384\u038d\u0391\u0395\u0399\u039d\u039f\u03a7\u03ab\u03b4\u03b9"+
		"\u03bf\u03c8\u03ce\u03d4\u03df\u03e4\u03ed\u03f4\u03f7\u03fe\u0406\u041b"+
		"\u041e\u0421\u0429\u042d\u043a\u0443\u0448\u0453\u0460\u0465\u046b\u046e"+
		"\u0473\u0490\u049b\u04a4\u04ad\u04b2\u04b7\u04c2\u04c7\u04cf\u04d4\u04d9"+
		"\u04dd\u04df\u04e6\u04ec\u04f1\u04f7\u04fb\u04ff\u0502\u0506\u050b\u0520"+
		"\u052a\u0537\u053b\u0540\u054d\u054f\u055f\u0588\u0593\u0599\u059d\u05a5"+
		"\u05b3\u05b7\u05bd\u05bf\u05c1\u05c9\u05cf\u05d6\u05dd\u05ed\u05f7\u05fd"+
		"\u0602\u0607\u0613\u0615\u061a\u061f\u0623\u0629\u062e\u0637\u0640\u0646"+
		"\u0649\u0652\u0657\u065c\u0667\u066f\u0677\u067c\u068a\u0691\u0698\u069b"+
		"\u069d\u06a1\u06aa\u06b8\u06bd\u06c4\u06c9\u06cf\u06d3\u06da\u06e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}