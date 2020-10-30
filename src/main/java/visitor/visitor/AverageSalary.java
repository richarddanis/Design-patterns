package visitor.visitor;

import visitor.model.Employee;

public class AverageSalary implements Visitor {

    private int totalSalary = 0;
    private int employeeCount = 0;

    public void visit(Employee employee) {
        totalSalary += employee.getSalary();
        employeeCount++;
    }

    public int getResult() {
        return totalSalary / employeeCount;
    }
}
