package ss06_ke_thua.bai_tap.class_point2d_and_class_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(4,5);
        System.out.println(point2D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
