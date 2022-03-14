package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class TestDaoNguoc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chuỗi:");
        String str=scanner.nextLine();
        String [] arr=str.split("");
        Stack<String> stack=new Stack<>();
        for (int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        String output = "";
        while (!stack.isEmpty()){
            output += stack.pop();
        }
        System.out.println(output);
    }

}
