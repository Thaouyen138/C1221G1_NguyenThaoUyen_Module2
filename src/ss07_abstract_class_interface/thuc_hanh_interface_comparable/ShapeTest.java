package ss07_abstract_class_interface.thuc_hanh_interface_comparable;

    public class ShapeTest {

        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red", false);
            System.out.println(shape);
        }
    }
