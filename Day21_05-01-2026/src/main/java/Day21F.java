import java.util.Scanner;

public class Day21F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of columns: ");
        int cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions are not valid!");
        }
        System.out.println("Enter matrix elements: ");
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrixRotation90(mat));
        sc.close();
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
                if (j < mat[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static int[][] matrixRotation90(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
        int[][] sol = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sol[j][rows - 1 - i] = mat[i][j];

            }

        }
        return sol;
    }
}
