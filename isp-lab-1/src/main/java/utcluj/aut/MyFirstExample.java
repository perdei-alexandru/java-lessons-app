package utcluj.aut;

import java.util.Scanner;

/**
 * MyFirstExample class is a simple class that demonstrates the usage of Java.
 */

public class MyFirstExample {
    public static void main(String[] args) {
        //print in console
        System.out.println("Hello, World!");
        System.out.println("Enter two numbers: ");
        //read from console
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum is: " + add(a, b));
        System.out.println("Difference is: " + subtract(a, b));
        System.out.println("Multiplification is: " + multiplification(a, b));
        System.out.println("Division is:" + division(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplification(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }


}