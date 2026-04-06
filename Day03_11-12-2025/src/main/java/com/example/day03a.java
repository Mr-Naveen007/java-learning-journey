package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class day03a {
    public static void main(String[] args) {
        for(int i=1; i <= 20; i++) {
            if( i%4 == 0) {
                continue;
            }
            if(i == 17) {
                break;
            }
            System.out.println(i);
        }
    }
}