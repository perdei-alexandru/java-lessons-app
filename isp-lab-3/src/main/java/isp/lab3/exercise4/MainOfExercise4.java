package isp.lab3.exercise4;

public class MainOfExercise4 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2, 3);
        System.out.println("p1:" + p1.toString());
        MyPoint p2 = new MyPoint(4, 5, 6);
        System.out.println("p2:" + p2.toString());
        System.out.println("Distance between p1 and p2:" + p1.distance(p2));
        p1.setXYZ(2, 2, 2);
        System.out.println("Dupa modificare:p1(" + p1.getX() + ", " + p1.getY() + ", " + p1.getZ() + ")");
        p2.setXYZ(3, 5, 6);
        System.out.println("Dupa modificare:p2(" + p2.getX() + ", " + p2.getY() + ", " + p2.getZ() + ")");
        System.out.println("Distance between p1 and p2:" + p1.distance(p2));


    }
}
