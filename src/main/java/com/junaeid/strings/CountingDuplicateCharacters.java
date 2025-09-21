package com.junaeid.strings;

import java.util.Arrays;
import java.util.HashMap;

public class CountingDuplicateCharacters {
    public static void main(String[] args) {
        String str = "abdcda";

        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : str.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        for(char c : freq.keySet()){
            if(freq.get(c)>1){
                System.out.println(c+ " --- "+freq.get(c));
            }
        }


    }

}
