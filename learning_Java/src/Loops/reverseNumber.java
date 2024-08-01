package Loops;

import java.util.Scanner;

public class reverseNumber {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0, r;
        while (n >0) {
            r = n%10; //modulas operation: returns the reminder
            System.out.println("r: "+r);
            rev = rev *10+r;
            System.out.println("rev: "+rev);
            n = n/10; //division operation : returns the quotient
            System.out.println("n: "+n);
        }
        System.out.println("outside of the loop");
        System.out.println(rev);
    }
}
