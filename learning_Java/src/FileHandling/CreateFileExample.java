package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        File file =  new File("C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/myfile.txt");
        try {
            String path1 = "C:/Users/hytej/Desktop/Learning/learning_Java/src/InputOutputStreams/test1.txt";
            System.out.println("file.getPath(): "+file.getPath());
            System.out.println(file.compareTo(new File(path1)));
            System.out.println("file.getAbsoluteFile();: "+file.getAbsoluteFile());//gives the absolute path of the file
            System.out.println("file.canExecute(): "+file.canExecute()); //returns true if we have permission to execute
            System.out.println("file.canRead(): "+file.canRead()); //returns true if we have permission to read
            System.out.println("file.canWrite(): "+file.canWrite()); //returns true if we have permission to write
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
