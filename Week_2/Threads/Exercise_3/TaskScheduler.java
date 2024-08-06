package Week_2.Threads.Exercise_3;
public class TaskScheduler {

    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        // Start the task threads
        task1.start();
        task2.start();
        
        try {
            task1.join();
            task3.start();
            
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        
        System.out.println("All tasks have completed.");
    }
}

