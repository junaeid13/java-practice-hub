package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        List<Integer> reverse_number = new ArrayList<>();
        for (int i = numbers.size(); i > 0; i--) {
            reverse_number.add(i);
        }

        System.out.println(reverse_number);
    }
}
