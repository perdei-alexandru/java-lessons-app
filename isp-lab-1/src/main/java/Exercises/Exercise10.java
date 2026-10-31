package Exercises;

/**
 * Creați o matrice 3x3 de numere întregi și calculați suma pe diagonala principală
 */
public class Exercise10 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = {{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Suma de pe DP a matricei:\n");
        System.out.println(sumaDiagPrincipala(matrix, n));

    }

    public static int sumaDiagPrincipala(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i == j) sum = sum + matrix[i][j];
            }
            System.out.print("\n");
        }
        System.out.print("este:");
        return sum;
    }

}
