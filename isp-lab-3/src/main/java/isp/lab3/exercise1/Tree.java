package isp.lab3.exercise1;

public class Tree {
    private int height;

    public Tree() {
        this.height = 15;
    }

    public void grow(int meters) {
        if (meters >= 1)
            height = height + meters;
        else System.out.println("The tree cannot grow with a negative value or zero");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }
}
