package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 5, 5};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> repeat : freq.entrySet()) {
            if (repeat.getValue() > 1) {
                System.out.println(repeat.getKey());
            }

        }
    }
}
