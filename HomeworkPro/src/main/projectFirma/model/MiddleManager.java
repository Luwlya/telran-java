package projectFirma.model;

import projectFirma.model.face.HasDirectReports;

import java.time.LocalDate;

public class MiddleManager extends Employee implements HasDirectReports {
    public MiddleManager(String name, String email, Role role, LocalDate startDate) {
        super(name, email, role, startDate);
    }

    @Override
    public int getReportsCount() {
        return 0;
    }
}
