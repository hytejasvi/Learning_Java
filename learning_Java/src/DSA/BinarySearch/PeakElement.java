package DSA.BinarySearch;
//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/ --> similar implementation as below .
public class PeakElement {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,3,1};
        int peak = findPeakElement(nums);
        System.out.println(peak);
    }
    public static int findPeakElement(int[] nums) {
        /*if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length-1] > nums[nums.length-2]) {
            return nums.length-1;
        }*/
        int start =0, end = nums.length-1, ans=0, mid=0;
        while (start <=end) {
            mid = start+(end-start)/2;
            if (nums[mid] > nums[mid-1]) {
                if (nums[mid] > nums[mid+1]) {
                    ans = mid;
                    start = mid+1;
                } else {
                    start = mid+1;
                }
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
}
