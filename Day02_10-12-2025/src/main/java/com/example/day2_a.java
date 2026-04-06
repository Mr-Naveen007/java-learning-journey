package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class day2_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Input an integer score: ");
        int score = sc.nextInt();
    if (score >= 90) {
        System.out.println("A Grade");
    }
    else if (score >= 70) {
        System.out.println("B Grade");
    }
    else if (score >= 50) {
        System.out.println("C Grade");
    }
    else {
        System.out.println("Fail");
    }
    sc.close();
    }
    }
