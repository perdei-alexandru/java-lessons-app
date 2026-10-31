package Exercises;
/**
 * Scrieți un program care verifică dacă un an este bisect. Un an este bisect dacă este divizibil cu 4 dar nu cu 100, sau dacă este divizibil cu 400.
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Introdu anul:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Anul " + year + " este bisect:" + bisect(year));
    }

    public static boolean bisect(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
    }
}
