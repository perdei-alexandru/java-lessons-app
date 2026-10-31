package Exercises;

import java.util.Scanner;

/**
 * Creați un joc simplu "Ghicește numărul" în care computerul generează un număr aleatoriu între 1 și 100, iar utilizatorul trebuie să-l ghicească.
 * După fiecare încercare, programul va oferi indicii de tipul "prea mare" sau "prea mic".
 */

public class Exercise7 {
    public static void main(String[] args) {

        int numar_secret = (int) (Math.random() * 100) + 1;
        System.out.print("Introdu numarul pe care crezi ca la generat clasa random([0...100]:");
        boolean verific = ghiceste_numarul(numar_secret);
        if (verific) System.out.println("Ai ghicit numarul. FELICITARI");

    }

    public static boolean ghiceste_numarul(int n) {
        int numarul_tau;
        Scanner scanner = new Scanner(System.in);
        do {

            numarul_tau = scanner.nextInt();
            if (numarul_tau < n) {
                System.out.println("Numarul introdus este mai mic decat cel cautat introdu altul:");

            } else if (numarul_tau > n) {
                System.out.println("Numarul introdus este mai mare decat cel cautat introdu altul:");
            }
        }
        while (numarul_tau != n);
        return true;

    }
}
