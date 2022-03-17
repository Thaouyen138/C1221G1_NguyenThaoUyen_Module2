package case_study_module2.controllers;

import case_study_module2.models.Employee;
import case_study_module2.services.CustomerServiceImpl;
import case_study_module2.services.EmployeeServiceImpl;
import case_study_module2.services.FacilityService;
import case_study_module2.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

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
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
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

    private static void employeeManagement() {
        int chooseMenu1 = -1;
        do {
            System.out.println("1.display list employees \n" +
                    "2.add new employee\n" +
                    "3.edit employee\n" +
                    "4.return main menu");
            System.out.println("selection number:");
            chooseMenu1 = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu1) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    chooseMenu1 = 4;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (chooseMenu1 != 4);
    }

    private static void customerManagement() {
        int chooseMenu2 = -1;
        do {
            System.out.println("1.display list customer\n" +
                    "2.add new customer\n" +
                    "3.edit customer\n" +
                    "4.return main menu");
            chooseMenu2 = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu2) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    chooseMenu2 = 4;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (chooseMenu2 != 4);
    }

    private static void facilityManagement() {
        int chooseMenu3 = -1;
        do {
            System.out.println("1.Display list facility\n" +
                    "2.add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.return main menu");
            System.out.println("select menu:");
            int choose1 = Integer.parseInt(scanner.nextLine());
            switch (choose1) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addFacility();
                    break;
                case 3:
                    System.out.println("display list facility maintenance");
                    break;
                case 4:
                    chooseMenu3 = 4;
                    break;
                default:
                    System.out.println("no choice!");

            }

        } while (chooseMenu3 != 4);
    }

    private static void addFacility() {
        int choosemenu4 = -1;
        do {
            System.out.println("1.add villa\n" +
                    "2.add house\n" +
                    "3.add room\n"+
                    "4.return main menu");
            int choose2=Integer.parseInt(scanner.nextLine());
            switch (choose2) {
                case 1:
                    facilityService.addVilla();
                    break;
                case 2:
                    facilityService.addHouse();
                    break;
                case 3:
                    facilityService.addRoom();
                    break;
                case 4:
                    choosemenu4=4;
                    break;
                default:
                    System.out.println("no chocice:");
            }
        }while (choosemenu4!=4 );
    }

}