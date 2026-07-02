package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 2, 3, 3, 4, 5)
        );

        HashSet<Integer> remove_duplicates = new HashSet<>(numbers);
        System.out.println(remove_duplicates);
    }
}
