package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_mot_tu_trong_mot_chuoi_su_dung_map;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class demKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String string = scanner.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        string = string.toLowerCase();
        char character;
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (treeMap.containsKey(character)) {
                treeMap.replace(character, treeMap.get(character) + 1);
            } else {
                treeMap.put(character, 1);
            }
        }
        Iterator<Character> itr = treeMap.keySet().iterator();
        while (itr.hasNext()) {
            char key = itr.next();
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
}
