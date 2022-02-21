package ss04_layer_and_object_in_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a:");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("enter b:");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("enter c:");
        double c=Double.parseDouble(scanner.nextLine());
        QuadracticEquation qE=new QuadracticEquation(a,b,c);
        System.out.println("dental" + qE.getDiscriminant());
        if (qE.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm");
        } else if (qE.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiệm:" +qE.getRoot());
        }else{
            System.out.println("phương trình có 2 nghiệm " +qE.getRoot1() +"\n"+ qE.getRoot());
        }
    }
}
