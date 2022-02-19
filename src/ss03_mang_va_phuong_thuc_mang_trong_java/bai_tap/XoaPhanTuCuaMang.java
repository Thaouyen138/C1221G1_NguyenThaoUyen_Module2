package ss03_mang_va_phuong_thuc_mang_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        int[] mang={5,6,5,5,7,8,9,10};
        Scanner scanner=new Scanner(System.in);
        System.out.println( "enter a number:");
        int nhapSo=Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(mang));
        for (int i=0;i<mang.length;i++){
            if (mang[i]==nhapSo){
                for (int j=i;j<mang.length-1;j++){
                    mang[j]=mang[j+1];
                }
                i--;
                mang[mang.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(mang));
    }
}
