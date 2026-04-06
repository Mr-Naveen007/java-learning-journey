package com.example;

import java.util.Scanner;

public class day07d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        long n = sc.nextLong();
        sc.close();
        long fact = 1;
        if (n < 0) {
            System.out.println("Enter a non-negative integer");
            return;
        }
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n > 20) {
            System.out.println("Factorial is too large to fit in long");
            return;
        }


        for (long i = n; i >= 1; i--) {
            fact *= i;
        }


        System.out.println(fact);
    }
}
