package com.naveen.backend;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

@FunctionalInterface
interface Printer {
    void print(String message);
}

@FunctionalInterface
interface Greeting {
    void greet();
}

public class Main {

    public static void main(String[] args) {

        // Two parameters + return value
        Calculator add = (a, b) -> a + b;

        // Two parameters + block body
        Calculator multiply = (a, b) -> {
            int result = a * b;
            return result;
        };

        // One parameter
        Printer printer = message ->
                System.out.println(message);

        // No parameters
        Greeting greeting = () ->
                System.out.println("Hello Naveen");

        System.out.println(add.calculate(10, 5));

        System.out.println(multiply.calculate(10, 5));

        printer.print("Lambda expressions are powerful");

        greeting.greet();
    }
}