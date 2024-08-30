package Multithreading.SynchronizationDemo;

public class Main {
    public static void main (String[] args) {
        SharedResourceSample sr = new SharedResourceSample();
        MyThread1 mt1 = new MyThread1(sr);
        MyThread2 mt2 = new MyThread2(sr);
        mt1.start();
        mt2.start();
    }
 }
