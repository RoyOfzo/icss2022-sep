// Generated from C:/Users/rwitt/OneDrive - HAN/school jaar 3/app/compiler opdracht/icss2022-sep/startcode/src/main/antlr4/nl/han/ica/icss/parser/ICSS.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ICSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(ICSSParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#idSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(ICSSParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#tagSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagSelector(ICSSParser.TagSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelector(ICSSParser.AttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(ICSSParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#universalSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalSelector(ICSSParser.UniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ICSSParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(ICSSParser.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#pseudoElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElement(ICSSParser.PseudoElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(ICSSParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ICSSParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ICSSParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(ICSSParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(ICSSParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#pixelSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixelSize(ICSSParser.PixelSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#colorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorValue(ICSSParser.ColorValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#nonOperatorValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonOperatorValues(ICSSParser.NonOperatorValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#operatorValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValues(ICSSParser.OperatorValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ICSSParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ICSSParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(ICSSParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(ICSSParser.IfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(ICSSParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ICSSParser.StatementContext ctx);
}