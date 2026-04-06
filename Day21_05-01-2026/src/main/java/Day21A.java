import java.util.Scanner;

public class Day21A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int[] result = characterFrequency(input);
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println("'" + (char) i + "' :" + result[i]);
            }
        }

        sc.close();
    }

    static int[] characterFrequency(String s) {
        int[] freq = new int[128];
        if (s == null) return freq;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 128) {
                freq[ch]++;
            }
        }

        return freq;
    }
}
