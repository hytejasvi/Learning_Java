package FileHandling.Exercise1;

import java.io.*;

public class AppendFromMultipleFiles {
    public static void main(String[] args) {
        String srcFile1 = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/Exercise1/source1.txt";
        String srcFile2 = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/Exercise1/source2.txt";;
        String destFile = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/Exercise1/destination.txt";
        AppendFromFiles append = new AppendFromFiles(srcFile1, srcFile2, destFile);
        append.append();
        append.appendUsingSequenceStream();
    }
}

class AppendFromFiles {
    String srcFile1;
    String srcFile2;
    String destFile;

    public AppendFromFiles(String srcFile1, String srcFile2, String destFile) {
        this.srcFile1 = srcFile1;
        this.srcFile2 = srcFile2;
        this.destFile = destFile;
    }

/*
Use BufferedReader and BufferedWriter when:
You are working with text files.
You need to preserve formatting, such as line breaks.
You might need to process or transform data as you read it (e.g., converting to lowercase, filtering, etc.).
Flexibility in handling content (e.g., modifying lines before appending).
*/
    public void append() {
        try (FileReader fr1 = new FileReader(srcFile1); FileReader fr2 = new FileReader(srcFile2);
             FileWriter fw = new FileWriter(destFile,true)) {
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            BufferedWriter bw = new BufferedWriter(fw);
            String message;
            while ((message=br1.readLine()) != null) {
                bw.write(message);
                bw.newLine();
            }
            while ((message=br2.readLine()) != null) {
                bw.write(message);
                bw.newLine();
            }
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

/*
Use SequenceInputStream when:
You are working with binary data (e.g., images, audio files, video files, or binary logs).
You need to concatenate two streams without processing the content.
Performance and simplicity in concatenating two streams of data is your priority, especially for binary files.
*/
    public void appendUsingSequenceStream() {
        try (FileInputStream fis1 = new FileInputStream(srcFile1);
             FileInputStream fis2 = new FileInputStream(srcFile2);
             FileOutputStream fos = new FileOutputStream(destFile, true);
             SequenceInputStream sq = new SequenceInputStream(fis1, fis2)){
            int x;
            while ((x= sq.read())!=-1) {
                fos.write((char)x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

