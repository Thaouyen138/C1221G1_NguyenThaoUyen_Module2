package ss02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("menu:");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println(" Draw the triangle");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                System.out.println("*****");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
            case 0:
                System.exit(0);
            default:
                System.out.println("No Choice");


        }
    }
}
