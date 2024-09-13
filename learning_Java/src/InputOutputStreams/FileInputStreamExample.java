package InputOutputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamExample {
    FileInputStream fis;
    String receivedMsg;
    public String readFromFile () {
        try {
            fis = new FileInputStream("C:/Users/hytej/Desktop/Learning/learning_Java/src/InputOutputStreams/test1.txt");
            System.out.print("fis.available() : "+fis.available()); // gives the selected file's character length.
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.print("bis.markSupported();: "+bis.markSupported());
            if (bis.markSupported()) {
                bis.mark(fis.available());
            }
            byte []b = new byte[bis.available()];
            receivedMsg = String.valueOf(bis.read(b));
            /*receivedMsg = new String(b);*/
            int x;
            System.out.print("2nd fis.available() : "+fis.available());
            bis.reset();
            System.out.print("2nd bis.available() : "+bis.available());
            while ((x=bis.read())!= -1) {
                System.out.print((char)x);
            }
            System.out.print("after the read while ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return receivedMsg;
    }
}
