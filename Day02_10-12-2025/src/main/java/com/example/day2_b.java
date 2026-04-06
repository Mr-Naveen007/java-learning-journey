package com.example;

public class day2_b {
    public static void main(String[] args) {
        for(int i=1; i <= 30; i++) {
            if( i%4 == 0){
                continue;
            }
            if(i == 22) {
                break;
            }

            System.out.println(i);
        }
    }
}
