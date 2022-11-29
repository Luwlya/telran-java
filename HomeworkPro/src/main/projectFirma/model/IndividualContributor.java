package projectFirma.model;

import projectFirma.model.face.AddTranslation;

import java.time.LocalDate;

public class IndividualContributor extends Employee implements AddTranslation {
    public IndividualContributor(String name, String email, Role role, LocalDate startDate) {
        super(name, email, role, startDate);
    }

    @Override
    public String addTextToFile() {
        return null;
    }
}
