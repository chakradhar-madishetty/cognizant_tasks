package Week_2.Threads.Exercise_3;
public class Task extends Thread {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName + " started.");
            
            Thread.sleep(2000);
            
            System.out.println(taskName + " is yielding.");
            Thread.yield();
            
            // Simulate more work
            for (int i = 0; i < 3; i++) {
                System.out.println(taskName + " is working: " + i);
                Thread.sleep(1000);
            }
            
            System.out.println(taskName + " finished.");
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
    }
}
