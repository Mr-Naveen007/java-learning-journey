package com.example;

import java.util.Scanner;

public class StudyCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes you studied today: ");
        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int rem = minutes % 60;

        System.out.println("Hours: " + hours + ", Minutes: " + rem);

        if (minutes >= 360)
            System.out.println("BEAST MODE");
        else
            System.out.println("TRY AGAIN");
    }
}


