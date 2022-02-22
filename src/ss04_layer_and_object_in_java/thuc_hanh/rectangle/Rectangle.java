package ss04_layer_and_object_in_java.thuc_hanh.rectangle;

public class Rectangle {
    double width, height;

    public Rectangle() { //constructor
    }

    public Rectangle(double width, double height) {// constructor
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    } //method

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    } //method

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}