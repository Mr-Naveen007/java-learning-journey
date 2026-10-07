package org.example;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

@FunctionalInterface
interface ObjectCalculator {
    int calculate(CalculatorUtil calculator, int a, int b);
}

@FunctionalInterface
interface CalculatorFactory {
    CalculatorUtil create();
}

class CalculatorUtil {

    // TYPE 1 — static methods
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    // TYPE 2 & 3 — instance methods
    int subtract(int a, int b) {
        return a - b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {

        // ====================================================
        // TYPE 1: STATIC METHOD REFERENCE
        // ====================================================

        Calculator add = CalculatorUtil::add;

        Calculator multiply = CalculatorUtil::multiply;

        System.out.println("1. STATIC METHOD");
        System.out.println(add.calculate(10, 20));
        System.out.println(multiply.calculate(10, 20));


        // ====================================================
        // TYPE 2: INSTANCE METHOD
        // ClassName::instanceMethod
        // ====================================================

        ObjectCalculator subtract = CalculatorUtil::subtract;

        CalculatorUtil calculator = new CalculatorUtil();

        System.out.println("\n2. INSTANCE METHOD");
        System.out.println(
                subtract.calculate(calculator, 20, 10)
        );


        // ====================================================
        // TYPE 3: PARTICULAR OBJECT'S INSTANCE METHOD
        // object::instanceMethod
        // ====================================================

        CalculatorUtil myCalculator = new CalculatorUtil();

        Calculator divide = myCalculator::divide;

        System.out.println("\n3. PARTICULAR OBJECT");
        System.out.println(
                divide.calculate(20, 5)
        );


        // ====================================================
        // TYPE 4: CONSTRUCTOR REFERENCE
        // ClassName::new
        // ====================================================

        CalculatorFactory factory = CalculatorUtil::new;

        CalculatorUtil newCalculator = factory.create();

        System.out.println("\n4. CONSTRUCTOR");
        System.out.println(
                newCalculator.subtract(30, 10)
        );
    }
}