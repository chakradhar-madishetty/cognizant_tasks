package Week_2.Threads.Exercise_2;

import java.util.Random;

public class Sensor extends Thread {
    private String sensorName;
    private Random random = new Random();

    public Sensor(String sensorName) {
        this.sensorName = sensorName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                int data = random.nextInt(100);
                System.out.println(sensorName + " collected data: " + data);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(sensorName + " was interrupted.");
        }
        System.out.println(sensorName + " finished collecting data.");
    }
}

