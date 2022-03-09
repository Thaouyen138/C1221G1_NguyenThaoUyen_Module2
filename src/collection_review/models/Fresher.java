package collection_review.models;

public class Fresher  extends Candidates{
    private int graduatedTime;
    private String graduatedRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int candidatesId, String firstName, String lastName, String birthday, String address, String phone, String email, int graduatedTime, String graduatedRank, String education) {
        super(candidatesId, firstName, lastName, birthday, address, phone, email);
        this.graduatedTime = graduatedTime;
        this.graduatedRank = graduatedRank;
        this.education = education;
    }

    public Fresher(int id, String firstName, String lastName, String eBD, String address, String phone, String email, int time, String frRank) {
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getGraduatedRank() {
        return graduatedRank;
    }

    public void setGraduatedRank(String graduatedRank) {
        this.graduatedRank = graduatedRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
