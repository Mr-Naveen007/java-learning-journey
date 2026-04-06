import java.util.Scanner;

public class Day16B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = strReverse(s);
        System.out.println("String reversed is: " + result);
        sc.close();
    }

    static String strReverse(String s) {
        StringBuilder ob = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            ob.append(s.charAt(i));
        }
        return ob.toString();
    }


}
