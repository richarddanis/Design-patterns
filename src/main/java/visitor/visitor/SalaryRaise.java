package visitor.visitor;

import visitor.model.Employee;

import java.util.HashMap;

public class SalaryRaise implements Visitor{

    private final HashMap<String, Integer> namePerSalary = new HashMap<>();

    public void visit(Employee employee) {
        int currentSalary = employee.getSalary();
        String name = employee.getName();
        double v = currentSalary * 1.03;
        Integer increasedSalary = (int) v;
        namePerSalary.put(name, increasedSalary);  //not the best solution
    }

    public int getResult() {
        return 0;
    }

    public HashMap<String, Integer> getIncreasedNamePerSalary() {
        return namePerSalary;
    }
}
