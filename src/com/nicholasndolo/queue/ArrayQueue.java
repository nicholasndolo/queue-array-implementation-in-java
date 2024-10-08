package com.nicholasndolo.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private int[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }


    public void enqueque(int item){
        if(isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;

    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();

        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return count == items.length;
    }



    @Override
   public String toString(){
       return Arrays.toString(items);
    }

}
