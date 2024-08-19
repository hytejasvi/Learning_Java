package Patterns;

/*
Input Format: N = 3
Result:
*****
 ***
  *
Input Format: N = 6
Result:
***********
 *********
  *******
   *****
    ***
     *
 */
import java.util.Scanner;

public class Triangle7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        pattern7(n);
    }

    private static void pattern7(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {// loop to print the spaces before the stars
                System.out.print(" ");
            }
            for (int j=0;j<((2*n)-(2*i)-1);j++) {// loop to print the stars
                System.out.print("*");
            }
            for (int j=0;j<i;j++) {// loop to print the spaces after the stars
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
