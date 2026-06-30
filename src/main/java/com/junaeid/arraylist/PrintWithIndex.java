package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintWithIndex {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>(
                Arrays.asList("Java", "Python", "C++", "Go")
        );

        for (int i = 0; i < listOfString.size(); i++) {
            System.out.println(i + " -> " + listOfString.get(i));
        }

    }
}
