package case_study_module2.utils;

import java.util.Scanner;

public class Validate {
    static Scanner sc=new Scanner(System.in);
    public static String regexString(String inputString, String regex, String error){
        boolean flag=true;
        do {
            if (inputString.matches(regex)){
                flag=false;
            }else {
                System.out.println(error);
                inputString=sc.nextLine();
            }
        }while (flag);
        return inputString;
    }

}
