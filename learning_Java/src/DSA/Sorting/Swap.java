package DSA.Sorting;

public class Swap {
    static void swap (int []arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
