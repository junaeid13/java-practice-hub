package com.junaeid.strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindingFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abcdb";
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Find the Non Repeated Character: "+entry.getKey());
                return;
            }
        }
    }
}