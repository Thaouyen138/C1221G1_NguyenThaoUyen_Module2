package ss02_vong_lap_trong_java.thuc_hanh;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(number + "is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;

                }
                i++;


            }if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is 12not a prime");
            }
        }


    }
}
