package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPosition {
    public static void main(String[] args) {
        List<String> string_names = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Orange")
        );

        String search = "Orange";
        int the_index_of_name = string_names.indexOf(search);
        System.out.println(the_index_of_name);
    }
}
