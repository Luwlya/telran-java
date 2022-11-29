package projectFirma.service;

import projectFirma.bd.DataBase;
import projectFirma.model.*;

import java.time.LocalDate;
import java.util.List;

public class Service {
    private DataBase dataBase = new DataBase();

    public Employee createEmployee(String name, String email, Role role, LocalDate startDate) {
        if (name.length() == 0) {
            return null;
        }
        Employee employee = null;
        switch (role) {
            case CEO:
                employee = new TopManager(name, email, role, startDate);
                break;
            case FINANCIAL_MANAGER:
            case PEOPLE_MANAGER:
            case MARKETING_MANAGER:
                employee = new MiddleManager(name, email, role, startDate);
                break;
            case LAWYER:
            case TRANSLATOR:
            case CORRECTOR:
                employee = new IndividualContributor(name, email, role, startDate);
                break;
        }
        dataBase.saveEmployee(employee);
        return employee;
    }

    public Employee findEmployee(String email) {
        return dataBase.findEmployee(email);

    }

    public List<Employee> getAllEmployees() {
        return dataBase.getAllEmployees();
    }
}
