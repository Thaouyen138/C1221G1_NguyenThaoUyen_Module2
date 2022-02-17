package ss02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Money:");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println("Month:");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("percent:");
        double percent = Double.parseDouble(scanner.nextLine());
        double tienLai=0;
        for (int i=0;i<month;i++) {
            tienLai += money * (percent / 100 / 12) * month;
            System.out.println("so tien lai la:" + tienLai);
        }
    }
}
