package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ThucHanhTinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều cao");
        float chieuCao = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập cân nặng:");
        float canNang = Float.parseFloat(scanner.nextLine());
        float bmi = canNang / (chieuCao * chieuCao);
        if (bmi >= 30) {
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}
