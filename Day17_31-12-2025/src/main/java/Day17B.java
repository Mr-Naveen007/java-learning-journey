import java.util.Scanner;

public class Day17B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        int res = wordCount(s);
        System.out.println("The number of words: " + res);
        sc.close();
    }

    static int wordCount(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (Character.isLetterOrDigit(s.charAt(i - 1)) && Character.isWhitespace(s.charAt(i))) {
                count++;
            }

        }

        if (Character.isLetterOrDigit(s.charAt(s.length() - 1))) {
            count++;
        }

        return count;
    }
}
