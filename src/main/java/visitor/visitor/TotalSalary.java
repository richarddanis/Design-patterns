package visitor.visitor;

import visitor.model.Employee;

public class TotalSalary implements Visitor{

    int totalSalary;

    public void visit(Employee employee) {
       totalSalary += employee.getSalary();
    }

    public int getResult() {
        return totalSalary;
    }
}
