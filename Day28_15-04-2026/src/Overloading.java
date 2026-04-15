// method overloading


public class Overloading {
    public static class Calculator {

        // Method 1
        int add(int a, int b) {
            return a + b;
        }

        // Method 2 (different parameters)
        int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method 3 (different type)
        double add(double a, double b) {
            return a + b;
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));          // calls method 1
        System.out.println(calc.add(2, 3, 4));       // calls method 2
        System.out.println(calc.add(2.5, 3.5));      // calls method 3
    }
}