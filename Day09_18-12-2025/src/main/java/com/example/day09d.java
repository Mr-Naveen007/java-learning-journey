package com.example;

import java.util.Scanner;

public class day09d {
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

        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break; //early exit = efficiency + correctness
            }

        }

        System.out.println(isSorted);
        sc.close();
    }
}