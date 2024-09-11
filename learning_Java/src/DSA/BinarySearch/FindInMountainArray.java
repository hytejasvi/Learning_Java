package DSA.BinarySearch;
/*
https://leetcode.com/problems/find-in-mountain-array/
 */
interface MountainArray {
      public int get(int index);

    public int length();
}
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr.length(), mountainArr);
        int ans = getPos(mountainArr, target, 0, peak, true);  // Ascending search
        if (ans == -1) {
            ans = getPos(mountainArr, target, peak + 1, mountainArr.length() - 1, false);  // Descending search
        }
        return ans;
    }
    private int getPos(MountainArray mountainArr, int target, int start, int end, boolean ascending) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int currentMid = mountainArr.get(mid);
            if (target == currentMid) {
                return mid;
            }
            if (ascending) {  // Ascending part
                if (target > currentMid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {  // Descending part
                if (target < currentMid) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

    public int peakIndexInMountainArray(int length, MountainArray mountainArr) {
        int start = 0, end = length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int midElement = mountainArr.get(mid);
            if (mid > 0 && mid < length - 1) {  // Check boundaries
                if (midElement > mountainArr.get(mid - 1) && midElement > mountainArr.get(mid + 1)) {
                    return mid;  // Peak found
                } else if (midElement < mountainArr.get(mid + 1)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {  // In case we are at the first or last index
                break;
            }
        }
        return start;  // Return the peak index
    }
}

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,5,3,1};
        int target = 3;
        // Create an instance of MountainArrayImpl
        MountainArray mountainArray = new MountainArrayImpl(arr);

        // Call the findInMountainArray method with target and mountainArray
        Solution s = new Solution();
        int result = s.findInMountainArray(target, mountainArray);

        // Print the result
        System.out.println("Index of target: " + result);
    }
}
class MountainArrayImpl implements MountainArray {
    private int[] arr;

    // Constructor to initialize the array
    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    // Implement get method
    public int get(int index) {
        return arr[index];
    }

    // Implement length method
    public int length() {
        return arr.length;
    }
}
