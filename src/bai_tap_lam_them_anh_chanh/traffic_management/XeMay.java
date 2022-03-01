package bai_tap_lam_them_anh_chanh.traffic_management;

public class XeMay extends Vehicle {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}
