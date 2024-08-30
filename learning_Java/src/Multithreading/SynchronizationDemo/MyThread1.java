package Multithreading.SynchronizationDemo;

public class MyThread1 extends Thread {
    SharedResourceSample sr;
    MyThread1(SharedResourceSample sr) {
        this.sr = sr;
    }
    @Override
    public void run() {
        sr.display("Hello World!");
    }
}
