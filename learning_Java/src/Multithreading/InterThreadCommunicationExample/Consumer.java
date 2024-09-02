package Multithreading.InterThreadCommunicationExample;

public class Consumer extends Thread {
    SharedResource sd;

    Consumer(SharedResource sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        int value = 0;
        while (value != 50) {  // Loop until the last value is consumed
            try {
                value = sd.getValue(); // Get the value from the shared resource
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
