package Exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Creați un array de 5 numere întregi și calculați suma lor
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu lungimea array-ului:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+ i + "]=");
            array[i] = scanner.nextInt();
        }
        System.out.println("Suma numerelor:" + Arrays.toString(array) + " este:" + suma(array));
    }

    public static int suma(int[] array) {
        int sum = 0;
        for (int nr : array)
            sum = sum + nr;
        return sum;
    }
}
