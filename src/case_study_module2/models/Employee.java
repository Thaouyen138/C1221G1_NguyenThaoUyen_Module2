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

    public Employee(String name, String birthDay, String gender, String identityCard, String phone, String email, String idEmployee, String level, String position, String salary) {
        super(name, birthDay, gender, identityCard, phone, email);
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
        return "Employee{" + super.toString()+
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
    public String getInFor(){
        return super.getInFor()+","+idEmployee+","+level+","+position+","+salary;
    }
}
