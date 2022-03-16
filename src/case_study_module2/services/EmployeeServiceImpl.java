package case_study_module2.services;

import case_study_module2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeServiceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static String[] level={"cao đẳng","trung cấp","đai học", "sau đại học"};
    static String[] position={"lễ tân", "phục vụ","chuyên viên","giám sát","quản lí","giám đốc"};
    @Override
    public void add() {
        System.out.println("enter id employee:");
        String id = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter birthday:");
        String birth = scanner.nextLine();
        System.out.println("Enter sex:");
        String sex = scanner.nextLine();
        System.out.println("Enter identity:");
        String identity = scanner.nextLine();
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        for (int i=0;i<level.length;i++){
            System.out.println(i+" : "+level[i]);
        }
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<position.length;i++){
            System.out.println(+i+" : " +position[i]);
        }
        int index2=Integer.parseInt(scanner.nextLine());
        System.out.println("enter salary:");
        String salary = scanner.nextLine();
        employeeServiceList.add(new Employee(id, name, birth, sex, identity, phone, email, level[index], position[index2], salary));
    }

    @Override
    public void display() {
        for (Employee e : employeeServiceList) {
            System.out.println(e);
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("enter id customer repair");
        String id = scanner.nextLine();
        for (int i = 0; i < employeeServiceList.size(); i++) {
            if (employeeServiceList.get(i).getName().equals(id)) {
                System.out.println("Enter name:");
                employeeServiceList.get(i).setName(scanner.nextLine());
                System.out.println("Enter birthday:");
                employeeServiceList.get(i).setBirthDay(scanner.nextLine());
                System.out.println("Enter sex:");
                employeeServiceList.get(i).setSex(scanner.nextLine());
                System.out.println("Enter identity:");
                employeeServiceList.get(i).setIdentityCard(scanner.nextLine());
                System.out.println("Enter phone:");
                employeeServiceList.get(i).setPhone(scanner.nextLine());
                System.out.println("Enter email:");
                employeeServiceList.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter level:");
                employeeServiceList.get(i).setLevel(scanner.nextLine());
                System.out.println("Enter position:");
                employeeServiceList.get(i).setPosition(scanner.nextLine());
                System.out.println("enter salary:");
                employeeServiceList.get(i).setSalary(scanner.nextLine());
            }
        }
    }
}
