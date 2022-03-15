package case_study_module2.services;

import case_study_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeServiceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("enter id employee:");
        String id = scanner.nextLine();
     System.out.println("Enter name:");
     String name=scanner.nextLine();
     System.out.println("Enter birthday:");
     String birth = scanner.nextLine();
     System.out.println("Enter sex:");
     String sex=scanner.nextLine();
     System.out.println("Enter identity:");
     String identity=scanner.nextLine();
     System.out.println("Enter phone:");
     String phone=scanner.nextLine();
     System.out.println("Enter email:");
     String email=scanner.nextLine();
     System.out.println("Enter level:");
     String level=scanner.nextLine();
     System.out.println("Enter position:");
     String position=scanner.nextLine();
     System.out.println("enter salary:");
     String salary=scanner.nextLine();
     employeeServiceList.add(new Employee(id,name,birth,sex,identity,phone,email,level,position,salary));
    }

    public void display(){
     for (Employee e: employeeServiceList) {
      System.out.println(e);
     }
    }
}
