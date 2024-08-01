package Loops;

import java.util.Scanner;

public class pattern1 {
    public static void main (String [] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=1;j<=n;j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
