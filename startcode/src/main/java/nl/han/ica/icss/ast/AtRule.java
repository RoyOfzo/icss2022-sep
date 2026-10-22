package nl.han.ica.icss.ast;

import java.util.ArrayList;
import java.util.Objects;

public class AtRule extends ASTNode {
    public String name;
    public ASTNode expression;
    public ArrayList<ASTNode> body = new ArrayList<>();

    public AtRule() {
    }

    public AtRule(String name) {
        this.name = name;
    }

    @Override
    public ASTNode addChild(ASTNode child) {
        if(expression == null)
            expression = child;
        else
            body.add(child);

        return this;
    }

    @Override
    public ArrayList<ASTNode> getChildren() {

        ArrayList<ASTNode> children = new ArrayList<>();
        if(expression != null)
            children.add(expression);
        children.addAll(body);
        return children;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtRule atRule = (AtRule) o;
        return Objects.equals(name, atRule.name) &&
                Objects.equals(expression, atRule.expression) &&
                Objects.equals(body, atRule.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, expression, body);
    }
}
