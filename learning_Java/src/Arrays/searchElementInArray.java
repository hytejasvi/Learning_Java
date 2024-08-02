package Arrays;

import java.util.Scanner;

public class searchElementInArray {
    public static void main (String [] args) {
        int A[] = {3,9,7,8,12,16,15,5,4,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched in the array");
        int n = sc.nextInt();
        boolean matchFound = false;
        for (int x=0; x<A.length;x++) {
            if (A[x] == n) {
                System.out.println(n +": is present in the array at: "+(x+1) +" Position");
                matchFound = true;
                System.exit(0);
            }
        }
        if (!matchFound) {
            System.out.println(n +": is not present in the array");
        }
    }
}
