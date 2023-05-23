package data_structures.array;

import java.util.Arrays;

public class ArraysImpl {
    /**
     * Implementation of Arrays datastructures.
     */
    private int length = 0;
    private Object[] data;
    private int capacity;

    public ArraysImpl() {
        this.data = new Object[1];
        this.capacity = 1;
    }

    //Get the item from the array
    public Object get(int index) {
        return data[index];
    }

    public void push(Object value) {
        if (capacity == length) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[length] = value;
        length++;
    }

    public int size() {
        return length;
    }

    //delete the last element
    public Object pop() {
        Object oldValue = data[length - 1];
        data[length - 1] = null;
        length--;
        return oldValue;
    }

    public Object delete(int index) {
        Object deleteItem = data[index];
        shiftItems(index);
        return deleteItem;
    }

    //we have to shift the items after deleting.
    public void shiftItems(int index) {
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        //for the last item
        data[length - 1] = null;
        length--;
    }

    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }
}
