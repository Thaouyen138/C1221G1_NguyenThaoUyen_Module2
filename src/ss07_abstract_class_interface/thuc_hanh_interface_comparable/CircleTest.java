package ss07_abstract_class_interface.thuc_hanh_interface_comparable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.0);
        System.out.println(circle);

        circle = new Circle(3.5, "red", false);
        System.out.println(circle);
    }
}
