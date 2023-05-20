package data_structures.java_collections.stack;

import java.util.ArrayDeque;

public class Stack {
    public static void main(String[] args) {
        //java.util.Stack stack=new java.util.Stack();//for multithreaded env.
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();//it not thread safe better to use in single threaded env.
        arrayDeque.push(34);
        arrayDeque.push(54);
        arrayDeque.push(87);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.size());

    }
    }

