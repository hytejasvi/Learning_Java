package DSA.Recursion;

public class SumOfNnumbers {
    public static void main(String[] args) {
        int n =6;
        int sum = sumOfNnumbers(n);
        System.out.println(sum);
    }

    private static int sumOfNnumbers(int n) {
        if (n<2) {
            return n;
        }
        System.out.println("currently dealing with : "+n);
        return n+sumOfNnumbers(n-1);
    }
}
