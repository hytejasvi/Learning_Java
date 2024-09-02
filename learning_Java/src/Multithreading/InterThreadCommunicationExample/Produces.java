package Multithreading.InterThreadCommunicationExample;

public class Produces extends Thread {
    SharedResource sd;

    Produces(SharedResource sd) {
        this.sd = sd;
    }

    @Override
    public void run() {
        int counter = 1;
        while (counter <= 50) {
            try {
                sd.setValue(counter); // Set the value in the shared resource
                counter++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
