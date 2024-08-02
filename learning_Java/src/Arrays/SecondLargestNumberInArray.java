package Arrays;

import java.util.Scanner;

public class SecondLargestNumberInArray {
    public static void main (String [] args) {
        int[] A = {3,9,7,8,12,16,15,5,4,10};
        int max1, max2;
        max1 = max2 = A[0];
        for (int x=0; x<A.length;x++) {

            if ((A[x] > max1) && (A[x] > max2)) {
                max2 = max1;
                max1 = A[x];
            } else if ((A[x] > max1) && (A[x] < max2)) {
                max1 = A[x];
            } else if ((A[x] < max1) && (A[x] > max2)) {
                max2 = A[x];
            }
        }
        System.out.println(max2);
    }
}
