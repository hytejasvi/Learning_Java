package Patterns;

/*
Input Format: N = 3
Result:
A
B B
C C C

Input Format: N = 6
Result:
A
B B
C C C
D D D D
E E E E E
F F F F F F
 */
import java.util.Scanner;

public class AlphaRampPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        alphaRampPattern(n);
    }

    private static void alphaRampPattern(int n) {
        char ch = 'A';
        for (int i=0;i<n;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
