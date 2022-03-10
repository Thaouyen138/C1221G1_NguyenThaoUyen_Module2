package collection_review.view;

import collection_review.models.Candidates;
import collection_review.models.Experience;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceManager {
     private List<Experience> experiences = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ExperienceManager() {
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
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
        }while (flag1);
       boolean flag2=true;
        String email;
        do {
            System.out.println("nhập email:");
            email=scanner.nextLine();
            if (email.contains("@")){
                flag2=false;
            }
        }while (flag2);
        boolean flag3=true;
        int yearExperience;
        do {
            System.out.println("nhập năm kinh nghiệm:");
            yearExperience=Integer.parseInt(scanner.nextLine());
            if (yearExperience <100 && yearExperience >0){
                flag3=false;
            }
        }while(flag3);
        System.out.println("nhập kĩ năng:");
        String proSkill=scanner.nextLine();
        experiences.add(new Experience(id,firstName,lastName,eBD,address,phone,email,yearExperience,proSkill));
    }
    public void search(){
        List<Experience> experiences1=new ArrayList<>();
        System.out.println("tìm theo tên:");
        String nameFind=scanner.nextLine();
        for (Experience e:experiences) {
            if (e.getFirstName().contains(nameFind) || e.getLastName().contains(nameFind)){
                experiences1.add(e);
            }

        }

    }
    public void display(){
        System.out.println("Display Experience:");
        for (Experience e1:experiences
             ) {
            System.out.println(e1);
        }
    }

}
