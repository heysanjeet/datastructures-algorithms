package data_structures.stacks.implementation_using_AL;

public class StackALClient {
    public static void main(String[] args) {
        StackAL stackAL = new StackAL();
        stackAL.push(35);
        stackAL.push(65);
        stackAL.push(76);
        stackAL.push(5);
        stackAL.push(75);

        System.out.println(stackAL.peek());
        System.out.println(stackAL.isEmpty());
        System.out.println(stackAL.size());

        stackAL.pop();

        System.out.println(stackAL.peek());
        System.out.println(stackAL.isEmpty());
        System.out.println(stackAL.size());
    }
}
