package Loops;

import java.util.Scanner;

public class displayDigits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n>0) {
            int reminder = n % 10;
            System.out.println(reminder);
            n = n / 10;
        }
    }
}
