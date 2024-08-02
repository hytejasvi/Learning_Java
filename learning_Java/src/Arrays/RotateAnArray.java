package Arrays;

public class RotateAnArray {
    public static void main (String []args) {
        int[] A = {3,9,7,8,12,16,15,5,4,10};
        int[] B = new int[10];
        int[] C = new int[10];
        int temp1 = A[0];
        int temp2 = A[A.length - 1];
        System.out.print("Left rotation of the array ");
        for (int i=1;i<A.length;i++) {//rotating array to left -> moving array 1 position left
            B[i-1] = A[i];
        }
        B[B.length-1] = temp1; // adding the first element of the previous array to the last of the new rotated array
        for (int i : B) {
            System.out.print(i +",");
        }

        System.out.print("next is Right rotation of the array ");

        for (int i=0;i<A.length-1;i++) {//rotating array to left -> moving array 1 position left
            C[i+1] = A[i];
        }
        C[0] = temp2; // adding the first element of the previous array to the last of the new rotated array
        for (int i : C) {
            System.out.print(i +",");
        }
    }
}
