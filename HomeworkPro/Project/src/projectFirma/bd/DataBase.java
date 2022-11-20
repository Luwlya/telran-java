package projectFirma.bd;

import projectFirma.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Employee> employeesList = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public Employee findEmployee(String email) {
        for (Employee employee : employeesList) {
            if (employee.getEmail().equals(email)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return employeesList;
    }
}
