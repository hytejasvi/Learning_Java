package Patterns;

/*
Input Format: N = 3
Result:
1
01
101

Input Format: N = 6
Result:
1
01
101
0101
10101
010101
 */
import java.util.Scanner;

public class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        binaryNumberTrianglePattern(n);
    }

    private static void binaryNumberTrianglePattern(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
