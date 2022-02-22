package ss05_static_method_assignment.bai_tap.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name:");
        String nameStudent=scanner.nextLine();
        System.out.println("enter class:");
        String classStudent=scanner.nextLine();
        Student student=new Student();
        student.setName(nameStudent);
        student.setClasses(classStudent);
        System.out.println("ten:" + student.getName());
        System.out.println("lop:" +student.getClasses());
    }
}
