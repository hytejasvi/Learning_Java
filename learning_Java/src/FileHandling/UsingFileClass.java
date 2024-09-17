package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import static java.util.Collections.list;

public class UsingFileClass {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/hytej/Desktop/Learning/learning_Java/src/FileHandling"; //path till the current directory
        File f = new File(path);
        FileInputStream fis = null;
        System.out.println("fis: "+fis);
        System.out.println("f.isDirectory() : "+f.isDirectory());
        System.out.println("f.canWrite(): "+f.canWrite());
        System.out.println("f.canRead(): "+f.canRead());
        System.out.println("f.canExecute(): "+f.canExecute());

        //String []list = f.list(); //get's the list of all the files and folders.
        File[] list = f.listFiles(); //returns array of files.
        for (File l : list) {
            System.out.print(l.getName()+" ");
            System.out.print(l.getPath());
        }
    }
}
