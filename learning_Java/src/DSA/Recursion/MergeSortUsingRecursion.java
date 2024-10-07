package DSA.Recursion;

import java.util.Arrays;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2};
        int []arr2 = mergeSOrt(arr);
        System.out.println(Arrays.toString(arr2));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end-start == 1) {
            return;
        }
        int mid = (start+end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l=0;l < mix.length;l++) {
            arr[start+l] = mix[l];
        }
    }

    private static int[] mergeSOrt(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int []leftArr = mergeSOrt(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSOrt(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeArrays(leftArr, rightArr);
    }

    private static int[] mergeArrays(int[] leftArr, int[] rightArr) {
        int[] resultArray = new int[leftArr.length+ rightArr.length];
        int i=0,j=0,k=0;
        while(i< leftArr.length && j< rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                resultArray[k]=leftArr[i];
                i++;
            } else {
                resultArray[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            resultArray[k]=leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            resultArray[k]=rightArr[j];
            j++;
            k++;
        }
        return resultArray;
    }


}
