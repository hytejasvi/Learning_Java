package DSA.Sorting;

public class SelectionSort {
    /*
    this first gets the max value in the array and then swaps it to the last position
    in each step we get the max from array and after each iteration, as the max is placed at the end of array,
    we reduce the array length by 1 value to consider for max.
     */
    public static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int maxElementIndex = maxElement(arr, i);
            Swap.swap(arr, maxElementIndex, arr.length-i-1);
        }
    }

    private static int maxElement(int[] arr, int j) {
        int maxElement=0;
        for (int i=1;i<=arr.length-j-1;i++) {
            if (arr[i] > arr[maxElement]) {
                maxElement = i;
            }
        }
        return maxElement;
    }
}
