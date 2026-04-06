package com.example;

import java.util.Scanner;

public class day08d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

        }

        System.out.println("Odd numbers = " + odd);
        System.out.println("Even numbers = " + even);
        sc.close();
    }
}