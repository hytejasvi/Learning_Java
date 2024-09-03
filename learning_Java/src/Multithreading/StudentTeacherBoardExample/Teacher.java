package Multithreading.StudentTeacherBoardExample;

import java.util.ArrayList;

public class Teacher extends Thread {
    private WhiteBoard wb;
    private ArrayList<String> messages;
    private boolean isTeacher1;

    Teacher(WhiteBoard wb, boolean isTeacher1) {
        this.wb = wb;
        this.isTeacher1 = isTeacher1;
        messages = new ArrayList<>();
        messages.add("Sentence 1");
        messages.add("Sentence 2");
        messages.add("Sentence 3");
        messages.add("Sentence 4");
        messages.add("Sentence 5");
    }

    @Override
    public void run() {
        try {
            for (String message : messages) {
                wb.write(message, isTeacher1, Thread.currentThread().getName());  // Write each message on the board
                //Thread.sleep(100);  // Optional: Pause between messages
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            wb.finishWriting();  // Signal that this teacher has finished writing
            System.out.println(Thread.currentThread().getName()+" : finished writing");
        }
    }
}
