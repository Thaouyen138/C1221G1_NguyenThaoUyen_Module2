package thuc_hanh;

import java.util.Scanner;

public class ThucHanhGiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        float heSo1;
        float heSo2;
        float x1;
        float x2;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap he so 1");
        heSo1 = sc.nextFloat();
        System.out.println("nhap he so 2");
        heSo2 = sc.nextFloat();
        if (heSo1 > 0) {
            x1 = -heSo2 / heSo1;
            System.out.println("nghiem la " + x1);

        } else {
            x2 = heSo2 / heSo1;
            System.out.println("nghiem la" + x2);
        }
    }
}
