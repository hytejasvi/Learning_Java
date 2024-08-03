package Arrays;

public class CopyAnArray {
    public static void main (String []args) {
        int[] A = {3, 9, 7, 8, 12, 16, 15, 5, 4, 10};
        int[] B = new int[10];

        System.out.println("Printing the array A");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+",");
        }
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        System.out.println("Printing the array B");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i]+",");
        }
    }
}
