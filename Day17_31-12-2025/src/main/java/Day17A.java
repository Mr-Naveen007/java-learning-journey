import java.util.Scanner;

public class Day17A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean res = isPrime(n);
        System.out.println("Given number is prime: " + res);
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
