package collection_review.view;

import collection_review.models.Experience;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceManager {
    List<Experience> experiences=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public void add(){
        System.out.println("nhập id:");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập họ:");
        String firstName=scanner.nextLine();
        System.out.println("Nhập tên");
        String lastName=scanner.nextLine();

        boolean flag=true;
        String eBD;
        do {
            System.out.println("nhập năm sinh:");
            eBD=scanner.nextLine();
            if (eBD.length()==4){
                int  check=Integer.parseInt(eBD);
                if (check >1990){
                    flag=false;
                }
            }

        }
        while (flag);
    }
}
