package FileHandling.Exercise1;

import java.io.*;

public class CopyFileContents {
    public static void main(String[] args) {
        String sourcePath = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/Exercise1/source1.txt";
        String sourcePath2 = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/Exercise1/source2.txt";
        String message = "JAVA \nTEST FILE";
        CopyContents cp = new CopyContents(sourcePath, sourcePath2, message);
        cp.copyFromSrcToDest();
    }
}
class CopyContents {
    String message;
    String sourcePath;
    String sourcePath2;

    public CopyContents(String sourcePath, String sourcePath2, String message) {
        this.sourcePath = sourcePath;
        this.sourcePath2 = sourcePath2;
        this.message = message;
    }
    public void copyFromSrcToDest() {
        if (createFile()) {
            copyMessageToDest();
        }
        System.out.println("Created source and copied message to destination file");
    }

    private void copyMessageToDest() {
        try (FileReader fr = new FileReader(sourcePath); FileWriter fw = new FileWriter(sourcePath2)) {
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String lines;
            while ((lines = br.readLine()) != null) {
                System.out.println("lines: "+lines);
                //fw.write(lines.toLowerCase()); // this is writing the lines in a single line
                bw.write(lines.toLowerCase());
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean createFile () {
        try (FileWriter fw = new FileWriter(sourcePath)) {
            fw.write(message);
            System.out.println("Message written to source successfulle");
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
