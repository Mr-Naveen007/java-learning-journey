package com.example;

public class day2_c {
    public static void main(String[] args) {
        int x = 1;
        for(int i=1; i <= 5; i++) {
            x += i;
            if( x % 3 == 0) {
                x += 2;
            }
        }
        System.out.println(x);
    }
}
