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

    public Customer(String name, String birthDay, String gender, String identityCard, String phone, String email, String idCustomer, String typeCustomer, String address) {
        super(name, birthDay, gender, identityCard, phone, email);
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
        return "Customer{" + super.toString()+
                "idCustomer='" + idCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInFor(){
        return super.getInFor()+","+idCustomer+","+typeCustomer+","+address;
    }
}
