package ss06_ke_thua.bai_tap.class_circle_and_class_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        cylinder.setRadius(5.0);
        System.out.println(cylinder.getVolume());
        Cylinder cylinder1=new Cylinder(2);
        System.out.println(cylinder1.getVolume());

    }
}
