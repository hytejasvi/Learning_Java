package DSA;

import java.util.Arrays;

public class SortingTechniques {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 1, 2, 3};
        BubbleSortExample.bubbleSort(arr1);
        System.out.println("bubbleSort: "+Arrays.toString(arr1));

        int[] arr2 = {5, 4, 1, 2, 3};
        SelectionSort.selectionSort(arr2);
        System.out.println("selectionSort: "+Arrays.toString(arr2));

        int[] arr3 = {5, 4, 1, 2, 3};
        InsertionSort.insertionSort(arr3);
        System.out.println("insertionSort: "+Arrays.toString(arr3));
    }
}

class BubbleSortExample {
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

class SelectionSort {
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

class InsertionSort {
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






class Swap {
    static void swap (int []arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}