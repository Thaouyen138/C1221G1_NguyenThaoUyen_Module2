package oop_java.oop_java2;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(1234,"uyen");
        Account account1=new Account(2345,"uyenuyen");
        ArrayList<Account> arrayLists = new ArrayList<>();
        arrayLists.add(account);
        arrayLists.add(account1);
        account.napTien(6000);
        account.rutTien(3000);
        account.expire();
        for (int i=0;i<arrayLists.size();i++){
            System.out.println(arrayLists.get(i));
        }

    }
}
