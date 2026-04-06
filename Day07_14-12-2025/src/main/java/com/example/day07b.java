package com.example;

import java.util.Scanner;

public class day07b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = sc.nextInt();
        sc.close();
        if (n <= 1) {
            System.out.println(n+" is not a prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(n+" is a Prime");
        }
        else {
            System.out.println(n+" is not a Prime");
        }

    }
}