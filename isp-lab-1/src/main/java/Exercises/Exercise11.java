package Exercises;

import java.util.Arrays;

/**
 * Implementați un program care inversează elementele unui array
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = array.length;
        System.out.println("Array-ul inainte de inversare:" + Arrays.toString(array));
        inversare(array, n);
        System.out.println(Arrays.toString(array));

    }

    public static void inversare(int[] array, int n) {
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.print("Dupa sortare:");
    }
}
