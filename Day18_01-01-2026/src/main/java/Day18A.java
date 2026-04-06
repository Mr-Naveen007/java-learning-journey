
import java.util.Scanner;

public class Day18A {
    public static class Stats {
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        Stats res = stringStats(s);

        System.out.println("Vowels count: " + res.vowelCount);
        System.out.println("Digits count: " + res.digitCount);
        System.out.println("Spaces count: " + res.spaceCount);
        System.out.println("Consonants count: " + res.consonantCount);
        sc.close();
    }

    static Stats stringStats(String s) {
        Stats stats = new Stats();

        if (s == null) return stats;


        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                stats.vowelCount++;
            } else if (Character.isDigit(ch)) {
                stats.digitCount++;
            } else if (Character.isWhitespace(ch)) {
                stats.spaceCount++;
            } else if (Character.isLetter(ch)) {
                stats.consonantCount++;
            }
        }

        return stats;
    }
}