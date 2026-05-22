package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String s = "banana";

        Map<Character, Integer> freq = new HashMap<>();

        char[] ch = s.toCharArray();
        for (char c : ch) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(freq);
    }
}
