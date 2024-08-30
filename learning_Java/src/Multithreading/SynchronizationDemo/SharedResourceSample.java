package Multithreading.SynchronizationDemo;

public class SharedResourceSample {
    void display(String content) {
        synchronized (this) {
            for (int i = 0; i < content.length() - 1; i++) {
                System.out.print(content.charAt(i));
            }
            System.out.println();
        }
    }
}
