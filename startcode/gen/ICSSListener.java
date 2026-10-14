// Generated from C:/Users/rwitt/OneDrive - HAN/school jaar 3/app/compiler opdracht/icss2022-sep/startcode/src/main/antlr4/nl/han/ica/icss/parser/ICSS.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link ICSSParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(ICSSParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(ICSSParser.ClassSelectorContext ctx);
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
	 * Enter a parse tree produced by {@link ICSSParser#tagSelector}.
	 * @param ctx the parse tree
	 */
	void enterTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#tagSelector}.
	 * @param ctx the parse tree
	 */
	void exitTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(ICSSParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(ICSSParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(ICSSParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(ICSSParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#universalSelector}.
	 * @param ctx the parse tree
	 */
	void enterUniversalSelector(ICSSParser.UniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#universalSelector}.
	 * @param ctx the parse tree
	 */
	void exitUniversalSelector(ICSSParser.UniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ICSSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ICSSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(ICSSParser.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(ICSSParser.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElement(ICSSParser.PseudoElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#pseudoElement}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElement(ICSSParser.PseudoElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(ICSSParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(ICSSParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ICSSParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ICSSParser.VariableContext ctx);
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
	 * Enter a parse tree produced by {@link ICSSParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void enterColorValue(ICSSParser.ColorValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#colorValue}.
	 * @param ctx the parse tree
	 */
	void exitColorValue(ICSSParser.ColorValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#nonOperatorValues}.
	 * @param ctx the parse tree
	 */
	void enterNonOperatorValues(ICSSParser.NonOperatorValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#nonOperatorValues}.
	 * @param ctx the parse tree
	 */
	void exitNonOperatorValues(ICSSParser.NonOperatorValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#operatorValues}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValues(ICSSParser.OperatorValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#operatorValues}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValues(ICSSParser.OperatorValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ICSSParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(ICSSParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(ICSSParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(ICSSParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(ICSSParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(ICSSParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(ICSSParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ICSSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ICSSParser.StatementContext ctx);
}