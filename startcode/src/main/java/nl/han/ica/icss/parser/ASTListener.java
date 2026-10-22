package nl.han.ica.icss.parser;

import nl.han.ica.datastructures.HANStack;
import nl.han.ica.datastructures.IHANStack;
import nl.han.ica.icss.ast.*;
import nl.han.ica.icss.ast.literals.*;
import nl.han.ica.icss.ast.operations.AddOperation;
import nl.han.ica.icss.ast.operations.MultiplyOperation;
import nl.han.ica.icss.ast.operations.SubtractOperation;
import nl.han.ica.icss.ast.selectors.*;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {
	
	//Accumulator attributes:
	private AST ast;

	//Use this to keep track of the parent nodes when recursively traversing the ast
	private IHANStack<ASTNode> currentContainer;

	public ASTListener() {
		ast = new AST();
		currentContainer = new HANStack<>();
	}
    public AST getAST() {
        return ast;
    }


    @Override
    public void enterStylesheet(ICSSParser.StylesheetContext ctx) {
        ASTNode stylesheet = new Stylesheet();
        currentContainer.push(stylesheet);
    }

    @Override
    public void exitStylesheet(ICSSParser.StylesheetContext ctx) {
        Stylesheet stylesheet = (Stylesheet)currentContainer.pop();
        ast.root = stylesheet;
    }

    @Override
    public void enterAtRule(ICSSParser.AtRuleContext ctx) {
        AtRule atRule = new AtRule(ctx.LOWER_IDENT().getText());
        currentContainer.push(atRule);
    }

    @Override
    public void exitAtRule(ICSSParser.AtRuleContext ctx) {
        AtRule atRule = (AtRule) currentContainer.pop();
        currentContainer.peek().addChild(atRule);
    }

    @Override
    public void enterStylerule(ICSSParser.StyleruleContext ctx) {
        ASTNode styleRule = new Stylerule();
        currentContainer.push(styleRule);
    }

    @Override
    public void exitStylerule(ICSSParser.StyleruleContext ctx) {
        Stylerule styleRule = (Stylerule)currentContainer.pop();
        currentContainer.peek().addChild(styleRule);
    }

    @Override
    public void enterVariableAssignment(ICSSParser.VariableAssignmentContext ctx) {
        VariableAssignment variableAssignment = new VariableAssignment();
        currentContainer.push(variableAssignment);
    }

    @Override
    public void exitVariableAssignment(ICSSParser.VariableAssignmentContext ctx) {
        VariableAssignment assignment = (VariableAssignment) currentContainer.pop();
        currentContainer.peek().addChild(assignment);
    }

    @Override
    public void enterDeclaration(ICSSParser.DeclarationContext ctx) {
        Declaration declaration = new Declaration();
        currentContainer.push(declaration);
    }

    @Override
    public void exitDeclaration(ICSSParser.DeclarationContext ctx) {
        Declaration declaration = (Declaration) currentContainer.pop();
        currentContainer.peek().addChild(declaration);
    }

    @Override
    public void enterVariable(ICSSParser.VariableContext ctx) {
        ASTNode variableReference = new VariableReference(ctx.getText());
        currentContainer.push(variableReference);
    }

    @Override
    public void exitVariable(ICSSParser.VariableContext ctx) {
        VariableReference variable = (VariableReference) currentContainer.pop();
        currentContainer.peek().addChild(variable);
    }

    @Override
    public void enterProperty(ICSSParser.PropertyContext ctx) {
        ASTNode propertyName = new PropertyName(ctx.getText());
        currentContainer.push(propertyName);
    }

    @Override
    public void exitProperty(ICSSParser.PropertyContext ctx) {
        PropertyName property = (PropertyName) currentContainer.pop();
        currentContainer.peek().addChild(property);
    }

    @Override
    public void enterIfClause(ICSSParser.IfClauseContext ctx) {
        IfClause ifClause = new IfClause();
        currentContainer.push(ifClause);
    }

    @Override
    public void exitIfClause(ICSSParser.IfClauseContext ctx) {
        IfClause ifClause = (IfClause) currentContainer.pop();
        currentContainer.peek().addChild(ifClause);
    }

    @Override
    public void enterElseClause(ICSSParser.ElseClauseContext ctx) {
        ElseClause elseClause = new ElseClause();
        currentContainer.push(elseClause);
    }

    @Override
    public void exitElseClause(ICSSParser.ElseClauseContext ctx) {
        ElseClause elseClause = (ElseClause) currentContainer.pop();
        currentContainer.peek().addChild(elseClause);
    }

    @Override
    public void enterTagSelector(ICSSParser.TagSelectorContext ctx) {
        ASTNode tagSelector = new TagSelector(ctx.getText());
        currentContainer.push(tagSelector);
    }

    @Override
    public void exitTagSelector(ICSSParser.TagSelectorContext ctx) {
        TagSelector tagSelector = (TagSelector) currentContainer.pop();
        currentContainer.peek().addChild(tagSelector);
    }

    @Override
    public void enterClassSelector(ICSSParser.ClassSelectorContext ctx) {
        ASTNode classSelector = new ClassSelector(ctx.getText());
        currentContainer.push(classSelector);
    }

    @Override
    public void exitClassSelector(ICSSParser.ClassSelectorContext ctx) {
        ClassSelector selector = (ClassSelector) currentContainer.pop();
        currentContainer.peek().addChild(selector);
    }

    @Override
    public void enterIdSelector(ICSSParser.IdSelectorContext ctx) {
        ASTNode idSelector = new IdSelector(ctx.getText());
        currentContainer.push(idSelector);
    }

    @Override
    public void exitIdSelector(ICSSParser.IdSelectorContext ctx) {
        IdSelector idSelector = (IdSelector) currentContainer.pop();
        currentContainer.peek().addChild(idSelector);
    }

    @Override
    public void enterUniversalSelector(ICSSParser.UniversalSelectorContext ctx) {
        UniversalSelector universalSelector = new UniversalSelector();
        currentContainer.push(universalSelector);
    }

    @Override
    public void exitUniversalSelector(ICSSParser.UniversalSelectorContext ctx) {
        UniversalSelector selector = (UniversalSelector) currentContainer.pop();
        currentContainer.peek().addChild(selector);
    }

    @Override
    public void enterAttributeSelector(ICSSParser.AttributeSelectorContext ctx) {
        AttributeSelector attributeSelector = new AttributeSelector(ctx.attribute().getText());
        currentContainer.push(attributeSelector);
    }

    @Override
    public void exitAttributeSelector(ICSSParser.AttributeSelectorContext ctx) {
        AttributeSelector selector = (AttributeSelector) currentContainer.pop();
        currentContainer.peek().addChild(selector);
    }

    @Override
    public void enterMultiplyOperation(ICSSParser.MultiplyOperationContext ctx) {
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        currentContainer.push(multiplyOperation);
    }

    @Override
    public void exitMultiplyOperation(ICSSParser.MultiplyOperationContext ctx) {
        MultiplyOperation multiplyOperation = (MultiplyOperation) currentContainer.pop();
        currentContainer.peek().addChild(multiplyOperation);
    }

    @Override
    public void enterAddOperation(ICSSParser.AddOperationContext ctx) {
        AddOperation addOperation = new AddOperation();
        currentContainer.push(addOperation);
    }

    @Override
    public void exitAddOperation(ICSSParser.AddOperationContext ctx) {
        AddOperation addOperation = (AddOperation) currentContainer.pop();
        currentContainer.peek().addChild(addOperation);
    }

    @Override
    public void enterSubtractOperation(ICSSParser.SubtractOperationContext ctx) {
        SubtractOperation subtractOperation = new SubtractOperation();
        currentContainer.push(subtractOperation);
    }

    @Override
    public void exitSubtractOperation(ICSSParser.SubtractOperationContext ctx) {
        SubtractOperation subtractOperation = (SubtractOperation) currentContainer.pop();
        currentContainer.peek().addChild(subtractOperation);
    }

    @Override
    public void enterOperatorValues(ICSSParser.OperatorValuesContext ctx) {
    }

    @Override
    public void exitOperatorValues(ICSSParser.OperatorValuesContext ctx) {
    }

    @Override
    public void enterVariableReference(ICSSParser.VariableReferenceContext ctx) {
        VariableReference variableReference = new VariableReference(ctx.getText());
        currentContainer.push(variableReference);
    }

    @Override
    public void exitVariableReference(ICSSParser.VariableReferenceContext ctx) {
        VariableReference variableReference = (VariableReference) currentContainer.pop();
        currentContainer.peek().addChild(variableReference);
    }

    @Override
    public void enterKeyword(ICSSParser.KeywordContext ctx) {
        VariableReference keyword = new VariableReference(ctx.getText());
        currentContainer.push(keyword);
    }

    @Override
    public void exitKeyword(ICSSParser.KeywordContext ctx) {
        VariableReference keyword = (VariableReference) currentContainer.pop();
        currentContainer.peek().addChild(keyword);
    }

    @Override
    public void enterBool(ICSSParser.BoolContext ctx) {
        BoolLiteral bool = new BoolLiteral(ctx.getText());
        currentContainer.push(bool);
    }

    @Override
    public void exitBool(ICSSParser.BoolContext ctx) {
        BoolLiteral bool = (BoolLiteral) currentContainer.pop();
        currentContainer.peek().addChild(bool);
    }

    @Override
    public void enterColorValue(ICSSParser.ColorValueContext ctx) {
        ColorLiteral colorValue = new ColorLiteral(ctx.getText());
        currentContainer.push(colorValue);
    }

    @Override
    public void exitColorValue(ICSSParser.ColorValueContext ctx) {
        ColorLiteral colorValue = (ColorLiteral) currentContainer.pop();
        currentContainer.peek().addChild(colorValue);
    }

    @Override
    public void enterPixelSize(ICSSParser.PixelSizeContext ctx) {
        PixelLiteral pixelSize = new PixelLiteral(ctx.getText());
        currentContainer.push(pixelSize);
    }

    @Override
    public void exitPixelSize(ICSSParser.PixelSizeContext ctx) {
        PixelLiteral pixelSize = (PixelLiteral) currentContainer.pop();
        currentContainer.peek().addChild(pixelSize);
    }

    @Override
    public void enterPercentage(ICSSParser.PercentageContext ctx) {
        PercentageLiteral percentage = new PercentageLiteral(ctx.getText());
        currentContainer.push(percentage);
    }

    @Override
    public void exitPercentage(ICSSParser.PercentageContext ctx) {
        PercentageLiteral percentage = (PercentageLiteral) currentContainer.pop();
        currentContainer.peek().addChild(percentage);
    }

    @Override
    public void enterScale(ICSSParser.ScaleContext ctx) {
        ScalarLiteral scale = new ScalarLiteral(ctx.getText());
        currentContainer.push(scale);
    }

    @Override
    public void exitScale(ICSSParser.ScaleContext ctx) {
        ScalarLiteral scale = (ScalarLiteral) currentContainer.pop();
        currentContainer.peek().addChild(scale);
    }
}