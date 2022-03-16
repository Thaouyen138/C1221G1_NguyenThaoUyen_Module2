package case_study_module2.models;

public class Employee extends Person {
    private String idEmployee;
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String idEmployee, String level, String position, String salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String nameEmployee, String birthDayEmployee, String sexEmployee, String identityCard, String phone, String email, String idEmployee, String level, String position, String salary) {
        super(nameEmployee, birthDayEmployee, sexEmployee, identityCard, phone, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name ='" + getName() + '\'' +
                "birthdate='" + getBirthDay() + '\'' +
                "sex='" + getSex() + '\'' +
                "identityCard='" + getIdentityCard() + '\'' +
                "phone='" + getPhone() + '\'' +
                "email='" + getEmail() + '\'' +
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
