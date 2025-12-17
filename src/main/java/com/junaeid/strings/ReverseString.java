package com.junaeid.strings;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder reverse_string = new StringBuilder();
        String str = "abcd";
        System.out.println(str);

        char[] str_to_char = str.toCharArray();
        for (int i = str_to_char.length - 1; i >= 0; i--) {
            reverse_string.append(str_to_char[i]);
        }
        System.out.println(reverse_string);
    }
}
