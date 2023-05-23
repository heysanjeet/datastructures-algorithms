package data_structures.stack.implementation_using_LL;

public class StackLLClient {
    public static void main(String[] args) {
        StackLL stackLL=new StackLL();
        stackLL.push(24);
        stackLL.push(56);
        stackLL.push(76);

        System.out.println(stackLL.size);
        System.out.println(stackLL.isEmpty());
        System.out.println(stackLL.peek());

        stackLL.pop();

        System.out.println(stackLL.size);
        System.out.println(stackLL.isEmpty());
        System.out.println(stackLL.peek());
    }
}
