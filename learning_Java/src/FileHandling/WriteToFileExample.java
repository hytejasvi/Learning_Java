package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/myfile.txt")){
            fw.write("This is a test file.\nLearning Java File Handling.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
