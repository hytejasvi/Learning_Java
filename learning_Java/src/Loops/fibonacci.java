package Loops;

import java.util.Scanner;

import static java.lang.System.exit;

public class fibonacci {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of series digits to be displayed");
        int n = sc.nextInt();
        int a=0, b=1,c;
        if (n < 0) {
            System.out.println("enter a valid natural number");
            exit(0);
        } else if (n ==0) {
            System.out.print(a);
        } else if (n ==1) {
            System.out.print(a + "," + b + ",");
        } else {
            System.out.print(a + "," + b + ",");
            for (int i = 0; i < n - 2; i++) {
                c = a + b;
                System.out.print(c + ",");
                a = b;
                b = c;
            }
        }
    }
}