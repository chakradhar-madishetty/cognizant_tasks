package Week_2_Threading;

public class ProducerConsumer {

    public static void main(String[] args) {
        DataQueue dataQueue = new DataQueue();

        Producer producer1 = new Producer(dataQueue);
        Producer producer2 = new Producer(dataQueue);

        Consumer consumer1 = new Consumer(dataQueue);
        Consumer consumer2 = new Consumer(dataQueue);

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

