package Exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Creați un array de string-uri cu numele prietenilor voștri și afișați-le în ordine alfabetică
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[] array = {"Viorel", "Mihai", "Ion", "Alex" };
        System.out.print("Array-ul nesortat:" + Arrays.toString(array) + "\n" + "Dupa sortare:");
        afisString(array);

    }

    public static void afisString(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
