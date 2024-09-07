package DSA.LinearSearch;

public class MinimumElement {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,1};
        int minimum = findMinimum(nums);
        System.out.println("Minimum Element is: "+minimum);
    }

    private static int findMinimum(int[] nums) {
        if (nums.length<=0) {
            return -1;
        }
        int minimum = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i] < minimum) {
                minimum = nums[i];
            }
        }
        return minimum;
    }
}
