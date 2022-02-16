package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ThucHanhTinhNgay {
    public static void main(String[] args) {
        int thang;
        int ngay1 = 31;
        int ngay2 = 28;
        int ngay3 = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang:");
        thang = sc.nextByte();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co " + ngay1 + " ngày");
                break;
            case 2:
                System.out.println("thang co" + ngay2 + "ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co "+ ngay3+ " ngày");
                break;
        }
    }
}
