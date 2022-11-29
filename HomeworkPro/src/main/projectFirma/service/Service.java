package projectFirma.service;

import projectFirma.bd.DataBase;
import projectFirma.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
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

    public List<Employee> getAllLawyers() {
        List<Employee> allEmployee = dataBase.getAllEmployees();
        List<Employee> result = new ArrayList<>();
        for (Employee employee : allEmployee) {
            if(employee.getRole() == Role.LAWYER) {
                result.add(employee);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Service service = new Service();
        service.createEmployee("Yurii", "yurii.krut@firma.com", Role.CEO, LocalDate.of(2020, 1, 1));
        service.createEmployee("Anastasiia", "asya.go@firma.com", Role.LAWYER, LocalDate.of(2020, 5, 10));
        service.createEmployee("Neo", "neostop@firma.com", Role.LAWYER, LocalDate.of(2020, 8, 10));
        service.createEmployee("Nathaniel", "nathanhgt@firma.com", Role.LAWYER, LocalDate.of(2022, 5, 10));
        System.out.println(service.getAllLawyers());
    }

}
