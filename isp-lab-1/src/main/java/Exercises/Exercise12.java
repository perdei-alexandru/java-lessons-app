package Exercises;
/**
 * Creați un program care găsește elementul maxim și minim dintr-un array de numere
 */

import java.util.Arrays;

public class Exercise12 {
    public static void main(String[] args) {
        int[] array = {10, 4, 3, 20,100,-100};
        int n = array.length;
        maxMin(array, n);
    }

    public static void maxMin(int[] array, int n) {
        int max1 = array[0];
        int min1 = array[0];
        for (int i = 0; i < n; i++) {
            if (max1 < array[i]) max1 = array[i];
            if (min1 > array[i]) min1 = array[i];
        }
        System.out.println("Max din:" + Arrays.toString(array) + " este:" + max1 + "\n" + "Mix din:" + Arrays.toString(array) + " este:" + min1 + "\n");
    }
}
