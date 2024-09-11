package DSA.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int []nums = {2,3,4,5,1};
        int target = 1;
        RotatedArraySearchSolution s = new RotatedArraySearchSolution();
        int index = s.search(nums, target);
        System.out.println(index);
    }
}
class RotatedArraySearchSolution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0]==target ? 0:-1;
        }
        int pivot = findPivot(nums);
        if (pivot == 0) {
            pivot = nums.length-1;
        } else {
            pivot--;
        }
        System.out.println("pivot index: "+pivot);
        int pos = searchElement(nums, 0, pivot, target);
        if (pos == -1) {
            pos = searchElement(nums, pivot+1, nums.length-1, target);
        }
        return pos;
    }
    public int findPivot(int[] nums) {
        int start=0,end = nums.length-1;
        while (start < end) {
            if (nums[start] < nums[end]) {
                return start;
            }
            int mid = start+(end-start)/2;
            if (nums[mid] > nums[end]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    public int searchElement(int[] nums, int start, int end, int target) {
        int ans=-1, mid=0;
        while (start <= end) {
            mid = start+ (end-start)/2;
            if (nums[mid] == target) {
                ans = mid;
                return ans;
            } else if (nums[mid] < target) {
                start = mid+1;
            } else if (nums[mid] > target) {
                end = mid-1;
            }
        }
        return ans;
    }
}
