package DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=8;
        int factorial = fact(n);
        System.out.println(factorial);
    }

    private static int fact(int n) {
        if (n<2) {
            return n;
        }
        return n * fact(n-1);
    }
}
