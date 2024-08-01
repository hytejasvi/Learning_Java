package Loops;

import java.util.Scanner;

public class palindrome {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check if it is a palindrome or not");
        int n = sc.nextInt();
        int rev = 0, r, inputNumber = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (inputNumber == rev) {
            System.out.println("This is a palindrome number");
        } else {
            System.out.println("This is not a palindrome number");
        }
    }
}
