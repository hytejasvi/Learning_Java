package DSA.Recursion;

public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 1;
        boolean isFound = searchForElement(arr, key, 0, arr.length-1);
        System.out.println("is key present in array: "+isFound);
    }

    private static boolean searchForElement(int[] arr, int key, int start, int end) {
        if (start > end) {
            return false;
        }
        int mid = start + (end-start)/2;
        if (arr[mid]==key) {
            return true;
        }
        if ((arr[start] < arr[mid]) && (key >= arr[start] && key < arr[mid])) {
            return searchForElement(arr, key, start, mid);
        } else {
            return searchForElement(arr, key, mid+1, end);
        }
    }
}
