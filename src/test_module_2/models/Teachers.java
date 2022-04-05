package test_module_2.models;

public class Teachers extends ClassRoom{
    private int idStudent;
    private String nameStudent;
    private String birthStudent;
    private String genderStudent;
    private int phoneStudent;
    private int idClassRoom;

    public Teachers() {
    }

    public Teachers(int idStudent, String nameStudent, String birthStudent, String genderStudent, int phoneStudent, int idClassRoom) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthStudent = birthStudent;
        this.genderStudent = genderStudent;
        this.phoneStudent = phoneStudent;
        this.idClassRoom = idClassRoom;
    }

    public Teachers(int idClass, String nameClass, int idTeacher, int idStudent, String nameStudent, String birthStudent, String genderStudent, int phoneStudent, int idClassRoom) {
        super(idClass, nameClass, idTeacher);
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthStudent = birthStudent;
        this.genderStudent = genderStudent;
        this.phoneStudent = phoneStudent;
        this.idClassRoom = idClassRoom;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getBirthStudent() {
        return birthStudent;
    }

    public void setBirthStudent(String birthStudent) {
        this.birthStudent = birthStudent;
    }

    public String getGenderStudent() {
        return genderStudent;
    }

    public void setGenderStudent(String genderStudent) {
        this.genderStudent = genderStudent;
    }

    public int getPhoneStudent() {
        return phoneStudent;
    }

    public void setPhoneStudent(int phoneStudent) {
        this.phoneStudent = phoneStudent;
    }

    public int getIdClassRoom() {
        return idClassRoom;
    }

    public void setIdClassRoom(int idClassRoom) {
        this.idClassRoom = idClassRoom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", birthStudent='" + birthStudent + '\'' +
                ", genderStudent='" + genderStudent + '\'' +
                ", phoneStudent=" + phoneStudent +
                ", idClassRoom=" + idClassRoom +
                '}';
    }
}
