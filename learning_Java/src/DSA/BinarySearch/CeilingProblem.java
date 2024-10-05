package DSA.BinarySearch;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        //int[] arr = {2, 3};
        int target = 15;
        int k = searchInsert(arr,target);
        System.out.println("K: "+k);
    }

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {
                return mid+1;
            } else if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return start+1;
    }
}

/*
Leetcode solution:
 public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        int start = 0, end = nums.length-1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end-start)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid+1;
            }
        }
        return start;
    }
 */
