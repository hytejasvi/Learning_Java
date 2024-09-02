package Multithreading.InterThreadCommunicationExample;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Produces producer = new Produces(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
