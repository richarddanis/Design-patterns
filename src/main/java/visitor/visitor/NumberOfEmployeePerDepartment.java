package visitor.visitor;

import visitor.model.Employee;

import java.util.HashMap;

public class NumberOfEmployeePerDepartment implements Visitor{

    private final HashMap<String, Integer> departmentPerEmployeeNumber = new HashMap<>();

    public void visit(Employee employee) {
        String department = employee.getDepartment();
        if(departmentPerEmployeeNumber.containsKey(department)){
            departmentPerEmployeeNumber.put(department, departmentPerEmployeeNumber.get(department) + 1);
        } else {
            departmentPerEmployeeNumber.put(department, 1);
        }
    }

    public int getResult() {
        return 0;
    }

    public HashMap<String, Integer> departmentPerEmployeeNumber(){
        return departmentPerEmployeeNumber;
    }
}
