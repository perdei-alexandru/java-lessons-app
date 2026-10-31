package isp.lab3.exercise2;

public class MainOfExercise2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 2);
        System.out.println("rectangle1:");
        System.out.println("Length:" + rectangle1.getLength());
        System.out.println("Width:" + rectangle1.getWidth());
        System.out.println("Color:" + rectangle1.getColour());
        System.out.println("area:" + rectangle1.getArea());
        System.out.println("perimeter:" + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(8, 3, "blue");
        System.out.println("\nrectangle2:");
        System.out.println("Length:" + rectangle2.getLength());
        System.out.println("Width:" + rectangle2.getWidth());
        System.out.println("Color:" + rectangle2.getColour());
        System.out.println("area:" + rectangle2.getArea());
        System.out.println("perimeter:" + rectangle2.getPerimeter());
    }
}
