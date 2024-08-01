package Loops;

import java.util.Scanner;

public class pattern10 {
    public static void main (String [] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if (i+j >n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <=i;k++) {
                if (k == i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
