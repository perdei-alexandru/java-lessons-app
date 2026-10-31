package Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu nr de randuri: ");
        int n = scanner.nextInt();

        afisPascal(n);
    }

    public static void afisPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            int numar = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(numar + " ");
                numar = numar * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}