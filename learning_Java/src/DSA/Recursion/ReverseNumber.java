package DSA.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 121;
        int rev = reverseNumber(n);
        System.out.println("reversed number: "+rev);
        System.out.println(n==reverseNumber(n));
    }

    private static int reverseNumber(int n) {
        int digits = (int) Math.log10(n)+1; // formula to get the number of digits present in an int
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int reminder = n%10;
        return (reminder*(int) Math.pow(10,digits-1) + helper(n/10, digits-1));
    }
}
