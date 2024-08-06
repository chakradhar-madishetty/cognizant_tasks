package Week_2.Threads.Exercise_2;


class SensorSimulation {

    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("Sensor 1");
        Sensor sensor2 = new Sensor("Sensor 2");
        Sensor sensor3 = new Sensor("Sensor 3");

        sensor1.start();
        sensor2.start();
        sensor3.start();

        try {
            sensor1.join();
            sensor2.join();
            sensor3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All sensors have completed data collection.");
    }
}

