package DSA.Sorting;

public class InsertionSort {
    /*
    start i as 0 and this is to keep a check for the length of array
    take j as i+1, so that we can always compare j with a previous element (j-1)
    if the comparison is true (if arr[j] < arr[j-1]) then swap and continue the inner loop.
     */
    public static void insertionSort(int[] arr) {
        for (int i=0; i<=arr.length-2;i++) {
            for (int j=i+1;j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    Swap.swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
