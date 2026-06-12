package com.junaeid.arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class UpdateAValue {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        int indexOf = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (Objects.equals(colors.get(i), "Green")) {
                indexOf = i;
                break;
            }
        }
        colors.set(indexOf, "Blue");

        System.out.println(colors);

        System.out.println("Better Solution:  ");
        dynamicUpdateAValue(colors);
    }

    public static void dynamicUpdateAValue(ArrayList<String> colors) {
        int index = colors.indexOf("Green");
        if (index != -1) {
            colors.set(index, "Blue");
        }

        System.out.println(colors);
    }
}
