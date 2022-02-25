package ss06_ke_thua.point_move;

public class MovablePointTest {
    public static void main(String[] args) {
        Point point=new Point(2,3);
        MovablePoint movablePoint=new MovablePoint(point.getX(),point.getY(),4,4);
        System.out.println(movablePoint.toString());
    movablePoint.move();
        System.out.println(movablePoint);
    }
}
