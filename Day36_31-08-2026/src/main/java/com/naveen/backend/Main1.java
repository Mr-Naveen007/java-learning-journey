package com.naveen.backend;

@FunctionalInterface
interface Calculator1 {
    int calculate(int a, int b);
}

public class Main1 {

    static int execute(
            int a,
            int b,
            Calculator1 calculator) {

        return calculator.calculate(a, b);
    }

    public static void main(String[] args) {

        Calculator1 add = (a, b) -> a + b;

        Calculator1 multiply = (a, b) -> a * b;

        int result1 = execute(10, 5, add);
        int result2 = execute(10, 5, multiply);

        int result3 =
                execute(10, 5, (a, b) -> a - b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}