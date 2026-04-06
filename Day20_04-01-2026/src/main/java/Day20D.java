import java.util.Scanner;

public class Day20D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        System.out.println("Enter matrix elements: ");
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        colSum(mat);
        sc.close();
    }
    static void colSum(int[][] mat) {


        for(int j = 0; j < mat.length; j++) {
            int sum = 0;
            for(int i = 0; i < mat[i].length; i++) {
                sum += mat[i][j];
            }
            System.out.println("column "+j+" sum: "+sum);
        }
    }
}
