package ss03_mang_va_phuong_thuc_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    int size;
    int[] array;
    Scanner scanner = new Scanner(System.in);
do {
        System.out.print("Enter a size:");
        size =Integer.parseInt(scanner.nextLine());
        if (size > 20){
            System.out.println("Size should not exceed 20");
    } while (size > 20)