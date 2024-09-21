package DSA.BinarySearch;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int []nums = {2,2,2,3,2,2,2};
        int target = 3;
        RotatedSortedArrayWithDuplicatesSolution search = new RotatedSortedArrayWithDuplicatesSolution();
        boolean result = search.search(nums, target);
        System.out.println("Target present in given Array: "+result);
    }
}
class RotatedSortedArrayWithDuplicatesSolution {
    boolean search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target;
        }
        int pivot = getPivot(nums);
        System.out.println("pivot: "+pivot);
        if (pivot == 0) {
            pivot = nums.length - 1;
        } else {
            pivot--;
        }
        int i = searchTarget(nums, 0, pivot, target);
        if (i == -1) {
            i = searchTarget(nums, pivot + 1, nums.length - 1, target);
        }
        if (i == -1) {
            return false;
        } else {
            return true;
        }
    }

    public int getPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[end]) {
                return start;
            }
            int mid = start + (end - start) / 2;
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int searchTarget(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
