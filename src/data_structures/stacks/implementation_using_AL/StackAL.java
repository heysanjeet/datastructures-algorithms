package data_structures.stacks.implementation_using_AL;

import java.util.ArrayList;

public class StackAL {
    private ArrayList stackAL = new ArrayList();

    public void push(int data){
        stackAL.add(data);
    }

    public Object pop(){
        Object old_value=stackAL.get(stackAL.size()-1);
        stackAL.remove(stackAL.size()-1);
        return old_value;
    }

    public int size(){
        return (stackAL.size());
    }

    public Object peek(){
        return (stackAL.get(stackAL.size()-1));
    }

    public boolean isEmpty(){
        return (stackAL.isEmpty());
    }
}
