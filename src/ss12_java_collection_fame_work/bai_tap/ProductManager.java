package ss12_java_collection_fame_work.bai_tap;

import java.util.*;


public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>(); // tạo danh sách

    public void add() {
        System.out.println("nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("nhập giá tiền:");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        products.add(product);
        System.out.println(products);
    }

    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products);
        }
    }

    public void edit() {
        display();
        System.out.println("nhập id sản phẩm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("nhập tên cần sửa:");
                products.get(i).setName(scanner.nextLine());
                System.out.println("nhập giá cần sửa:");
                products.get(i).setPrice(scanner.nextInt());
            }

        }
    }


    public void delete() {
        System.out.println("nhập id sản phẩm cần xóa :");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));

            }
        }

    }

    public void search() {
        System.out.println("nhập tên sản phẩm cần tìm:");
        String names = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(names)) {
                System.out.println("sản phẩm cần tìm :" + products.get(i).getId() + ","
                        + products.get(i).getName() + ","
                        + products.get(i).getPrice());
            }

        }

    }

    public void arrange() {
        products.sort(Product::compareTo);
        System.out.println(products);


    }
    public void arrange2(){
        ProductManagerSort productManagerSort = new ProductManagerSort();
        products.sort(productManagerSort);
        System.out.println(productManagerSort);
    }
}




