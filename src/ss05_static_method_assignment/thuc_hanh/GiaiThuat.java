package ss05_static_method_assignment.thuc_hanh;

public class GiaiThuat {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.print("\n");
        }
        for (int i = 1; i < 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
                System.out.print(5-i);
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print(5-i);
            System.out.print("\n");
        }
    }
}
