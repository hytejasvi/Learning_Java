package DSA.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 7;
        int fibNum = fib(n);
        System.out.println(fibNum);
    }

    private static int fib(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return (fib(n-1)+fib(n-2));
    }
}
