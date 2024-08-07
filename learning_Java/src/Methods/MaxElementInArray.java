package Methods;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main (String[] args) {
        int A[] = {3,9,7,8,12,16,15,5,4,20};
        MaxElementInArray mx = new MaxElementInArray();
        int max = mx.maxElement(A);
        System.out.println(max);
    }

    private int maxElement(int[] a) {
        int max = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
