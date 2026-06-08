package com.junaeid.arraylist;

import java.util.ArrayList;

public class FavoriteFood {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        foods.add("apple");
        foods.add("fish");
        foods.add("banana");

        System.out.println("List of available foods : " + foods);
        System.out.println("Get the first food : " + foods.getFirst());
        System.out.println("Get the last food : " + foods.getLast());
        System.out.println("Total Number of Foods : " + foods.size());
    }
}
