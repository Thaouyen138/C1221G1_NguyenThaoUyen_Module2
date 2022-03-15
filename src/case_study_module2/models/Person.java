package case_study_module2.models;

public abstract class Person {
    private String nameEmployee;
    private String birthDayEmployee;
    private String sexEmployee;
    private String identityCard;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String nameEmployee, String birthDayEmployee, String sexEmployee, String identityCard, String phone, String email) {
        this.nameEmployee = nameEmployee;
        this.birthDayEmployee = birthDayEmployee;
        this.sexEmployee = sexEmployee;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthDayEmployee() {
        return birthDayEmployee;
    }

    public void setBirthDayEmployee(String birthDayEmployee) {
        this.birthDayEmployee = birthDayEmployee;
    }

    public String getSexEmployee() {
        return sexEmployee;
    }

    public void setSexEmployee(String sexEmployee) {
        this.sexEmployee = sexEmployee;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", birthDayEmployee='" + birthDayEmployee + '\'' +
                ", sexEmployee='" + sexEmployee + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
