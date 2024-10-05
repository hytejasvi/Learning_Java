package DSA.Recursion;

public class PowerOfaNumber {
    public static void main(String[] args) {
        int x=2, n=5;
        int result = powerOfNumber(x,n);
        System.out.println(result);
    }

    private static int powerOfNumber(int x, int n) {
        if (n==0) {
            return 1;
        }
        return x*powerOfNumber(x,n-1);
    }
}
