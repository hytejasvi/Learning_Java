package Loops;

import java.util.Scanner;

public class armstrongNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int inputNumber = n;
        int sum = 0;
        while (n>0) {
            int r = n%10;
            sum += r*r*r;
            n = n/10;
        }
        System.out.println("sum: "+sum);
        if (sum == inputNumber) {
            System.out.println("it is an armstrong number");
        } else {
            System.out.println("Not an ArmsStrong Number");
        }
    }
}
