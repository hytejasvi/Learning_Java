package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingWithBinaryData {
    public static void main(String[] args) {
        byte[] byteArray = {65,66,67,68,69,70};
        byte[] byteArray2 = {'x','y','z'};
        String filePath = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/StreamFile1.txt";
        writeToFileUsingOutputStream(filePath, byteArray, byteArray2);
        readFromFileUsinginputStream(filePath);
    }

    private static void readFromFileUsinginputStream(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte [] ch;
            ch = fis.readAllBytes();

            int i=0;
            while (i<ch.length) {
                System.out.println((char) ch[i]);
                i++;
            }
            /*int data;
            while ((data = fis.read())!= -1) {
                System.out.println((char) data); //2nd way of printing the read data from file
            }*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToFileUsingOutputStream(String filePath, byte[] byteArray, byte[] byteArray2) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(byteArray);
            fos.write(byteArray2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void appendToFileUsingOutputStream(String filePath, byte[] byteArray, byte[] byteArray2) {
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            fos.write(byteArray);
            fos.write(byteArray2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
