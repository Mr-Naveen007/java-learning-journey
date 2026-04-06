package com.example;

public class RefDemo {
    public static void main(String[] args) {

        int x = 5;
        int y = x;
        y = 20;

        System.out.println("Primitive x: " + x);
        System.out.println("Primitive y: " + y);

        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;

        System.out.println("Array a[0]: " + a[0]);
        System.out.println("Array b[0]: " + b[0]);
    }
}

