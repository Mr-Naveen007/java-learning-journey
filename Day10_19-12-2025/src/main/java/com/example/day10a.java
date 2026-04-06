package com.example;

import java.util.Scanner;

public class day10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to check prime: ");
        int num = sc.nextInt();
        int sum = addArray(arr);
        System.out.println("The sum of array elements is: " + sum);
        int max = largeEle(arr);
        System.out.println("The largest element in the array is: " + max);
        boolean isPrime = prime(num);
        System.out.println("The given number is prime?: " + isPrime);
        sc.close();
    }

    static int addArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int largeEle(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}