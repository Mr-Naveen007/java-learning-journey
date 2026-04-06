package com.example;


public class day05c {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 73) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);

        }
    }
}