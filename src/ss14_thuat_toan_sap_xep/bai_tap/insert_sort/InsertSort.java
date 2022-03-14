package ss14_thuat_toan_sap_xep.bai_tap.insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử của mảng :");
            array[i] = Integer.parseInt(scanner.nextLine());

        }
        int pos, x;

        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("Lần thứ " + i + ": " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("Sau lần thứ " + i + " : " + Arrays.toString(array));
        }
    }
}
