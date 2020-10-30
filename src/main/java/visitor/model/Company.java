package visitor.model;

import visitor.visitor.AverageSalary;
import visitor.visitor.NumberOfEmployee;
import visitor.visitor.NumberOfEmployeePerDepartment;
import visitor.visitor.SalaryRaise;
import visitor.visitor.TotalSalary;
import visitor.visitor.Visitor;

import java.util.Arrays;
import java.util.List;

public class Company {

    private final List<Employee> employeeList;

    public Company() {
        employeeList = Arrays.asList(
                new Employee("IT", 20, "John"),
                new Employee("HR", 15, "Foo"),
                new Employee("IT", 25, "Bar"),
                new Employee("TESTER", 35, "Doe"),
                new Employee("IT", 10, "Rep")
        );
    }

    public void generateCompanyReport() {
        Visitor totalSalary = new TotalSalary();
        Visitor avgSalary = new AverageSalary();
        Visitor numberOfEmployee = new NumberOfEmployee();
        NumberOfEmployeePerDepartment numberOfEmployeePerDepartment = new NumberOfEmployeePerDepartment();
        SalaryRaise salaryRaise = new SalaryRaise();

        for(Employee i: employeeList){
            i.accept(totalSalary);
            i.accept(avgSalary);
            i.accept(numberOfEmployee);
            i.accept(numberOfEmployeePerDepartment);
            i.accept(salaryRaise);
        }

        System.out.println(
                "Result for: " +  "\n" +
                        "Total salary:" + totalSalary.getResult() + "\n" +
                        "Average salary: " + avgSalary.getResult() + "\n" +
                        "Number of employee: " + numberOfEmployee.getResult() + "\n" +
                        "Number of employee per department: " + numberOfEmployeePerDepartment.departmentPerEmployeeNumber() + "\n" +
                        "Salary raise: " + salaryRaise.getIncreasedNamePerSalary()
        );
    }
}
