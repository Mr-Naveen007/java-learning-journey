package com.example;

import java.util.Scanner;

public class day07c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = sc.nextInt();
        sc.close();
        if (n <= 1) {
            System.out.println("No prime numbers exist less than or equal to " + n);
            return;
        }
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}