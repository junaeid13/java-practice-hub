package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class AddIntegerQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < 5; i++)
            queue.offer(i);

        System.out.println(queue);

        System.out.println("First elements from the queue : " + queue.peek());

        System.out.println("Size of the queue : " + queue.size());

        for (int i = 0; i < 5; i++) {
            queue.poll();
            System.out.println(queue);
        }
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
    }
}
