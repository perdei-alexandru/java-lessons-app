package isp.lab3.exercise2;

public class Rectangle {
    private int length = 2;
    private int width = 1;
    private String color = "red";

    public Rectangle(int length, int width) {
        if (length > 0)
            this.length = length;
        else System.out.println("Length must be >=0");
        if (width > 0)
            this.width = width;
        else System.out.println("Width must be >=0");
    }

    public Rectangle(int length, int width, String colour) {
        if (length > 0)
            this.length = length;
        else System.out.println("Length must be >=0");
        if (width > 0)
            this.width = width;
        else System.out.println("Width must be >=0");
        this.color = colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColour() {
        return color;
    }

    public int getPerimeter() {
        return (2 * length + 2 * width);
    }

    public int getArea() {
        return length * width;
    }
}
