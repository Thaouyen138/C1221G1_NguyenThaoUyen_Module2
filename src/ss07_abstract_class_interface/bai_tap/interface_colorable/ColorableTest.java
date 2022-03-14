package ss07_abstract_class_interface.bai_tap.interface_colorable;

import java.util.Scanner;

public class ColorableTest {
    public static void main(String[] args) {
        Square square=new Square();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cạnh!");
        int dienTich=Integer.parseInt(scanner.nextLine());
        square.howToColor();
        System.out.println("diện tích:" +square.dienTich(dienTich));

    }
}
