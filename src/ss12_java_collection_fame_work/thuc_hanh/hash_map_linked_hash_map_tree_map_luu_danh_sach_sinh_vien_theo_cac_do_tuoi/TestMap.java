package ss12_java_collection_fame_work.thuc_hanh.hash_map_linked_hash_map_tree_map_luu_danh_sach_sinh_vien_theo_cac_do_tuoi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("uyen1", 19);
        hashMap.put("uyen2", 24);
        hashMap.put("uyen3", 23);
        hashMap.put("uyen4", 20);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("uyen1",19);
        linkedHashMap.put("uyen2", 24);
        linkedHashMap.put("uyen3", 23);
        linkedHashMap.put("uyen4", 20);
        System.out.println("\nThe age for " + "uyen1 is " + linkedHashMap.get("uyen1"));
        System.out.println("\nThe age for " + "uyen3 is " + linkedHashMap.get("uyen3"));

    }
}