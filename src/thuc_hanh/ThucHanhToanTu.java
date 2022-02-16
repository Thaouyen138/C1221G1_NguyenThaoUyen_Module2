package thuc_hanh;

import java.util.Scanner;

public class ThucHanhToanTu {
    public static void main(String[] args) {
        float chieuRong;
        float chieuDai;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chieu rong");
        chieuRong=sc.nextFloat();
        System.out.println("nhap chieu dai");
        chieuDai=sc.nextFloat();
        float dienTich=chieuRong*chieuDai;
        System.out.println("dien tich hinh chu nhat:"+dienTich);
    }
}
