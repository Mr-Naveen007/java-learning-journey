import java.util.Scanner;

public class Day20E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        if (rows != cols) {
            throw new IllegalArgumentException("Diagonal sum requires a square matrix");
        }

        System.out.println("Enter matrix elements: ");
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int res = diagonalSum(mat);
        System.out.println("The sum of diagonal elements: " + res);
        sc.close();
    }

    static int diagonalSum(int[][] mat) {

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {

            sum += mat[i][i];

        }
        return sum;
    }
}
