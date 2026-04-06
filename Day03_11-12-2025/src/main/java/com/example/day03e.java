package com.example;

import java.util.Scanner;

public class day03e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        boolean isEven = (n % 2 == 0);

        if (isEven) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }
}