package visitor.visitor;

import visitor.model.Employee;

public interface Visitor {
    void visit(Employee employee);
    int getResult();
}
