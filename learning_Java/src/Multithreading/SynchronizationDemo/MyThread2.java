package Multithreading.SynchronizationDemo;

public class MyThread2 extends Thread{
    SharedResourceSample sr;
    public MyThread2(SharedResourceSample sr) {
        this.sr = sr;
    }

    @Override
    public void run() {
        sr.display("Welcome !!");
    }
}
