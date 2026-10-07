// Generated from c:/Users/rwitt/OneDrive - HAN/school jaar 3/app/compiler opdracht/icss2022-sep/startcode/src/main/antlr4/nl/han/ica/icss/parser/ICSS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(ICSSParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(ICSSParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ICSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ICSSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ICSSParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ICSSParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(ICSSParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(ICSSParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#percentage}.
	 * @param ctx the parse tree
	 */
	void enterPercentage(ICSSParser.PercentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#percentage}.
	 * @param ctx the parse tree
	 */
	void exitPercentage(ICSSParser.PercentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#pixelSize}.
	 * @param ctx the parse tree
	 */
	void enterPixelSize(ICSSParser.PixelSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#pixelSize}.
	 * @param ctx the parse tree
	 */
	void exitPixelSize(ICSSParser.PixelSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ICSSParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ICSSParser.LineContext ctx);
}