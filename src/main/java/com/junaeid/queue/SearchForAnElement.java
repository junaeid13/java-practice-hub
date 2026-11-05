package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class SearchForAnElement {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i =10;i<60;i+=10)
                queue.offer(i);
        int j = 100;
        if(queue.contains(j))
            System.out.println(j+" exists : True");
        else
            System.out.println(j+" exists : false");

    }
}
