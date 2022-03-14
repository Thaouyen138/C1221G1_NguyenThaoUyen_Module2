package collection_review.view;

import collection_review.models.Experience;
import collection_review.models.Fresher;
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
        System.out.println("nhập chuyên ngành:");
        String majors = scanner.nextLine();
        System.out.println("nhập học kỳ");
        String semester = scanner.nextLine();
        System.out.println("nhập trường đại học:");
        String universityName = scanner.nextLine();
        internList.add(new Intern(id, firstName, lastName, eBD, address, phone, email, majors, semester, universityName));

    }
    public void search(){
        List<Intern> interns1=new ArrayList<>();
        System.out.println("tìm theo tên:");
        String nameFind=scanner.nextLine();
        for (Intern e:internList) {
            if (e.getFirstName().contains(nameFind) || e.getLastName().contains(nameFind)){
                interns1.add(e);
            }
        }
        display(interns1);

    }
    public void display(List<Intern> interns){
        if (interns.size()==0){
            System.out.println("không tìm thấy thí sinh:");

        }else{
            System.out.println("thí sinh tìm thấy là:");
            for (Intern a:internList
            ) {
                System.out.println(a);
            }
        }
    }
    public void displayI(){
        for (Intern i:internList
             ) {
            System.out.println(i);
        }
    }
}
