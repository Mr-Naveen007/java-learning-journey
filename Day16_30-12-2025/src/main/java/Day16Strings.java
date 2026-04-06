import java.util.Scanner;

public class Day16Strings {
    static class Stats {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        Stats result = stringStats(s);
        System.out.println("Number of vowels: " + result.vowels);
        System.out.println("Number of consonants: " + result.consonants);
        System.out.println("Number of spaces: " + result.spaces);
        sc.close();
    }

    static Stats stringStats(String s) {
        Stats ob = new Stats();
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    ob.vowels++;
                else ob.consonants++;
            } else if (Character.isWhitespace(ch)) {
                ob.spaces++;
            } else {
                // digits and symbols ignored
            }

        }
        return ob;
    }

}


