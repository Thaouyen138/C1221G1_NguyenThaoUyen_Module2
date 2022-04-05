package test_module_2.models;

public abstract class ClassRoom {
    private int idClass;
    private String nameClass;
    private int idTeacher;

    public ClassRoom() {
    }

    public ClassRoom(int idClass, String nameClass, int idTeacher) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.idTeacher = idTeacher;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "idClass=" + idClass +
                ", nameClass='" + nameClass + '\'' +
                ", idTeacher=" + idTeacher +
                '}';
    }
}
