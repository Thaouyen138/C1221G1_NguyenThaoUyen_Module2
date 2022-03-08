package collection_review.models;

public class Intern extends Candidates{
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(int candidatesId, String firstName, String lastName, String birthday, String address, String phone, String email, String majors, String semester, String universityName) {
        super(candidatesId, firstName, lastName, birthday, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
