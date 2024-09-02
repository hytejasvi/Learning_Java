package Multithreading.InterThreadCommunicationExample;

public class SharedResource {
    private int value = 0;
    private boolean isWriteAllowed = true;

    synchronized public void setValue(int value) throws InterruptedException {
        // Wait until it is allowed to write a new value
        while (!isWriteAllowed) {
            wait();
        }
        // Produce the value
        this.value = value;
        System.out.println("Producer: " + value);

        // Writing is done, now it's time to read
        isWriteAllowed = false;
        notify(); // Notify the consumer
    }

    synchronized public int getValue() throws InterruptedException {
        // Wait until it is allowed to read a new value
        while (isWriteAllowed) {
            wait();
        }
        // Consume the value
        int consumedValue = this.value;
        System.out.println("Consumed value: " + consumedValue);

        // Reading is done, now it's time to write
        isWriteAllowed = true;
        notify(); // Notify the producer
        return consumedValue;
    }
}
