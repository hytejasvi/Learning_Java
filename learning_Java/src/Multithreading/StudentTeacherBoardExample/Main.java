package Multithreading.StudentTeacherBoardExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WhiteBoard wb = new WhiteBoard();
        Teacher teacher1 = new Teacher(wb, true);
        Teacher teacher2 = new Teacher(wb, false);

        for (int i = 1; i < 6; i++) {
            Student student = new Student(wb);
            student.setName("Student:" + i);  // Set a unique name for each student thread
            student.start();  // Start the student thread
        }

        teacher1.setName("Teacher1");
        teacher2.setName("Teacher2");
        teacher1.start();  // Start the teacher thread
        teacher2.start();
    }
}
