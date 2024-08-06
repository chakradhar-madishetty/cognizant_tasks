package Week_2.Threads.Exercise_5;
import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 10; 

    public synchronized void produce(int data) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(data);
        System.out.println("Produced: " + data);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); 
        }
        int data = queue.poll();
        System.out.println("Consumed: " + data);
        notifyAll();
        return data;
    }
}
