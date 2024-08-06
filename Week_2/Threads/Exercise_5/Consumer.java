package Week_2_Threading;
public class Consumer extends Thread {
    private final DataQueue dataQueue;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                dataQueue.consume();
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
