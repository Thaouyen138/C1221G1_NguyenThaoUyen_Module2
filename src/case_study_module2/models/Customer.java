package case_study_module2.models;

public class Customer extends Person {
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String idCustomer, String typeCustomer, String address) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String nameEmployee, String birthDayEmployee, String sexEmployee, String identityCard, String phone, String email, String idCustomer, String typeCustomer, String address) {
        super(nameEmployee, birthDayEmployee, sexEmployee, identityCard, phone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                "birth='" + getBirthDay() + '\'' +
                "sex='" + getSex() + '\'' +
                "cmnd='" + getIdentityCard() + '\'' +
                "phone='" + getPhone() + '\'' +
                "mail='" + getEmail() + '\'' +
                " typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
