package Loops;

import java.util.Scanner;

public class pattern4 {
    public static void main (String [] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                System.out.format("%02d ",++counter);
            }
            System.out.println();
        }
    }
}
