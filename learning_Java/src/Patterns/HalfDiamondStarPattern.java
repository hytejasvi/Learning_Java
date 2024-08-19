package Patterns;

/*
Input Format: N = 3
Result:
  *
  **
  ***
  **
  *
Input Format: N = 6
Result:
     *
     **
     ***
     ****
     *****
     ******
     *****
     ****
     ***
     **
     *
 */

import java.util.Scanner;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        halfDiamondStarPattern(n);
    }

    private static void halfDiamondStarPattern(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1;i>0;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
