package Multithreading.ThreadTest;

class MyThreads extends Thread {
    public MyThreads(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        int i=1;
        while (true) {
            System.out.println(Thread.currentThread().getName()+" "+i+" "+Thread.currentThread().getState());
            i++;
            /*try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThreads("Thread Tejas");//creating object of Thread class,
        // and also passing/creating the obj of MyThreads class.
        //naming the thread to Thread Tejas
        t.setDaemon(true);
        t.start();
        //t.interrupt();// if the thread has wait or sleep, then the main thread will interrupt that state.
        try{Thread.sleep(10);} catch(Exception e){};

        System.out.println("t.getName(): "+t.getName());
        System.out.println("t.getId(): "+t.getId());
        System.out.println("t.getPriority(): "+t.getPriority());
        System.out.println("t.getState(): "+t.getState());
    }
}
