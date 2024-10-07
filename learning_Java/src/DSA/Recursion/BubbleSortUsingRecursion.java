package DSA.Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSortUsingRecursion(arr, arr.length-1,1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortUsingRecursion(int[] arr, int lastIndex, int startIndex, int maxElement) {
        if (startIndex > lastIndex) {
            lastIndex= lastIndex-1;
            startIndex=1;
            maxElement=0;
        }
        if (lastIndex<0) {
            return;
        }
        if (arr[maxElement] > arr[startIndex]) {
            swap(arr, maxElement, startIndex);
            bubbleSortUsingRecursion(arr, lastIndex, startIndex+1, maxElement+1);
        }
        else {
            bubbleSortUsingRecursion(arr, lastIndex, startIndex+1, maxElement+1);
        }
    }
    static void swap (int []arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
