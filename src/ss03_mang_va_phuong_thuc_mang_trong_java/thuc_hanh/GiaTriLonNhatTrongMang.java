package ss03_mang_va_phuong_thuc_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class GiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] money = {1, 2, 7, 3, 4, 5};
        int max = money[0];
        for (int i = 0; i < money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
        }
        System.out.println("giá trị lớn nhất " + max);


    }
}
