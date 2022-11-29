package projectFirma.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String email;
    private Role role;
    private LocalDate startDate;

    @Override
    public int compareTo(Employee other) {
        int result = this.name.compareTo(other.name);
        return result != 0 ? result : this.startDate.compareTo(other.startDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name) && Objects.equals(startDate, employee.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    public Employee(String name, String email, Role role, LocalDate startDate) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public static void main(String[] args) {
        Employee employee1 = new TopManager("Yurii", "yurii.krut@firma.com", Role.CEO, LocalDate.of(2020, 1, 1));
        Employee employee2 = new MiddleManager("Anastasiia", "asya.go@firma.com", Role.MARKETING_MANAGER, LocalDate.of(2020, 5, 10));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int res = employee1.compareTo(employee2);
        System.out.println(res);
        boolean res1 = employee1.equals(employee2);
        System.out.println(res1);
        int hash1 = employee1.hashCode();
        int hash2 = employee2.hashCode();
        System.out.println("" + hash1 + " " + hash2);
        System.out.println(employee1);
    }
}
