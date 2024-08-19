package Patterns;
/*
Problem statement
Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.
For every value of ‘N’, print the field if the trees are represented by ‘*’.
Example:
Input: ‘N’ = 3
Output:
* * *
* *
*
       */
import java.util.Scanner;

public class Triangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        seeding(n);
    }

    private static void seeding(int n) {
        for (int i=n;i>0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
