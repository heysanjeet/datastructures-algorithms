package data_structures.queues;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue(2);
        queue.insert(10);
        queue.insert(23);


       queue.printQueue();
       System.out.println(queue.isFull());
    }
}
