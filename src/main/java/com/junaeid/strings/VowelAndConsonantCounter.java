package com.junaeid.strings;

public class VowelAndConsonantCounter {
    public static void main(String[] args) {
        String str = "programming";
        int vowels = 0;
        int consonant = 0;
        char[] str_to_char = str.toCharArray();

        for (int i = 0; i < str_to_char.length; i++) {
            if (
                    str_to_char[i] == 'a' ||
                            str_to_char[i] == 'A' ||
                            str_to_char[i] == 'e' ||
                            str_to_char[i] == 'E' ||
                            str_to_char[i] == 'i' ||
                            str_to_char[i] == 'I' ||
                            str_to_char[i] == 'o' ||
                            str_to_char[i] == 'O' ||
                            str_to_char[i] == 'u' ||
                            str_to_char[i] == 'U'
            ) {
                vowels++;
            } else
                consonant++;
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonant : " + consonant);
    }
}
