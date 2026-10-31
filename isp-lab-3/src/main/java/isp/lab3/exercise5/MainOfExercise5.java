package isp.lab3.exercise5;

public class MainOfExercise5 {
    public static void main(String[] args) {
        VendingMachine v1 = new VendingMachine();
        v1.displayProducts();
        v1.insertCoin(-10);
        v1.insertCoin(10);
        v1.displayIds();
        v1.selectProduct(12);

        System.out.println(v1.selectProduct(100));
        System.out.println(v1.selectProduct(12));
        System.out.println(v1.selectProduct(2));
        v1.displayCredit();
        v1.userMenu();


    }

}
