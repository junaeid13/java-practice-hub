package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(15, 4, 89, 32, 7)
        );
        int max_number = 0;
        for (int i : numbers) {
            if (i >= max_number)
                max_number = i;
        }

        System.out.println("the max number is : " + max_number);
    }
}
