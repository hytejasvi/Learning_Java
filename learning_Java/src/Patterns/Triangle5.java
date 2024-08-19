package Patterns;
/*
Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
Example:
Input: ‘N’ = 3
Output:
1 2 3
1 2
1
 */
import java.util.Scanner;

public class Triangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        nNumberTriangle(n);
    }

    private static void nNumberTriangle(int n) {
        for (int i=n;i>0;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
