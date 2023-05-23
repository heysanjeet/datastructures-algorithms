package data_structures.queue;

import java.util.Arrays;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;


    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            queueArray = Arrays.copyOf(queueArray, maxSize * 2);
        }
        rear++;
        queueArray[rear] = value;
        nItems++;
    }

    public long remove() {
        long fontValue = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;//we removed all the items
        }
        nItems--;
        return fontValue;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }
}
