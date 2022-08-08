package data_structures.stacks;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;

    }

    public void push(long value) {
        if (isFull()) {
            stackArray = Arrays.copyOf(stackArray, maxSize * 2);
            maxSize = maxSize * 2;
        }
        top++;
        stackArray[top] = value;

    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("The stack is already empty....");
            return -1;
        }
        long topValue = stackArray[top];
        top--;
        return topValue;
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
