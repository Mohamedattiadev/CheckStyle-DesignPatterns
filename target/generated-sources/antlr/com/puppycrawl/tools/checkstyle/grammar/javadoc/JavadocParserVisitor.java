// Generated from com/puppycrawl/tools/checkstyle/grammar/javadoc/JavadocParser.g4 by ANTLR 4.13.2
package com.puppycrawl.tools.checkstyle.grammar.javadoc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavadocParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavadocParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavadocParser#javadoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavadoc(JavadocParser.JavadocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(JavadocParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlElementStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementStart(JavadocParser.HtmlElementStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlElementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementEnd(JavadocParser.HtmlElementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JavadocParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(JavadocParser.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#pTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTagStart(JavadocParser.PTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#pTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPTagEnd(JavadocParser.PTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(JavadocParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#liTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiTagStart(JavadocParser.LiTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#liTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiTagEnd(JavadocParser.LiTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#li}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLi(JavadocParser.LiContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#trTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrTagStart(JavadocParser.TrTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#trTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrTagEnd(JavadocParser.TrTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTr(JavadocParser.TrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tdTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdTagStart(JavadocParser.TdTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tdTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTdTagEnd(JavadocParser.TdTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#td}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(JavadocParser.TdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#thTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThTagStart(JavadocParser.ThTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#thTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThTagEnd(JavadocParser.ThTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#th}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTh(JavadocParser.ThContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#bodyTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyTagStart(JavadocParser.BodyTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#bodyTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyTagEnd(JavadocParser.BodyTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JavadocParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#colgroupTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColgroupTagStart(JavadocParser.ColgroupTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#colgroupTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColgroupTagEnd(JavadocParser.ColgroupTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#colgroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColgroup(JavadocParser.ColgroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#ddTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdTagStart(JavadocParser.DdTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#ddTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdTagEnd(JavadocParser.DdTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#dd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDd(JavadocParser.DdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#dtTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtTagStart(JavadocParser.DtTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#dtTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtTagEnd(JavadocParser.DtTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDt(JavadocParser.DtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#headTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadTagStart(JavadocParser.HeadTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#headTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadTagEnd(JavadocParser.HeadTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(JavadocParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagStart(JavadocParser.HtmlTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagEnd(JavadocParser.HtmlTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(JavadocParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#optionTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionTagStart(JavadocParser.OptionTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#optionTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionTagEnd(JavadocParser.OptionTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(JavadocParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tbodyTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbodyTagStart(JavadocParser.TbodyTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tbodyTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbodyTagEnd(JavadocParser.TbodyTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbody(JavadocParser.TbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tfootTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfootTagStart(JavadocParser.TfootTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tfootTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfootTagEnd(JavadocParser.TfootTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#tfoot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfoot(JavadocParser.TfootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#theadTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheadTagStart(JavadocParser.TheadTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#theadTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheadTagEnd(JavadocParser.TheadTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#thead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThead(JavadocParser.TheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#singletonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletonElement(JavadocParser.SingletonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#emptyTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTag(JavadocParser.EmptyTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#areaTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaTag(JavadocParser.AreaTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#baseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTag(JavadocParser.BaseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#basefontTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasefontTag(JavadocParser.BasefontTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#brTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrTag(JavadocParser.BrTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#colTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTag(JavadocParser.ColTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#frameTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameTag(JavadocParser.FrameTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#hrTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHrTag(JavadocParser.HrTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#imgTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgTag(JavadocParser.ImgTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#inputTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTag(JavadocParser.InputTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#isindexTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsindexTag(JavadocParser.IsindexTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#linkTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkTag(JavadocParser.LinkTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#metaTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaTag(JavadocParser.MetaTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#paramTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamTag(JavadocParser.ParamTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#wrongSingletonTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongSingletonTag(JavadocParser.WrongSingletonTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#singletonTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingletonTagName(JavadocParser.SingletonTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(JavadocParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(JavadocParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JavadocParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#javadocTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavadocTag(JavadocParser.JavadocTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#javadocInlineTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavadocInlineTag(JavadocParser.JavadocInlineTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(JavadocParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(JavadocParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#embedTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedTag(JavadocParser.EmbedTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#keygenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeygenTag(JavadocParser.KeygenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#sourceTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceTag(JavadocParser.SourceTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#trackTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrackTag(JavadocParser.TrackTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#wbrTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWbrTag(JavadocParser.WbrTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#optgroupTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptgroupTagStart(JavadocParser.OptgroupTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#optgroupTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptgroupTagEnd(JavadocParser.OptgroupTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#optgroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptgroup(JavadocParser.OptgroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rbTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbTagStart(JavadocParser.RbTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rbTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbTagEnd(JavadocParser.RbTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRb(JavadocParser.RbContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rtTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtTagStart(JavadocParser.RtTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rtTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtTagEnd(JavadocParser.RtTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(JavadocParser.RtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rtcTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtcTagStart(JavadocParser.RtcTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rtcTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtcTagEnd(JavadocParser.RtcTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtc(JavadocParser.RtcContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rpTagStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTagStart(JavadocParser.RpTagStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rpTagEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTagEnd(JavadocParser.RpTagEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavadocParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp(JavadocParser.RpContext ctx);
}