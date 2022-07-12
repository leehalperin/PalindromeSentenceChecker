package com.sparta.lh;

import java.util.Scanner;

public class PalChecker {

    static boolean checkPal(String word) {
        int n = word.length();

        word = word.toLowerCase();

        for (int i = 0; i < n; i++, n--)
            if (word.charAt(i) !=
                    word.charAt(n - 1))
                return false;

        return true;
    }

    static String longestPal(String str) {
        str = str + " ";

        String longestword = "", word = "";

        int length, length1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ')
                word = word + ch;
            else {
                length = word.length();
                if (checkPal(word) &&
                        length > length1) {
                    length1 = length;
                    longestword = word;
                }

                word = "";
            }
        }

        return longestword;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a sentence to find the longest palindrome: ");
        String s = sc.nextLine();

        if (longestPal(s) == "" || longestPal(s).length()<6)
            System.out.println("No Palindrome with 6 or more letters has been found");
        else
            System.out.println("The longest Palindrome found in the sentence is: '" + longestPal(s)+"'");
    }
}