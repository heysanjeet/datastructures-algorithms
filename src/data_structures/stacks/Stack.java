package data_structures.stacks;

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
        top++;
        stackArray[top] = value;

    }

    public long pop() {
        long topValue = stackArray[top];
        top--;
        return topValue;
    }

    public int size() {
        return top;
    }
}
