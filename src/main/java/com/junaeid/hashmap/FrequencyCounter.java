package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key+" : "+freq.get(key));
        }
        System.out.println(freq);
    }
}
