package Patterns;

import java.util.Scanner;

public class TheNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        theNumberPattern(n);
    }

    private static void theNumberPattern(int n) {
        for (int i=0;i<2*n-1;i++) {
            for (int j=0;j<2*n-1;j++) {
                int top=i,down=j,l=((2*n-2)-j),r=((2*n-2)-i);
                System.out.println("top: "+top);
                System.out.println("down: "+down);
                System.out.println("l: "+l);
                System.out.println("r: "+r);
                Math.min(top,down);
            }
            System.out.println();
        }
    }
}
