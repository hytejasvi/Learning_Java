package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        String filePath = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/myfile.txt";
        fileReaderExample(filePath);
        bufferReaderExample(filePath);
        bufferReaderApiExample(filePath);
    }

    private static void bufferReaderApiExample(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            BufferedReader br = new BufferedReader(fr);
            String lineReader;
            int lineCount = 0;
            while ((lineReader = br.readLine()) != null) {
                System.out.println(lineReader);
                lineCount++;
            }
            System.out.println("Finished reading using linereader");
            System.out.println("Total numbers of lines read from file: "+lineCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferReaderExample(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            int data;
            BufferedReader br = new BufferedReader(fr);
            while ((data = br.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileReaderExample(String filePath) {
        try (FileReader fr = new FileReader(filePath)) {
            int data;
            while((data = fr.read()) != -1) { //approach 1
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
