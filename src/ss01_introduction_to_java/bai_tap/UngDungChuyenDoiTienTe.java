package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tien ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * 23000;
        System.out.println("so tien viet:" + vnd);
    }
}
