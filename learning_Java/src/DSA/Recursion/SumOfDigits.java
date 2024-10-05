package DSA.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 120;
        int sum  = sumOfDigits(n);
        System.out.println("sum of digits :"+sum);
        //int product  = productOfDigits(n);
        //System.out.println("product of digits :"+product);
    }

    private static int productOfDigits(int n) {
        if (n<2) {
            return n;
        }
        return (n%10 * productOfDigits(n/10));
    }

    private static int sumOfDigits(int n) {
        if (n==0) {
            return n;
        }
        return (n%10 + sumOfDigits(n/10));
    }
}
