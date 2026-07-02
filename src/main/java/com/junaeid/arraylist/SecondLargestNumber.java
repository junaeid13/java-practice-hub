package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 15, 40, 25, 40, 15)
        );

        int max = 1;
        int second_max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= max) {
                max = numbers.get(i);
            }
            if (numbers.get(i) >= second_max && numbers.get(i) < max && second_max < max) {
                second_max = numbers.get(i);
            }
        }
        System.out.println(max);
        System.out.println(second_max);
    }
}
