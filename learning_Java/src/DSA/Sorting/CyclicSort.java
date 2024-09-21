package DSA.Sorting;

public class CyclicSort {
    public static void cyclicSort(int[] arr) {
        int i=0;
        while (i< arr.length) {
            int correctPos = arr[i];
            if ((correctPos != arr.length) && (arr[i] != arr[correctPos])) {
                Swap.swap(arr, i, correctPos);
            } else {
                i++;
            }
        }
    }

    //Find missing number in the array of range 0-n

    public static void main(String[] args) {
        int[] arr = {0,1};
        int missingNum = findMissingNumber(arr);
        System.out.println("missing number is: "+missingNum);
    }
//https://leetcode.com/problems/missing-number/description/
    private static int findMissingNumber(int[] arr) {
        cyclicSort(arr);
        for (int i=0;i< arr.length;i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

}
