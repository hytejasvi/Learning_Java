package DSA.LinearSearch;
/*
Given an array nums of integers, return how many of them contain an even number of digits.

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEven(int num) {
        int count=0;
        while (num>0) {
            num = num/10;
            count++;
        }
        return count % 2 == 0;
    }

}
