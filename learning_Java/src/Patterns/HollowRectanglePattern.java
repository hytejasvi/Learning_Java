package Patterns;

/*
Input Format: N = 3
Result:
***
* *
***

Input Format: N = 6
Result:
******
*    *
*    *
*    *
*    *
******
 */
import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        hollowRectanglePattern(n);
    }

    private static void hollowRectanglePattern(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==0 || j==0 || (i==n-1) || (j==n-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
