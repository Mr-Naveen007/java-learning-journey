package com.example;

import java.util.Scanner;

public class day03f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        boolean isPositive = false;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
        } else if (n > 0) {
            isPositive = true;
        }

        if (isPositive) {
            System.out.println("POSITIVE");
        } else if (isNegative) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }

    }
}