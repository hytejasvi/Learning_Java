package DSA;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,32,18,14,33,37,38,16,5,27,30,4,21,29,11,24,17,6,23,31,8,39,28,10,34,20,35,9,13,7,26,1,22,40,15,25,36,3,12};
        int n = 40;
        int result = missingNumber(arr, n);
        System.out.println(result);
    }

    private static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;
        for (int x: arr) {
            actualSum += x;
        }
        return expectedSum-actualSum;
    }
}
