package ExceptionHandling;
import java.io.*;
/*
The following pgm will compile as the exception will not be caught during compilation, but this
will throw an exception during the run time.
Exception in thread "main" java.lang.ArithmeticException: / by zero
 */
public class CheckedUnchecked {
    static void fun1() {
        try {
            System.out.println((10 / 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());//gives the exception message
            System.out.println(e);//gives the exception name also
            e.printStackTrace();//prints the stacktrace for easy debugging.
        }
        System.out.println("Inside fun1, after operation");
    }
    static void fun2() {
        fun1();
        System.out.println("Inside fun2, after method call for checked exception");
    }
    static void fun3() {
        fun2();
        System.out.println("Inside fun3, after method call");
    }
    public static void main(String[] args) throws Exception {
        fun3();
        System.out.println("inside main after method call");
        fun4();//as this method has throws in it's method signature, the method in which this is present will also
        // have the throws in the method signature.
    }

    private static void fun4() throws Exception{
        FileInputStream fi = new FileInputStream("MyName.txt");// adding this statement will lead to checked exception
        //i.e, the compiler will show error as the file name/path can be non existent, hence we need to handle this
        // and this can be handled using try-catch block or add throws into method signature
    }
}
