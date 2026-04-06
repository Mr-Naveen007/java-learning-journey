package com.example;

import java.util.Scanner;

public class day03g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        boolean isDivBy3 = (n % 3 == 0);
        boolean isDivBy5 = (n % 5 == 0);

        if (isDivBy3 && isDivBy5) {
            System.out.println("DIVISIBLE BY BOTH");
        } else if (isDivBy3) {
            System.out.println("DIVISIBLE BY 3");
        } else if (isDivBy5) {
            System.out.println("DIVISIBLE BY 5");
        } else {
            System.out.println("NOT DIVISIBLE");
        }

    }

}
