package case_study_module2.controllers;

import case_study_module2.models.Employee;
import case_study_module2.services.CustomerServiceImpl;
import case_study_module2.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        boolean flag = true;
        do {
            System.out.println("display main menu:\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("choose menu:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    System.out.println("1.display list employees \n" +
                            "2.add new employee\n" +
                            "3.edit employee\n" +
                            "4.return main menu");
                    System.out.println("selection number:");
                    int choosemenu1=Integer.parseInt(scanner.nextLine());
                    switch (choosemenu1){
                        case 1:
                            employeeService.display();
                            break;
                        case 2:
                            employeeService.add();
                            break;
                        case 3:
                            employeeService.edit();
                            break;

                    }
                    break;
                case 2:
                    System.out.println("1.display list customer\n" +
                            "2.add new customer\n" +
                            "3.edit customer\n" +
                            "4.return main menu");
                   int chooseMenu2=Integer.parseInt(scanner.nextLine());
                   switch (chooseMenu2){
                       case 1:
                           customerService.display();
                           break;
                       case 2:
                           customerService.add();
                           break;
                       case 3:
                           customerService.edit();
                           break;
                   } break;
                case 3:
                    System.out.println("1.Display list facility\n" +
                            "2.add new facility\n" +
                            "3.edit facility\n" +
                            "4.return main menu");
                    break;
                case 4:
                    System.out.println("1.Display list Booking\n" +
                            "2.add new Booking\n" +
                            "3.edit Booking\n" +
                            "4.return main menu");
                    break;
                case 5:
                    System.out.println("1.Display list Promotion\n" +
                            "2.add new Promotion\n" +
                            "3.edit Promotion\n" +
                            "4.return main menu");
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
}
