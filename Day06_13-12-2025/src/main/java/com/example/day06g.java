package com.example;

import java.util.Scanner;

public class day06g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}