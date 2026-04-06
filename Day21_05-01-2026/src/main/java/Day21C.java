import java.util.Scanner;

public class Day21C {
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
        int res = secondaryDiagonalSum(mat);
        System.out.println("The secondary diagonal sum is: " + res);

        sc.close();
    }

    static int secondaryDiagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][n - 1 - i];
        }
        return sum;
    }
}
