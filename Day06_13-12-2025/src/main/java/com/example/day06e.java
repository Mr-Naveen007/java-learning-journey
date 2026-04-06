package com.example;

import java.util.Scanner;

public class day06e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();
        int digits = 0;
        int temp = n;
        while(temp > 0) {
            digits++;
            temp = temp/10;
        }
        System.out.println("The number of digits are: " + digits);
    }
}