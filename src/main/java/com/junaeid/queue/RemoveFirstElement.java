package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveFirstElement {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i =10;i<60;i+=10)
            queue.offer(i);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
