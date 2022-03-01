package bai_tap_lam_them_anh_chanh.traffic_management;

public class Vehicle {
    private  String numberPlate;
    private String productionName;
    private int productionYear;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String numberPlate, String productionName, int productionYear, String owner) {
        this.numberPlate = numberPlate;
        this.productionName = productionName;
        this.productionYear = productionYear;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
