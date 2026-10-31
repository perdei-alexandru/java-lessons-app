package isp.lab3.exercise6;

public class MainOfExercise6 {
    public static void main(String[] args) {
        VendingMachine v1=VendingMachine.getInstance();
        VendingMachine v2=VendingMachine.getInstance();
        System.out.println(v1 == v2);
        v1.userMenu();

    }
}
