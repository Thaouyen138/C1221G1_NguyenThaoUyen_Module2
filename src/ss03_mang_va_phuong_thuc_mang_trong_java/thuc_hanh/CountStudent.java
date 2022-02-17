package ss03_mang_va_phuong_thuc_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String nameStudent = scanner.nextLine();
        System.out.println("Enter mark:");
        int mark = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < mark; i++)
            if (mark <= 5) {
                System.out.println("fail");
                break;
            } else if (mark < 10) {
                System.out.println("pass");
            }


    }
}
