package com.example;
import java.util.Scanner;

public class day04d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            boolean isPrime = i != 1;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                continue;  // skip primes
            } else {
                System.out.println(i);  // print non-primes
            }
        }
    }
}
