package test_module_2.services;

import ss05_static_method_assignment.thuc_hanh.static_method.Student;
import test_module_2.models.ClassRoom;
import test_module_2.models.Students;
import test_module_2.models.Teachers;
import test_module_2.view.NotFoundBankAccountException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoomImpl implements IClassRoomService {
    Scanner scanner=new Scanner(System.in);
    public static List<ClassRoom> classRoomList=new ArrayList<>();
    public static List<Student> studentList=new ArrayList<>();
    public static List<Teachers> teachersList=new ArrayList<>();
    private static final Object ReadAndWriteFiles = ;

    static {
        studentList = ReadAndWriteFiles.readstudentsListFromCSV("src\\test_module_2\\data\\student.csv");
        teachersList = ReadAndWriteFiles.readteachersListFromCSV("src\\test_module_2\\data\\teachers.csv");
    }

    @Override
    public void add() {
        System.out.print("Input type of phone you want to add\n" +
                "1. Add Student:\n" +
                "2. Add Teacher:\n" +
                "0. Return to main menu\n" +
                "(Please choose a number for accessing to these functions).");
        String confirmContinue;
        do {
            try {
                System.out.println("Add new Class");
                System.out.print("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Add Student: ");
                        addNewHandPhone();
                        break;
                    case 2:
                        System.out.print("Add Teacher: ");
                        addNewAuthPhone();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please input number from 1-9!: ");
                }
                System.out.println("Do you want to continue? (Y/N): ");
                confirmContinue = scanner.nextLine();
                if (confirmContinue.toUpperCase().equals("N")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only number accepted ");
            }
        } while (true);
    }
//   private int idTeachers;
//    private String nameTeacher;
//    private  String birthdayTeacher;
//    private String genderTeacher;
//    private int PhoneTeacher;
    @Override
    public void addStudent() {
        System.out.println("enter id");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("enter name teacher:");
        String name=scanner.nextLine();
        System.out.println("birthday");
        String birth=scanner.nextLine();
        System.out.println("gender");
        String gender=scanner.nextLine();
        System.out.println("phone :");
        int phone =Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void removeStudent() throws NotFoundBankAccountException {
        display();
        System.out.println("What type of class you want to delete?: (1.student/2.Teacher)");
        String answer=scanner.nextLine();
        if (answer.equals("1")){
           removeStudent();
        }else if (answer.equals("2")){
            removeTe();
        }else {
            System.out.println("Please only input 1 or 2");
        }
    }

    @Override
    public void displayStudent() {

    }

    @Override
    public void displayTeacher() {

    }

    @Override
    public void searchStudent() {

    }

    private void addNewHandPhone() {
        //int ID, String phoneName, double price, int quantity, String brand, String handsFrom, String state
        int id = autoID();
        System.out.print("Input Phone Name : ");
        String phoneName = scanner.nextLine();
        System.out.print("Input Phone's Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Input Phone Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Phone Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Input Handed from which country: ");
        String handsFrom = scanner.nextLine();
        System.out.print("Input State of Phone: ");
        String state = scanner.nextLine();
        HandPhone handPhone = new HandPhone(id, phoneName, price, quantity, brand, handsFrom, state);
        handPhoneList.add(handPhone);
        ReadAndWriteFiles.writeListPhonesToCSV("S:\\Codegym\\module2\\src\\c09_quan_ly_dien_thoai\\data\\handphone.csv", handPhoneList);
    }

    private int autoID() {
        int id;
        if (classRoomList.isEmpty()) {
            id = 1;
        } else {
            id = classRoomList.get(classRoomList.size() - 1).getIdClass() + 1;
        }
        return id;
    }

    private void addNewAuthPhone() {
        int id = autoID();
        System.out.print("Input Phone Name : ");
        String phoneName = scanner.nextLine();
        System.out.print("Input Phone's Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Input Phone Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Phone Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Input Warranty Period: ");
        String warrantyPeriod = scanner.nextLine();
        System.out.print("Input Warranty Coverage: ");
        String warrantyCoverage = scanner.nextLine();
        AuthPhone authPhone = new AuthPhone(id, phoneName, price, quantity, brand, warrantyPeriod, warrantyCoverage);
        authPhoneList.add(authPhone);
        ReadAndWriteFiles.writeListPhonesToCSV("S:\\Codegym\\module2\\src\\c09_quan_ly_dien_thoai\\data\\authphone.csv", authPhoneList);
    }


    @Override
    public void remove() throws NotFoundProductException {

    }

    private void deleteAuthenticPhone() throws NotFoundProductException {
        System.out.println("DELETE AUTHENTIC PHONES PROCESS: ");
        System.out.println("Input ID you want to delete: ");
        String idForDeleting = scanner.nextLine();
        String confirmDelete;
        for (int i = 0; i < authPhoneList.size(); i++) {
            if (idForDeleting.equals(authPhoneList.get(i).getID()+"")) {
                System.out.println("Confirm deleting: (Y/N)");
                confirmDelete = scanner.nextLine();
                if (confirmDelete.toUpperCase().equals("Y")) {
                    authPhoneList.remove(i);
                    System.out.println("List Authentic Phone after deleting: ");
                    display();
                    ReadAndWriteFiles.writeListPhonesToCSV("src\\c09_quan_ly_dien_thoai\\data\\authphone.csv",authPhoneList);
                }
                return;
            }
        }
        throw new NotFoundProductException("Account Code does not exist!");
    }

    private void deleteHandPhone() throws NotFoundProductException {
        System.out.println("DELETE HANDPHONES PROCESS: ");
        System.out.println("Input ID you want to delete: ");
        String idForDeleting = scanner.nextLine();
        String confirmDelete;
        for (int i = 0; i < handPhoneList.size(); i++) {
            if (idForDeleting.equals(handPhoneList.get(i).getID()+"")) {
                System.out.println("Confirm deleting: (Y/N)");
                confirmDelete = scanner.nextLine();
                if (confirmDelete.toUpperCase().equals("Y")) {
                    handPhoneList.remove(i);
                    System.out.println("List HandPhone after deleting: ");
                    display();
                    ReadAndWriteFiles.writeListPhonesToCSV("src\\c09_quan_ly_dien_thoai\\data\\handphone.csv",handPhoneList);
                }
                break;
            }
        }
        throw new NotFoundProductException("Account Code does not exist!");
    }

    @Override
    public void display() {
        System.out.println("HandPhone List: ");
        for (Phone e : handPhoneList) {
            System.out.println(e);
        }
        System.out.println("Authentic Phone List");
        for (Phone e : authPhoneList) {
            System.out.println(e);
        }
    }

    @Override
    public void search() {
        display();
        System.out.println("Input keyword to search Phones: ");
        String keywordSearching = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < authPhoneList.size(); i++) {
            if ((authPhoneList.get(i).getID() + "").contains(keywordSearching) ||
                    authPhoneList.get(i).getPhoneName().toLowerCase().contains(keywordSearching.toLowerCase())) {
                System.out.println(authPhoneList.get(i));
                isFound = true;
            }
        }
        for (int i = 0; i < handPhoneList.size(); i++) {
            if ((handPhoneList.get(i).getID() + "").contains(keywordSearching) ||
                    handPhoneList.get(i).getPhoneName().toLowerCase().contains(keywordSearching.toLowerCase())) {
                System.out.println(handPhoneList.get(i));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Can not find Account");
        }
    }
}
