package collection_review.view;

import collection_review.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherManager {
    Scanner scanner = new Scanner(System.in);
    private List<Fresher> fresherList = new ArrayList<>();
    Fresher fresher = new Fresher();

    public List<Fresher> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public void add() {
        System.out.println("nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập họ:");
        String firstName = scanner.nextLine();
        System.out.println("Nhập tên");
        String lastName = scanner.nextLine();

        boolean flag = true;
        String eBD;
        do {
            System.out.println("nhập năm sinh:");
            eBD = scanner.nextLine();
            if (eBD.length() == 4) {
                int check = Integer.parseInt(eBD);
                if (check > 1900) {
                    flag = false;
                }
            }

        }
        while (flag);
        System.out.println("nhập địa chỉ:");
        String address = scanner.nextLine();
        boolean flag1 = true;
        String phone;
        do {
            System.out.println("nhập số điện thoại:");
            phone = scanner.nextLine();
            if (phone.length() >= 10) {
                flag1 = false;
            }
        } while (flag1);
        boolean flag2 = true;
        String email;
        do {
            System.out.println("nhập email:");
            email = scanner.nextLine();
            if (email.contains("@")) {
                flag2 = false;
            }
        } while (flag2);
        System.out.println("thời gian tốt nghiệp:");
        int time=Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("CHOOSE RANK OF GRADUATION!:\n" +
                    "1. Excellence!\n" +
                    "2. Good!\n" +
                    "3. Fair!\n" +
                    "4. Poor!\n");
            int choose = Integer.parseInt(scanner.nextLine());
            String frRank;
            switch (choose) {
                case 1:
                    fresherGraduationOfList(1);
                    frRank = fresher.getGraduatedRank();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(id, firstName, lastName,eBD, address, phone, email, time, frRank));
                    break;
                case 2:
                    fresherGraduationOfList(2);
                    frRank = fresher.getGraduatedRank();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(id, firstName, lastName,eBD, address, phone, email, time, frRank));
                    break;
                case 3:
                    fresherGraduationOfList(3);
                    frRank = fresher.getGraduatedRank();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(id, firstName, lastName,eBD, address, phone, email, time, frRank));
                    break;
                case 4:
                    fresherGraduationOfList(4);
                    frRank = fresher.getGraduatedRank();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(id, firstName, lastName,eBD, address, phone, email, time, frRank));
                    break;
                default:
                    flag2 = false;
            }
            break;
        } while (flag2);
    }
    public void fresherGraduationOfList(int chooseGraduation) {
        List<String> fresherGraduationOfList = new ArrayList<>();
        fresherGraduationOfList.add("1. Excellence");
        fresherGraduationOfList.add("2. Good");
        fresherGraduationOfList.add("3. Fair");
        fresherGraduationOfList.add("4. Poor");
        if (chooseGraduation == 1) {
            fresher.setGraduatedRank("Excellence");
        } else if (chooseGraduation == 2) {
            fresher.setGraduatedRank("Good");
        } else if (chooseGraduation == 3) {
            fresher.setGraduatedRank("Fair");
        } else {
            fresher.setGraduatedRank("Poor");
        }

    }
    public void display(List<Fresher> freshers){
        if (freshers.size()==0){
            System.out.println("không tìm thấy thí sinh:");

        }else{
            System.out.println("thí sinh tìm thấy là:");
            for (Fresher a:fresherList
                 ) {
                System.out.println(a);
            }
        }

    }public void  search(){
        List<Fresher> searchFr = new ArrayList<>();
        System.out.println("Enter name to search!");
        String searchName = scanner.nextLine();
        for (Fresher fr : fresherList) {
            if (fr.getFirstName().contains(searchName) || fr.getLastName().contains(searchName)) {
                searchFr.add(fr);
            }
        }
        display(searchFr);
    }
}