package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> check : freq.entrySet()) {

            if (check.getValue() > 1) {
                System.out.println(true);
            }

        }
    }
}
