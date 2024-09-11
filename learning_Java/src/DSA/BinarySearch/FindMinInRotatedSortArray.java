package DSA.BinarySearch;

public class FindMinInRotatedSortArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,0,1,2,3,};
        findMinInRotatedSortArraySolution solution = new findMinInRotatedSortArraySolution();
        int minimumEle = solution.findMin(nums);
        System.out.println(minimumEle);
    }
}
class findMinInRotatedSortArraySolution {
    public int findMin(int[] nums) {
        int start =0,end = nums.length-1;
        while (start < end) {
            if (nums[start] < nums[end]) {
                return nums[start];
            }
            int mid = start + (end-start)/2;
            if (nums[mid] > nums[end]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
