package ss06_ke_thua.bai_tap.class_circle_and_class_cylinder;

import com.sun.javafx.geom.BaseBounds;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.0, "blue");
        System.out.println(circle1);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
    }
}
