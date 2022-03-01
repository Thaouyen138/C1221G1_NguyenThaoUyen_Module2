package oop_java.oop_java1;

public class Vehicle {
    private double price;
    private double xyLanh;

    public Vehicle() {
    }

    public Vehicle(double price, double xyLanh) {
        this.price = price;
        this.xyLanh = xyLanh;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getXyLanh() {
        return xyLanh;
    }

    public void setPercent(double xyLanh) {
        this.xyLanh = xyLanh;
    }
    public double tax(){
        double tax=0;
        if ( this.xyLanh<100){
            tax=this.getPrice()*0.01;
        }else if (this.xyLanh<200){
            tax=this.getPrice()*0.03;
        }else{
            tax=this.getPrice()*0.05;
        }
        return tax;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", xyLanh=" + xyLanh +
                '}';
    }
}
