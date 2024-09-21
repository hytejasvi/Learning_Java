package DSA.Sorting;
//https://leetcode.com/problems/first-missing-positive/
/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        FirstMissingPositiveSolution f = new FirstMissingPositiveSolution();
        int result = f.firstMissingPositive(nums);
        System.out.println(result);
    }
}
class FirstMissingPositiveSolution {
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        int length = nums.length;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums[length-1]+1;
    }
    public void cyclicSort(int[] nums) {
        int i=0;
        while (i < nums.length) {
            int correctPos = nums[i]-1;
            if ( (correctPos >=0 && correctPos < nums.length) && nums[i] != nums[correctPos]) {
                int temp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = temp;
            } else {
                i++;
            }
        }
    }
}
