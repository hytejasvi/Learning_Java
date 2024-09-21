package DSA.Sorting;

import java.util.Arrays;

/*
In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in
 an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing
the two numbers (in any order), so peace can return to Digitville.
 */
//https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/
public class FindSneakyNumbers {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        int[] result = s.getSneakyNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []arr = new int[2];
        sortArray(nums);
        int j=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != i) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }

    //put all the elements into their correct positions.
    private void sortArray(int[] nums) {
        int i=0;
        while (i<nums.length) {
            //int correctPosition = nums[i];
            if (nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int correctPosition) {
        int temp = nums[i];
        nums[i] = nums[correctPosition];
        nums[correctPosition] = temp;
    }
}
