package Patterns;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        reverseLetterTrianglePattern(n);
    }

    private static void reverseLetterTrianglePattern(int n) {
        for (int i=n-1;i>=0;i--) {
            for (char ch ='A';ch<='A'+i;ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
