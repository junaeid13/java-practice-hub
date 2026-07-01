package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(15, 4, 89, 32, 7)
        );

        int smallest_number = numbers.get(0);
        for (int i : numbers)
            if (smallest_number >= i)
                smallest_number = i;

        System.out.println("the smallest number : " + smallest_number);
    }
}
