package ss06_ke_thua.bai_tap.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D=new Point3D(1,2,3);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}
