package bai_tap_lam_them_anh_chanh.traffic_management;

public class Car extends Vehicle {
    private int numberSeat;
    private String vehicleType;

    public Car() {
    }

    public Car(int numberSeat, String vehicleType) {
        this.numberSeat = numberSeat;
        this.vehicleType = vehicleType;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

}
