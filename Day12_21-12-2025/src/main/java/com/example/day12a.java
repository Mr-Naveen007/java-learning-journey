package com.example;
import java.util.Scanner;

public class day12a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        System.out.println("Vowels count: " + vowelCount);
        System.out.println("Digits count: " + digitCount);
        System.out.println("Spaces count: " + spaceCount);
        System.out.println("Consonants count: " + consonantCount);
        sc.close();
    }
}