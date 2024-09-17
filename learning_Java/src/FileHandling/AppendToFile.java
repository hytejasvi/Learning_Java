package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/myfile.txt";
        String appendMsg = "This is an appended message";
        String appendMsg2 = "This is the 2nd appended message";
        appendToFileUsingFileReader(filePath, appendMsg);
        appendToFileUsingBufferReader(filePath, appendMsg2);
    }

    private static void appendToFileUsingBufferReader(String filePath, String appendMsg2) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath, true))) {
            br.newLine(); //adds newline to the file.
            br.write(appendMsg2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendToFileUsingFileReader(String filePath, String appendMsg) {
        try (FileWriter fr = new FileWriter(filePath, true)) {
           /*char []ch =appendMsg.toCharArray();
           fr.write(ch);
            convert the string mesage into a character array and then write/append that char array */
            /*fr.write(appendMsg,10,10);
            the message to be written, the starting index and the number of chars to be written*/
            fr.write(appendMsg);
            System.out.println("fr.getEncoding(): "+fr.getEncoding());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
