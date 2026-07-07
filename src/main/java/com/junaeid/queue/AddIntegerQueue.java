package com.junaeid.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class AddIntegerQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);
    }
}
