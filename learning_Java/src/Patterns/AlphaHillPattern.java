package Patterns;

/*
Input Format: N = 3
Result:
  A
 ABA
ABCBA


Input Format: N = 6
Result:
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
 */
import java.util.Scanner;

public class AlphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        alphaHillPattern(n);
    }

    private static void alphaHillPattern(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++) {
                System.out.print("_");
            }
            char ch = 'A';
            int bp = (2*i+1)/2;//based on this breakpoint, we increment or decrement the characters
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j <= bp) ch++;
                else ch--;
            }
            for (int j=0;j<n-i-1;j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
