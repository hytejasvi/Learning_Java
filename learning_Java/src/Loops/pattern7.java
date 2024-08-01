package Loops;

import java.util.Scanner;

public class pattern7 {
    public static void main (String [] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i=0;i<n;i++) {
            for (int j=1;j<=n-i;j++) {
                //System.out.format("%02d ",j);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
