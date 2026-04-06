package com.example;

import java.util.Scanner;

public class day11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element to search: ");
        int target = sc.nextInt();
        int eCount = countEven(arr);
        int oCount = countOdd(arr);
        boolean key = contains(arr, target);
        System.out.println("Number of even elements are: " + eCount);
        System.out.println("Number of odd elements are: " + oCount);
        System.out.println("Array contains the target element: " + key);
    }

    static int countEven(int[] arr) {
        int eCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                eCount++;
            }
        }
        return eCount;
    }

    static int countOdd(int[] arr) {
        int oCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oCount++;
            }
        }
        return oCount;
    }

    static boolean contains(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}