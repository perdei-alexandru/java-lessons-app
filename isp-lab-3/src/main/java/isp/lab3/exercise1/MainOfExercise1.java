package isp.lab3.exercise1;

public class MainOfExercise1 {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        System.out.println(tree1.toString());
        tree1.grow(-3);
        System.out.println(tree1.toString());
        tree1.grow(2);
        System.out.println(tree1.toString());
    }
}
