package ss12_java_collection_fame_work.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean flag = true;
        do {

            System.out.println("1. Thêm sản phẩm \n" +
                    "2.Sửa thông tin sản phẩm theo id \n" +
                    "3.Xoá sản phẩm theo id \n" +
                    "4.Hiển thị danh sách sản phẩm \n" +
                    "5.Tìm kiếm sản phẩm theo tên \n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("chọn chức năng:");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.println("thêm sản phẩm");
                    productManager.add();
                    break;
                case 2:
                    System.out.println("sửa sản phẩm:");
                    productManager.edit();
                    break;
                case 3:
                    System.out.println("xóa sản phẩm");
                    productManager.delete();
                    break;
                case 4:
                    System.out.println("hiển thị sản phẩm:");
                    productManager.display();
                    break;
                case 5:
                    System.out.println("tìm kiếm sản phẩm:");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("sắp xếp sản phẩm tăng dần theo giá:");
                    productManager.arrange();
                    break;
                case 7:
                    System.out.println("sắp xếp sản phẩm giảm dần theo giá");
                    productManager.arrange2();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
