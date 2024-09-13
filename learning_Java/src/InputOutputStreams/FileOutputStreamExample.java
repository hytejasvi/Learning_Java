package InputOutputStreams;

import java.io.*;

public class FileOutputStreamExample {
    FileOutputStream fos;
    String testString ;

    FileOutputStreamExample(String msg) {
        testString = msg;
    }
    public void writeMessage() {
        try (FileOutputStream fos = new FileOutputStream("C:/Users/hytej/Desktop/Learning/learning_Java/src/InputOutputStreams/test1.txt"))
        {//try with resources as this will auto handle the closing of resources
            //fos = new FileOutputStream("C:/Users/hytej/Desktop/Learning/learning_Java/src/InputOutputStreams/test1.txt");
            fos.write(testString.getBytes()); //writing the whole message or string to the file.
            fos.write("Finished Writing using getBytes() \n".getBytes());
            //char[] sample = new char[testString.length()];
            for (int i=0;i<testString.length()-7;i++) {
                fos.write(testString.charAt(i)); //writing 1 byte or character at a time. this way we can limit
                // the message till a particular length
            }
            fos.write("Finished Writing using int b \n".getBytes());
            fos.write(testString.getBytes(), 8, testString.length()-8);
            fos.write("Finished Writing using byte b[], int off, int len \n".getBytes());
            //this help with writing a certain part of message . in the above example, we take the complete message
            //then we specify the starting point : offset (included in teh output), and then untill the end of message.

            FileDescriptor fd = fos.getFD();
            boolean valid = fd.valid();
            System.out.println("valid: "+valid);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
