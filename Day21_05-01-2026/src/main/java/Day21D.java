import java.util.Scanner;

public class Day21D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of columns: ");
        int cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions are not valid!");
        }
        if (rows != cols) {
            throw new IllegalArgumentException("Not a square matrix!");
        }
        System.out.println("Enter matrix elements: ");
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        crossMatrix(mat);
        sc.close();
    }

    static void crossMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    System.out.print(mat[i][j]+" ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
