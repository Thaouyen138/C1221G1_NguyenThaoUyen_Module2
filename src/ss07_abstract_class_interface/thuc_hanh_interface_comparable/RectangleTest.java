package ss07_abstract_class_interface.thuc_hanh_interface_comparable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(1.0, 2.0);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.0, 3.0, "pink", true);
        System.out.println(rectangle);
    }
}