package data_structures.stacks;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(25);
        stack.push(40);
        stack.push(90);
        //System.out.println(stack.isFull());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        //stack.printStack();

       /* for(int i=0;i<=100;i++){
            stack.push(i);
        }*/

       stack.printStack();
    }
}
