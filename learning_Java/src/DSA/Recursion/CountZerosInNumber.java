package DSA.Recursion;

public class CountZerosInNumber {
    public static void main(String[] args) {
        int number = 0;
        int zeroCount = 0;
        int count = countZero(number, zeroCount);
        System.out.println(count);
    }

    private static int countZero(int number, int zeroCount) {
        if (number == 0) {
            return zeroCount;
        }
        if (number%10 == 0) {
            zeroCount++;
        }
        return countZero(number/10, zeroCount);
    }
}
