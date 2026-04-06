package com.example;

import java.util.Scanner;

public class day09a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than 0");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Maximum is = " + max);
        System.out.println("Minimum is = " + min);
        sc.close();

    }
}