import java.util.Scanner;

public class Day21E {
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
        int[][] res = transposeMatrix(mat);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]);
                if (j < res[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static int[][] transposeMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] res = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = mat[i][j];

            }

        }
        return res;
    }
}
