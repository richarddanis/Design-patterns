package visitor.model;

import visitor.visitor.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
