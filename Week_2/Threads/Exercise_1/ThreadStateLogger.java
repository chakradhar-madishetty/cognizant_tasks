package Week_2.Threads.Exercise_1;


public class ThreadStateLogger {

    public static void main(String[] args) throws InterruptedException {
        Thread taskThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread is running: " + i);
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        System.out.println("Thread state before starting: " + taskThread.getState());

        taskThread.start();

        System.out.println("Thread state after starting: " + taskThread.getState());

        while (taskThread.isAlive()) {
            System.out.println("Thread state during execution: " + taskThread.getState());
            Thread.sleep(1000);
        }

        System.out.println("Thread state after completion: " + taskThread.getState());
    }
}

