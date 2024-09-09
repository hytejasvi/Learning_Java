package DSA.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []nums = {2,2};
        int target = 2;
        int []ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};
        if (nums.length == 0) {
            return ans;
        }
        ans[0] = getPos(nums, target,true);
        ans[1] = getPos(nums, target,false);
        return ans;
    }

    private static int getPos(int[] nums, int target, boolean isStartPos) {
        int ans = -1;
        int start =0,end = nums.length-1;
        while (start <=end) {
            int mid = start + (end-start)/2;
            if (target > nums[mid]) {
                start = mid+1;
            } else if (target < nums[mid]) {
                end = mid-1;
            } else if (target == nums[mid]) {
                ans = mid;
                if (isStartPos) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
