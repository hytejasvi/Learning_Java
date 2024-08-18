package Patterns;

import java.util.Scanner;

/*Problem statement
    Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern
    of size NxN filled with ‘*’.
    For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
    Example:
    Input: ‘N’ = 3
    Output:
    * * *
    * * *
    * * *
Sample Input 2 :
1
Sample Output 2 :
*
Sample Input 3 :
4
Sample Output 3 :
* * * *
* * * *
* * * *
* * * *     */
public class Nforest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        nForest(n);
    }

    private static void nForest(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
