package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>(
                Arrays.asList(5, 10, 15, 20)
        );

        int sum = 0;
        for (int i : listOfNumber)
            sum += i;

        System.out.println("Sum of All the Numbers : " + sum);
    }
}
