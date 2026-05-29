package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length())
            System.out.println("Not a valid Anagram 1");
        else {

            Map<Character, Integer> freq = new HashMap<>();

            for (char character : str1.toCharArray()) {
                freq.put(character, freq.getOrDefault(character, 0) + 1);
            }

            for (char character : str2.toCharArray()) {
                if (!freq.containsKey(character) || freq.get(character) == 0) {
                    System.out.println("Not a valid Anagram 2");
                    break;
                }
                freq.put(character, freq.get(character) - 1);
            }

            System.out.println("The Characters are Valid Anagram");
        }
    }
}
