package Arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main (String [] args) {
        int A[] = {3,9,7,8,12,16,15,5,4,10};
        int max = 0;
        for (int x=0; x<A.length;x++) {
            if (A[x] > max) {
                max = A[x];
            }
        }
        System.out.println("Largetst number i s: "+max);
    }
}
