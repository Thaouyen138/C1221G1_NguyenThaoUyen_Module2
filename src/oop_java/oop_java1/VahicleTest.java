package oop_java.oop_java1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class VahicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int choice = 0;
        do {
            System.out.println("menu\n" +
                    "1.Them Phương Tiện \n " +
                    "2.Hiển thị thuế các phương tiện \n " +
                    "3.Thoát \n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("enter price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter xyLanh");
                    double xyLanh = Double.parseDouble(scanner.nextLine());
                    Vehicle vehicle = new Vehicle(price, xyLanh);
                    vehicles.add(vehicle);
                    break;
                case 2:
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.println(vehicles.get(i).tax());

                    }
                    break;
            }
        } while (choice != 3);
    }
}
