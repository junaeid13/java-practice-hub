package com.junaeid.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder reverse_string = new StringBuilder();
        char[] str_to_char = str.toCharArray();
        for (int i = str_to_char.length - 1; i >= 0; i--) {
            reverse_string.append(str_to_char[i]);
        }
        return reverse_string.toString();
    }
}
