package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachine {
    final private String[] products = {"Water", "Cola", "Pepsi", "MilkaChocolate", "7days"};
    final private int[] ids = {12, 1, 29, 34, 2};
    private int credit = 0;
    final int[] prices = {13, 6, 5, 7, 5};

    public String displayProducts() {
        String out="";
        for (int i = 0; i < products.length; i++)
        {System.out.print(products[i] + " " + ids[i] + "; ");
        out+=products[i] + " " + ids[i] + "; ";}
        System.out.println();
      return out;
    }

    public void insertCoin(int value) {
        if (value > 0) {
            this.credit += value;
            System.out.println("\nCredit actualizat:" + this.credit);
        } else System.out.println("\nValue must be >0");
    }

    public String selectProduct(int id) {
        int length = ids.length;
        for (int i = 0; i < length; i++)
            if (ids[i] == id) {
                if (credit >= prices[i]) {
                    credit -= prices[i];
                    return "You bought:" + products[i];
                } else return "Error: insufficient credit for id:" + id;
            }
        return "Product with id:" + id + " not found";
    }

    public int[] getIds() {
        return ids;
    }

    public void displayIds() {
        System.out.print("ID-uri disponibile: ");
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public void displayCredit() {
        System.out.println("Current credit: " + this.credit);
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int hour = java.time.LocalTime.now().getHour();
        if (hour < 12) System.out.println("Bună dimineața!");
        else if (hour < 18) System.out.println("Bună ziua!");
        else System.out.println("Bună seara!");

        System.out.println("Bine ați venit la Vending Machine!");
        boolean status = true;
        while (status) {
            System.out.println("What do you want to do?");
            System.out.println("1.See the products:");
            System.out.println("2.Insert money:");
            System.out.println("3.Buy a product:");
            System.out.println("4.See credit");
            System.out.println("5.Exit");
            System.out.println("Type the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.println("Insert money:");
                    insertCoin(scanner.nextInt());
                    break;
                case 3:
                    int id = scanner.nextInt();
                    System.out.println(selectProduct(id));
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    status = false;
                    System.out.println("Good bye!");

            }
        }

    }

}
