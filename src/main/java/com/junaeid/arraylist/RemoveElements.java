package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        System.out.println(arrayList.indexOf(30));
        int indexOfTheNumber = arrayList.indexOf(30);
        arrayList.remove(indexOfTheNumber);
        System.out.println(arrayList);


        arrayList.remove(Integer.valueOf(40));
        System.out.println(arrayList);


    }
}
