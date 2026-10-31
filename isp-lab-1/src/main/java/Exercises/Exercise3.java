package Exercises;
/**
 * Scrieți un program care calculează suma cifrelor unui număr întreg pozitiv.
 */

import java.net.SocketOption;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Introdu un numar:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Suma cifrelor numarului " + n + " este: " + sumaCifre(n));
    }

    public static int sumaCifre(int n) {
        int k = 0;
        n = Math.abs(n);
        while (n != 0) {
            k = k + n % 10;
            n = n / 10;
        }
        return k;
    }
}
