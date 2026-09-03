package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CheckQueueIsEmpty {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i<5;i++)
            queue.offer(i);

        if(!queue.isEmpty())
            System.out.println(queue);
    }
}
