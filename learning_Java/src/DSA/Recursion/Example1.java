package DSA.Recursion;

public class Example1 {
    public static void main(String[] args) {
        int n=6;
        //printHello(n);
        //printHello2(n); //debug this to understand how methods are in stack and how recursion works
        int fibNumber = findFibNumber(n);
        System.out.println("fibNumber: "+fibNumber);
    }

    private static void printHello2(int n) {
        System.out.println(n);
        printHello3(n-1);
    }
    private static void printHello3(int n) {
        System.out.println(n);
        printHello4(n-1);
    }
    private static void printHello4(int n) {
        System.out.println(n);
        printHello5(n-1);
    }
    private static void printHello5(int n) {
        System.out.println("Hello: "+n);
    }

    private static int findFibNumber(int n) {
        if (n<2) {
            return n;
        }
        return (findFibNumber(n-1) + findFibNumber(n-2));
    }

    private static void printHello(int n) {
        if (n<1) {
            return;
        }
        System.out.println("Hello: "+n);
        printHello(n-1);
    }

}
