package utcluj.aut;

import java.util.Scanner;

public class MySecondExample {
    public static void main(String[] args) {
        System.out.println("Enter an numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Suma primelor n numere pare este:" + even_sum(n));
    }

    public static int even_sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0) sum = sum + i;
        return sum;
    }

}
