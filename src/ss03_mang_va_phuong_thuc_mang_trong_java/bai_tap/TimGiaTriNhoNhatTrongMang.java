package ss03_mang_va_phuong_thuc_mang_trong_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] newArray = {1, 2, 3, 4, 5, 6, -4, 8, 9, 10};
        int min = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }
        System.out.println("min:" + min);


    }
}
