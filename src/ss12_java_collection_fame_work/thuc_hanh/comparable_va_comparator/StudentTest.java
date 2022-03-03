package ss12_java_collection_fame_work.thuc_hanh.comparable_va_comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("uyên", 18, "Đà Nẵng");
        Student student1 = new Student("uyên1", 19, "Đà Nẵng");
        Student student2 = new Student("uyên2", 17, "Đà Nẵng");
        Student student3 = new Student("uyên3", 22, "Đà Nẵng");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
