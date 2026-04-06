import java.util.Scanner;

public class Day21B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        printAllSubstrings(input);
        sc.close();
    }

    static void printAllSubstrings(String s) {
        if (s == null) return;
        int n = s.length();
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                System.out.println(s.substring(start, end));
            }
        }
    }
}
