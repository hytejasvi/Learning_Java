package DSA.Recursion;

public class EasyProblems {
    public static void main(String[] args) {
        int n =  5;
        printInOrder(n);
        System.out.println("now printing in reverse order");
        printInReverse(n);
    }

    private static void printInReverse(int n) {
        if (n<1) {
            return;
        }
        System.out.println("n is: "+n);
        printInReverse(n-1);
    }

    private static void printInOrder(int n) {
        if (n<1) {
            return;
        }
        printInOrder(n-1);
        System.out.println("n is: "+n);
    }
}
