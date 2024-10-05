package DSA.Recursion;

public class Gcd {
    public static void main(String[] args) {
        int b=180,a=31;
        int gcd = computeGcd(a,b);
        System.out.println(gcd);
    }

    private static int computeGcd(int a, int b) {
        // Base case: when one number becomes 0, return the other number
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD(a, b) = GCD(b, a % b)
        return computeGcd(b, a % b);
    }
}
