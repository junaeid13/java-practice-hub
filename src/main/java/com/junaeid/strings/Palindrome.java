package com.junaeid.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ababa";
        char[] str_to_char = str.toCharArray();
        int half_size = str_to_char.length;
        boolean t = true;
        int i = 0;
        int j = str_to_char.length - 1;
        while (i < half_size) {
            if (str_to_char[i] != str_to_char[j]) {
                System.out.println("Not Palindrome");
                t = false;
                break;
            }
            i++;
            j--;
        }
        if (t) {
            System.out.println("Palindrome");
        }
    }
}
