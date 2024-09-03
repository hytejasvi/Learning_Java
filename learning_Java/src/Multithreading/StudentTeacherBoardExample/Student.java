package Multithreading.StudentTeacherBoardExample;

public class Student extends Thread {
    private WhiteBoard wb;

    Student(WhiteBoard wb) {
        this.wb = wb;
    }

    @Override
    public void run() {
        try {
            while (true) {
                wb.readBoard(Thread.currentThread().getName());  // Students keep reading messages
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished student reading");
        }
    }
}
