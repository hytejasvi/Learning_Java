package Multithreading.ThreadTest;
//1 way of running a thread: creating an object and calling the obj reference.start method
/*class MyThread extends Thread {
    public void run() {
       int i=1;
       while (true) {
           System.out.println(i+" Hello ");
           i++;
       }
    }
}
public class ThreadTest {
    public static void main (String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        int j=1;
        while (true) {
            System.out.println(j+" World");
            j++;
        }
    }

}*/

// creating object of the same class and call run method.
/*
public class ThreadTest extends Thread{
    public void run() {
        int i=1;
        while (true) {
            System.out.println(i+" Hello ");
            i++;
        }
    }
    public static void main (String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();
        int j=1;
        while (true) {
            System.out.println(j+" World");
            j++;
        }
    }
}*/

class MyThread implements Runnable {
    @Override
    public void run() {
        int i=1;
        while (true) {
            System.out.println(i+" Hello ");
            i++;
        }
    }
}
public class ThreadTest {
    public static void main (String[] args) {
        MyThread mt = new MyThread();
        Thread th = new Thread(mt);
        th.start();
        int j=1;
        while (true) {
            System.out.println(j+" World");
            j++;
        }
    }

}