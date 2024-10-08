package DSA.Sorting;

import java.util.Arrays;

/*You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number
in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.*/
//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        SetMismatchSolution sm = new SetMismatchSolution();
        int []result = sm.findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
class SetMismatchSolution {
    public int[] findErrorNums(int[] nums) {
        int [] result = new int[2];
        int j=0;
        cyclicSort(nums);
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != i+1) {
                result[j++] = nums[i];
                result[j++] =  i+1;
            }
        }
        return result;
    }
    public void cyclicSort(int[] nums) {
        int i=0;
        while (i< nums.length) {
            int correcPos = nums[i]-1;
            if (nums[i] != nums[correcPos]) {
                int temp = nums[i];
                nums[i] = nums[correcPos];
                nums[correcPos] = temp;
            } else {
                i++;
            }
        }
    }
}
