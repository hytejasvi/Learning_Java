package Patterns;

/*
Input Format: N = 3
Result:
1
2 3
4 5 6

Input Format: N = 6
Result:
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
 */
import java.util.Scanner;

public class IncreasingNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        increasingNumberTrianglePattern(n);
    }

    private static void increasingNumberTrianglePattern(int n) {
        int k=1;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

}
