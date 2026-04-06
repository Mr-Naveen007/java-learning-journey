package com.example;
import java.util.Scanner;

public class day04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        if( n <= 1) {
            return;
        }
        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j=2; j*j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}