package DSA.Sorting;

public class BubbleSortExample {
    /*
    time complexity: O(n^2)
    compares each element to it's adjacent element and swaps as per condition
    in the first iteration, it successfully places the largest element in teh end
    and then continues till n-1 iterations.
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    Swap.swap(arr, j, j-1);
                }
            }
        }
    }
}
