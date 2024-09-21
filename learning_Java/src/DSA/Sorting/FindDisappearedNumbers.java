package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1397355827/
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingNum = findDisappearedNumbers(arr);
        System.out.println("missing number is: "+ missingNum);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            if (nums[i] != i+1) {
                result.add(i+1);
            }
        }
        return result;
    }

    private static void cyclicSort(int[] nums) {
        int i=0;
        while (i< nums.length) {
            int correctPos = nums[i]-1;
            if (nums[i] != nums[correctPos]) {
                Swap.swap(nums, i,correctPos);
            } else {
                i++;
            }
        }
    }
}
