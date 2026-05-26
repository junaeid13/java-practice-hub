package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 4, 7};

        Map<Integer, Integer> seen = new HashMap<>();
        for (int num : arr) {
            if (seen.containsKey(num)) {
                System.out.println(num);
                break;
            } else {
                seen.put(num, seen.getOrDefault(num, 0) + 1);
            }
        }

    }
}
