package ss03_mang_va_phuong_thuc_mang_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5, 6};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.println(Arrays.toString(array3));


    }
}
