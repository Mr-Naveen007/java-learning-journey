package com.example;

import java.util.Scanner;

public class day09b {
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
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecond = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
                foundSecond = true;
            }

        }

        System.out.println("Maximum is = " + max);

        if (!foundSecond) { //if(!foundSecond) => false, if(foundSecond) => true
            System.out.println("No second largest element");
        } else {
            System.out.println("Second maximum is = " + secondMax);
        }


        sc.close();

    }
}