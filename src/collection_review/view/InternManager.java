package collection_review.view;

import collection_review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternManager {
    private List<Intern> internList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Intern intern = new Intern();

    public List<Intern> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern> internList) {
        this.internList = internList;
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

    }
}
