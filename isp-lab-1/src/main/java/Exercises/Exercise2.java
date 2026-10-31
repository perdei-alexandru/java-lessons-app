package Exercises;

/**
 * Implementați un program care afișează toate numerele prime din intervalul [1, 100].
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Numerele prime in intervalul[1,100]:");
        for (int i = 1; i <= 100; i++)
            if (prim(i) == true) System.out.print(i + " ");
    }

    public static boolean prim(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= a / 2; i++)
            if (a % i == 0) return false;
        return true;
    }
}
