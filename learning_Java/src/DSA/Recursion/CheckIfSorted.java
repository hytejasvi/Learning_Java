package DSA.Recursion;

public class CheckIfSorted {
    public static void main(String[] args) {
        int []arr = {1,2,1,3,4,6,5};
        boolean isSorted = checkIfSorted(arr, 0);
        System.out.println(isSorted);
    }

    private static boolean checkIfSorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }
        return (arr[index] < arr[index+1] && checkIfSorted(arr, index+1));
    }
}
