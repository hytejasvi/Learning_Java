package DSA.BinarySearch;

public class FloorNumberProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        //int[] arr = {2, 3};
        int target = 4;
        int k = getFloorNumber(arr,target);
        System.out.println("K: "+k);
    }

    private static int getFloorNumber(int[] arr, int target) {
        int start=0, end = arr.length-1;
        while (start <= end) {
            int mid = start+ (end-start)/2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
        }
        return arr[end];
    }
}
