package case_study_module2.models;

public abstract class Person {
    private String name;
    private String birthDay;
    private String sex;
    private String identityCard;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String nameEmployee, String birthDayEmployee, String sexEmployee, String identityCard, String phone, String email) {
        this.name = nameEmployee;
        this.birthDay= birthDayEmployee;
        this.sex = sexEmployee;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay= birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
                "nameEmployee='" + name+ '\'' +
                ", birthDayEmployee='" + birthDay + '\'' +
                ", sexEmployee='" + sex + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
