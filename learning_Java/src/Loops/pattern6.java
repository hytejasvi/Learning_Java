package Loops;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //System.out.format("%02d ", j);
                System.out.print(++count+" ");
                //System.out.print("*");
            }
            System.out.println();
        }
    }
}
