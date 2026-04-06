package com.example;

import java.util.Scanner;

public class day09e {
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


        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
        sc.close();
    }
}