package ss05_static_method_assignment.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính:");
        double rad = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(rad);
        System.out.println("bán kinh" + circle.getRadius());
        System.out.println("diện tích:" + circle.getArea());

    }
}
