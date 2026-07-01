package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckStudentExists {
    public static void main(String[] args) {
        ArrayList<String> student_list = new ArrayList<>(
                Arrays.asList("Ali", "John", "Maria", "Ema")
        );

        String search = "Maria";

        if (student_list.contains(search))
            System.out.println("Student name " + search + " exists in the list");
        else
            System.out.println("Not Available");
    }
}
