package MathsForDsa;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(isOdd(num));
    }
    private static boolean isOdd(int n) {
        /*
        the & operator does an AND operation on the given numbers. And we know that any number AND 1 will be the same
        number in binary (base2) format.
        ie: 13 in binary is 1101 further &1 to this will be
        1101
      + 0001
      = 0001 --> so we check if the solution is 1 then teh given number is odd, else it is even.
      */
        return ((n & 1) == 1);
    }
}
