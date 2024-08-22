package Patterns;

/*
Input Format: N = 3
Result:
A
A B
A B C

Input Format: N = 6
Result:
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
import java.util.Scanner;

public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        increasingLetterTrianglePattern(n);
    }

    private static void increasingLetterTrianglePattern(int n) {
        for (int i=0;i<n;i++) {
            for (char ch = 'A';ch <= 'A'+i;ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
