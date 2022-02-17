package ss02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a number:");
        int number2 = Integer.parseInt(scanner.nextLine());
        Math.abs(number1);
        Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("no greatest common factor");
            while (number1 != number2) {
                if (number1 > number2) {
                    number1 = number1 - number2;
                } else {
                    number2 = number2 - number1;
                }
                System.out.println("greatest common factor:" + number1);
            }
        }
    }
}
