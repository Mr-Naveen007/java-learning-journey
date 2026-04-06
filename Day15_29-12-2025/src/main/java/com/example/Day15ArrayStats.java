package com.example;

import java.util.Scanner;

public class Day15ArrayStats {
    static class Stats {
        int sum;
        int min;
        int max;
        int countOdd;
        int countEven;
        double avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Array cannot be empty!");
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stats result = analyze(arr);

        System.out.println("Sum: " + result.sum);
        System.out.println("Min: " + result.min);
        System.out.println("Max: " + result.max);
        System.out.println("Odd Elements: " + result.countOdd);
        System.out.println("Even Elements: " + result.countEven);
        System.out.println("Average: " + result.avg);

        sc.close();

    }

    static Stats analyze(int[] arr) {
        Stats s = new Stats();//Object creation
        s.sum = 0;
        s.min = arr[0];
        s.max = arr[0];
        s.countOdd = 0;
        s.countEven = 0;

        for (int j : arr) {
            s.sum += j;
            if (j < s.min) s.min = j;
            if (j > s.max) s.max = j;
            if (j % 2 != 0) {
                s.countOdd++;
            } else {
                s.countEven++;
            }
        }
        s.avg = (double) s.sum / arr.length;

        return s;
    }

}