package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveThreeElements {
    public static void main(String [] args){
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 5; i <30;i+=5){
            queue.offer(i);
        }

        for(int i =0;i<3;i++){
            System.out.println("Removed: "+queue.remove());
            System.out.println("Queue: "+queue);
        }

    }
}
