package FileHandling;

import java.io.*;

public class StoringFloatIntoFile {
    public static void main(String[] args) throws IOException {
        float []list = {10.5f, 2.9f, 6.4f, 0.8f, 3.7f};
        String path = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling/data.txt";
        writeValuesToFile(path, list);
        readValues(path);
    }

    private static void readValues(String path) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))) {
            int length = dis.readInt();
            int i=0;
            while (i<length) {
                System.out.println(dis.readFloat());
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeValuesToFile(String path, float []list) {
        try (FileOutputStream fos = new FileOutputStream(path); DataOutputStream dos = new DataOutputStream(fos)) {
            int i=0;
            dos.writeInt(list.length);
            for (float value: list) {
                dos.writeFloat(value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
