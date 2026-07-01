package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 7, 10, 13, 18)
        );
        int count = 0;
        for (int i : numbers)
            if (i % 2 == 0)
                count++;

        System.out.println("total even number : " + count);
    }
}
