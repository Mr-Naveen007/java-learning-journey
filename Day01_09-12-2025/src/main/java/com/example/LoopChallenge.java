package com.example;

public class LoopChallenge {
    public static void main(String[] args) {

        int n = 5;
        for(int i = 1; i <= n; i++) {
            if( i % 2 == 0) {
                System.out.println(i+" EVEN");
            }
            else{
                System.out.println(i+" ODD");
            }

        }

        int i = n;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }

    }
}


