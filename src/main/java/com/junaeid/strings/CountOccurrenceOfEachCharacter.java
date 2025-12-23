package com.junaeid.strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> number_of_occurrence = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (number_of_occurrence.containsKey(c)) {
                number_of_occurrence.put(c, number_of_occurrence.get(c) + 1);
            } else {
                number_of_occurrence.put(c, 1);
            }
        }
        System.out.println(number_of_occurrence);
    }
}
