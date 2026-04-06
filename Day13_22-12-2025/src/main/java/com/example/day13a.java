package com.example;
import java.util.Scanner;

public class day13a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        if( n <= 0) {
            throw new IllegalArgumentException("Array cannot be empty!");
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        int eCount = evenCount(arr);
        int oCount = oddCount(arr);
        int[] res;
        res = reverseArray(arr);
        System.out.println("Number of even elements: "+eCount);
        System.out.println("Number of odd elements: "+oCount);
        System.out.println("The reversed array: ");
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if(i < res.length-1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
    static int evenCount(int[] arr) {
        int eCount = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                eCount++;
            }
        }
        return eCount;
    }
    static int oddCount(int[] arr) {
        int oCount = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oCount++;
            }
        }
        return oCount;
    }
    static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = arr[arr.length-1-i];
        }
        return res;
    }

}