package com.naveen.backend;

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);

    default void showType() {
        System.out.println("This is a calculator");
    }

    static void info() {
        System.out.println("Calculator performs mathematical operations");
    }
}

public class Main {

    public static void main(String[] args) {

        // Lambda implements calculate()
        Calculator add = (a, b) -> a + b;

        Calculator multiply = (a, b) -> a * b;

        Calculator subtract = (a, b) -> a - b;

        // Calling the abstract method implementation
        System.out.println(add.calculate(10, 5));
        System.out.println(multiply.calculate(10, 5));
        System.out.println(subtract.calculate(10, 5));

        // Calling default method
        add.showType();

        // Calling static method
        Calculator.info();
    }
}