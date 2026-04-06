package com.example;
public class day04c {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
