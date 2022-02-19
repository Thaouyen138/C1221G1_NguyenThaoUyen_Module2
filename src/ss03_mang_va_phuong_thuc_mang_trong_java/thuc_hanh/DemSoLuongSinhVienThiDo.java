package ss03_mang_va_phuong_thuc_mang_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        float[] mangDiem = new float[30];
        float soDiem;
        int count = 0;
        for (int i = 0; i < 30; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap so diem:");
            soDiem = Float.parseFloat(scanner.nextLine());
            mangDiem[i] = soDiem;
        }

        for (float v : mangDiem) {
            if (v > 5) {
                count++;
            }
        }

        System.out.println(count);
    }
}
