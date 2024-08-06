package Week_2_Threading;

public class Producer extends Thread {
    private final DataQueue dataQueue;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) { 
                dataQueue.produce(i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

