package projectFirma.model;

import java.time.LocalDate;

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


}
