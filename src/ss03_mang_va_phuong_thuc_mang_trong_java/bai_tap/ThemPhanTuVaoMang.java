package ss03_mang_va_phuong_thuc_mang_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] mang={1,2,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("vi tri");
        int viTri=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so:");
        int nhapSo=Integer.parseInt(scanner.nextLine());

        for (int i=0;i<mang.length;i++){
            if (i==viTri){

              for (int j=mang.length-1;j>i;j--){
                  mang[j]=mang[j-1];

              }
                mang[i]=nhapSo;
            }

        }
        System.out.println(Arrays.toString(mang));
    }
}
