package Exercises;
/**
 * Implementați un program care convertește un număr din baza 10 în orice bază între 2 și 16.
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("Introdu numarul de convertit:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Introdu baza:");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        System.out.println("Numarul " + n + " in baza " + b + " este:" + converte(n, b));
    }

    public static String converte(int n, int b) {
        String numar = "";
        int rest = 0;
        String ch = "";
        while (n != 0) {
            rest = n % b;
            if (rest >= 10) {
                switch (rest) {
                    case 10:
                        ch = "A";
                        break;
                    case 11:

                        ch = "B";
                        break;
                    case 12:
                        ch = "C";
                        break;
                    case 13:
                        ch = "D";
                        break;
                    case 14:
                        ch = "E";
                        break;
                    case 15:
                        ch = "F";
                        break;

                }
                numar = ch + numar;
            } else numar = rest + numar;

            n = n / b;

        }
        return numar;
    }
}
