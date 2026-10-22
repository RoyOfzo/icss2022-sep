package nl.han.ica.icss.ast.selectors;

import nl.han.ica.icss.ast.Selector;

import java.util.Objects;

public class AttributeSelector extends Selector {
    public String attribute;

    public AttributeSelector(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String getNodeLabel() {
        return "AttributeSelector [" + attribute + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeSelector that = (AttributeSelector) o;
        return Objects.equals(attribute, that.attribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute);
    }
}
