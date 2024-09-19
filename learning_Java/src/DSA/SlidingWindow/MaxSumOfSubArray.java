package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {2, 3, 4, 1, 5};
        int maxSum = maxSumOfSubArray(arr, k);
        System.out.println("maxSum: "+maxSum);
    }

    private static int maxSumOfSubArray(int[] arr, int k) {
        int maxSum=0;
        int start = 0;
        int windowSum=0;
        List<Integer> al = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            while (al.size() == k) {
                windowSum = windowSum- al.get(0);
                al.remove(0);
                start++;
            }
            al.add(arr[i]);
            windowSum = windowSum+arr[i];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    private static int maxSumOfSubArray2(int[] arr, int k) {//gpt approach
        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window from left to right
        for (int i = k; i < arr.length; i++) {
            // Slide the window by subtracting the element going out and adding the new element
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
