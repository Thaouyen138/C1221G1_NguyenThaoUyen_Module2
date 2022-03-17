package case_study_module2.services;

import case_study_module2.models.Customer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println(" enter id customer");
        String id = scanner.nextLine();
        System.out.println("enter name:");
        String name = scanner.nextLine();
        System.out.println("enter birthday");
        String birth = scanner.nextLine();
        System.out.println("enter sex:");
        String sex = scanner.nextLine();
        System.out.println("enter identity");
        String identity = scanner.nextLine();
        System.out.println("enter phone:");
        String phone = scanner.nextLine();
        System.out.println("enter mail:");
        String mail = scanner.nextLine();

        int chooseType;
        String typeCustomer ="";
        do {
            System.out.println("enter type customer: " +
                    "1.diamond\n"+
                    "2.platinum\n" +
                    "3.gold\n"+
                    "4.silver\n"+
                    "5.member");
            System.out.println("choose type customer:");
            chooseType=Integer.parseInt(scanner.nextLine());
            switch (chooseType){
                case 1:
                    typeCustomer = "diamond";
                    break;
                case 2:
                    typeCustomer= "platinum";
                    break;
                case 3:
                    typeCustomer = "gold";
                    break;
                case 4:
                    typeCustomer = "silver:";
                    break;
                case 5:
                    typeCustomer = "member";
                    break;
            }break;
        }while (chooseType<1||chooseType>5);
        System.out.println("enter address:");
        String address = scanner.nextLine();
        customerList.add(new Customer(id, name, birth, sex, identity, phone, mail, typeCustomer, address));
    }

    @Override
    public void display() {
        for (Customer e : customerList
        ) {
            System.out.println(e);
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("enter id customer repair");
        String id = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(id)) {
                System.out.println("enter name:");
                customerList.get(i).setName(scanner.nextLine());
                System.out.println("enter birthday:");
                customerList.get(i).setBirthDay(scanner.nextLine());
                System.out.println("enter sex");
                customerList.get(i).setSex(scanner.nextLine());
                System.out.println("enter identity:");
                customerList.get(i).setIdentityCard(scanner.nextLine());
                System.out.println("enter phone");
                customerList.get(i).setPhone(scanner.nextLine());
                System.out.println("enter mail:");
                customerList.get(i).setEmail(scanner.nextLine());
                System.out.println("enter typecustomer:");
                customerList.get(i).setTypeCustomer(scanner.nextLine());
                System.out.println("enter địa chỉ:");
                customerList.get(i).setAddress(scanner.nextLine());

            }
        }
    }
}
