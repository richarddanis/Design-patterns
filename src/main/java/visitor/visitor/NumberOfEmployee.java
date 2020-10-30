package visitor.visitor;

import visitor.model.Employee;

public class NumberOfEmployee implements Visitor{

    int totalEmployee;

    public void visit(Employee employee) {
        totalEmployee++;
    }

    public int getResult() {
        return totalEmployee;
    }
}
