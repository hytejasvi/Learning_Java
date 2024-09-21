package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1};
        FindAllDuplicatesSolution f = new FindAllDuplicatesSolution();
        List<Integer> result = f.findDuplicates(nums);
        System.out.println(result);
    }
}
class FindAllDuplicatesSolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        sortArray(nums);
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != i+1) {
                result.add(nums[i]);
            }
        }
        int []arr = new int[result.size()];
        int i=0;
        for (int x: result) {
            arr[i] = x;
            i++;
        }
        return result;
    }

    //put all the elements into their correct positions.
    private void sortArray(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correctPosition = nums[i]-1;
            if (nums[i] != nums[correctPosition]) {
                swap(nums, i, correctPosition);
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
