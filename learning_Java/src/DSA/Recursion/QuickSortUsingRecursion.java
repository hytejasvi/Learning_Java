package DSA.Recursion;

import java.util.Arrays;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1,2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        // Recursively sort the two halves
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2]; // Choose the middle element as the pivot
        int start = low;
        int end = high;

        while (start <= end) {
            // Move start pointer to the right as long as arr[start] < pivot
            while (arr[start] < pivot) {
                start++;
            }
            // Move end pointer to the left as long as arr[end] > pivot
            while (arr[end] > pivot) {
                end--;
            }
            // Swap elements if start is less than or equal to end
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;  // Return the index of the next pivot point
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
