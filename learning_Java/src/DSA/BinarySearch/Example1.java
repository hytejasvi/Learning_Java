package DSA.BinarySearch;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key1 = 7;
        int k = searchElement(arr, key1);
        if (k==-1) {
            System.out.println("Element is not present in the given array");
        } else {
            System.out.println("Element "+key1+" is present at: "+k+" Position");
        }
        int[] arr2 = {10,8,6,5,4,3,-1,-2};
        int key2 = 10;
        int k2 = searchElement(arr2, key2);
        if (k2 == -1) {
            System.out.println("Element is not present in the given array");
        } else {
            System.out.println("Element "+key2+" is present at: "+k2+" Position");
        }
    }

    private static int searchElement(int[] arr, int key) {
        if(arr.length ==0) {
            return -1;
        }
        boolean isAscending = false;
        if (arr[0] < arr[arr.length-1]) {
            isAscending = true;
        }
        int start = 0;
        int end = arr.length-1;
        System.out.println(Arrays.toString(arr));

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (isAscending) {
                if (key < arr[mid]) {
                    end = mid-1;
                } else if (key > arr[mid]) {
                    start = mid+1;
                }
            } else {
                if (key > arr[mid]) {
                    end = mid-1;
                } else if (key < arr[mid]) {
                    start = mid+1;
                }
            }
            if (key == arr[mid]) {
                return mid+1;
            }
        }
        return -1;
    }
}
