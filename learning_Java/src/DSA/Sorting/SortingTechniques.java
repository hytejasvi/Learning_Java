package DSA.Sorting;

import java.util.Arrays;

public class SortingTechniques {
    public static void main(String[] args) {
        /*int[] arr1 = {5, 4, 1, 2, 3};
        BubbleSortExample.bubbleSort(arr1);
        System.out.println("bubbleSort: "+Arrays.toString(arr1));

        int[] arr2 = {5, 4, 1, 2, 3};
        SelectionSort.selectionSort(arr2);
        System.out.println("selectionSort: "+Arrays.toString(arr2));*/

        int[] arr3 = {5, 4, 1, 2, 3};
        InsertionSort.insertionSort(arr3);
        System.out.println("insertionSort: "+Arrays.toString(arr3));

       int[] arr4 = {4,0,2,1};
        CyclicSort.cyclicSort(arr4);
        System.out.println("cyclicSort: "+Arrays.toString(arr4));
    }
}