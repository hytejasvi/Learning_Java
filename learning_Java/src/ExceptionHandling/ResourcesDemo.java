package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ResourcesDemo {
    /*static FileInputStream fi;
    static Scanner sc;
    static void divide() throws IOException {
        fi = new FileInputStream("\\Users\\hytej\\Desktop\\Test.txt");
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/c);
        fi.close();
        sc.close();
    }*/
    //try with resources.
    static void tryWithResource () throws Exception {
        try(FileInputStream fi = new FileInputStream("\\Users\\hytej\\Desktop\\Test.txt");
            Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main (String []main) throws Exception {
        try {
            tryWithResource();
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
