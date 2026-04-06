package com.example;

import java.util.Scanner;

public class day07e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (num == 0) {
            System.out.println("Number is Armstrong");
            return;
        }
        if (num < 0) {
            System.out.println("Enter a non-negative integer");
            return;
        }

        int exp = 0;
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            exp++;
            temp /= 10;
        }
        int temp1 = num;
        while (temp1 > 0) {
            int d = temp1 % 10;
            sum += (int) Math.pow(d, exp);
            temp1 /= 10;

        }
        if (sum == num) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not an Armstrong");
        }
    }
}
