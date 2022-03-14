package collection_review.models;

public class Experience extends Candidates {
    private int explnYears;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(int candidatesId, String firstName, String lastName, String birthday, String address, String phone, String email, int explnYears, String professionalSkill) {
        super(candidatesId, firstName, lastName, birthday, address, phone, email);
        this.explnYears = explnYears;
        this.professionalSkill = professionalSkill;
    }

    public Experience(int id, String firstName, String lastName, String eBD, String address, String phone, String email, String majors, String semester, String universityName) {
    }

    public int getExplnYears() {
        return explnYears;
    }

    public void setExplnYears(int explnYears) {
        this.explnYears = explnYears;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
}
