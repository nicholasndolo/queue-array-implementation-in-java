package com.nicholasndolo.queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueque(10);
        queue.enqueque(20);
        queue.enqueque(30);

        System.out.println(queue);
    }
}
