package Exercises;
/**
 * Scrieți un program care să determine dacă un șir de caractere este palindrom (se citește la fel de la stânga la dreapta și de la dreapta la stânga).
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Introdu un sir:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Sirul introdus este palindrom:" + palindrom(s));
    }

    public static boolean palindrom(String s) {
        String rezultat = "";
        char k;
        int lungime = s.length();
        for (int i = lungime - 1; i >= 0; i--) {
            k = s.charAt(i);
            rezultat = rezultat + k;

        }
        return s.equals(rezultat);


    }

}
