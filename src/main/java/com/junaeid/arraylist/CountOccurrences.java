package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOccurrences {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 10, 30, 10, 40)
        );
        int count_num_of_appears = 10;
        int count = 0;
        for (int i : numbers)
            if (i == count_num_of_appears)
                count++;

        System.out.println(count);
    }
}

