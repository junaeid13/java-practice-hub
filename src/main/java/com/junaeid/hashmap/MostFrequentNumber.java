package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);

        int most_freq_value = 0;
        int most_freq_key = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (most_freq_value < e.getValue()) {
                most_freq_value = e.getValue();
                most_freq_key = e.getKey();
            }
        }
        System.out.println(most_freq_key + " : " + most_freq_value);
    }
}
