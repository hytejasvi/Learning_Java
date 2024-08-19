package Patterns;

import java.util.Scanner;

/*
Input Format: N = 3
Result:
  *
 ***
*****
Input Format: N = 6
Result:
     *
    ***
   *****
  *******
 *********
***********
 */
public class Triangle6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        //starPyramid(n);
        approach2(n);
    }

    private static void starPyramid(int n) {//approach 1
        for (int i=0;i<n;i++) { //for printing / traversing the whole pyramid length
            int j=0,k=0;
            while (j<n) { //for printing the right angle triangle and spaces before the star
                if ((i+j)>=n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            while (k<=i) {//for printing the starts after the right angle triangle
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }

    static void approach2(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
