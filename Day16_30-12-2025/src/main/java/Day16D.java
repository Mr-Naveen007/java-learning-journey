import java.util.Scanner;

public class Day16D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Case 1: User input (usually different objects) =====
        System.out.println("Enter string1: ");
        String s1 = sc.next();

        System.out.println("Enter string2: ");
        String s2 = sc.next();

        System.out.println("\n--- User Input Comparison ---");
        System.out.println("Content equal: " + s1.equals(s2));
        System.out.println("Reference equal: " + (s1 == s2));

        // ===== Case 2: String literals (string pool) =====
        String a = "java";
        String b = "java";

        System.out.println("\n--- String Literal Comparison ---");
        System.out.println("Content equal: " + a.equals(b));
        System.out.println("Reference equal: " + (a == b));

        // ===== Case 3: Explicit new objects =====
        String x = new String("java");
        String y = new String("java");

        System.out.println("\n--- new String() Comparison ---");
        System.out.println("Content equal: " + x.equals(y));
        System.out.println("Reference equal: " + (x == y));

        // ===== Case 4: intern() forces same reference =====
        String p = new String("java").intern();
        String q = new String("java").intern();

        System.out.println("\n--- intern() Comparison ---");
        System.out.println("Content equal: " + p.equals(q));
        System.out.println("Reference equal: " + (p == q));

        sc.close();
    }
}
