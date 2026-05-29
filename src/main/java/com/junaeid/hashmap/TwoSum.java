package com.junaeid.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 11, 15};
        int target = 11;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if (map.containsKey(needed)) {
                System.out.println(
                        map.get(needed) + "," + i
                );
            }
            map.put(arr[i], i);
        }
    }
}
