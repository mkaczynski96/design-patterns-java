package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposition implements Employee{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        employees.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
 }
