package ss05_static_method_assignment.bai_tap.access_modifier;

public class Circle {
   private double radius =1.0;
   private String color= "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

