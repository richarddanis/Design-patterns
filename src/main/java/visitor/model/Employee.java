package visitor.model;

import visitor.visitor.Visitor;

public class Employee implements Visitable {

    private String department;
    private int salary;
    private String name;

    public Employee(String department, int salary, String name) {
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
