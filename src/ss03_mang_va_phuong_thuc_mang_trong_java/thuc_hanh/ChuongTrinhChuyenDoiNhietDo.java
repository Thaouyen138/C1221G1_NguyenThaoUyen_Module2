package ss03_mang_va_phuong_thuc_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        float doC;
        float doF;
        int choice;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    doF = scanner.nextFloat();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(doF));
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    doC = scanner.nextFloat();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}


