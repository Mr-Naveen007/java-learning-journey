package com.example;
import java.util.Scanner;

public class day04a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        if( n <= 1) {
            System.out.println(n+" is not a prime ");
            return;
        }
        boolean isPrime = true;
        for(int i=2; i*i <= n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(n+" is a prime");

        }
        else {
            System.out.println(n+" is not a prime");
        }
    }
}