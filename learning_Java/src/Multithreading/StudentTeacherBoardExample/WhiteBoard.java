package Multithreading.StudentTeacherBoardExample;

public class WhiteBoard {
    private String message;
    private boolean reading = false;
    private int studentCounter = 0;
    private final int totalStudents = 5; // Assuming 5 students
    // New flag to manage which teacher is currently allowed to write
    private boolean isTeacher1Writing = true;
    private boolean finished = false;  // New flag to signal when writing is finished

    // Method for the Teacher to write a message on the board
    synchronized public void write(String message, boolean isTeacher1, String threadName) throws InterruptedException {
        // Ensure that only the teacher who is allowed to write is writing
        while (reading || isTeacher1Writing != isTeacher1) {
            wait();
        }
        this.message = message;
        System.out.println(threadName+" Writes: " + message);
        reading = true;
        studentCounter = 0; // Reset counter for the new message
        notifyAll(); // Notify all students that a new message is available
    }

    // Method for Students to read the message from the board
    synchronized public void readBoard(String studentName) throws InterruptedException {
        while (!reading) {
            wait(); // Wait until a new message is written
            if (finished) {
                System.out.println(Thread.currentThread().getName()+" : inside while of reading: finished ");
                return;
            }  // Exit if there are no more messages
        }
        System.out.println("Message read by: " + studentName);
        studentCounter++;

        if (studentCounter == totalStudents) {
            reading = false; // All students have read the message
            isTeacher1Writing = !isTeacher1Writing; // Switch which teacher can write next
            if (finished) {
                System.out.println(Thread.currentThread().getName()+" : reading: finished ");
                return;
            }
            notifyAll(); // Notify the teacher to write the next message
        } else {
            wait(); // Wait until the current message is fully read by all students
        }
    }
    synchronized public void finishWriting() {
        finished = true;  // Set the flag to true to indicate that writing is finished
        notifyAll();  // Notify all waiting threads
    }
}
