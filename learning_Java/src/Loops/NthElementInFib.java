package Loops;

import java.util.Scanner;

public class NthElementInFib {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value to find the fibonacci series value of it");
        int n = sc.nextInt();
        int k = nthElementInFib(n);
    }

    private static int nthElementInFib(int n) {
        int first =1,second=1;
        int nextnum=0;
        if (n<=0) {
            System.out.println("Enter a valid number greater than 0");
            return 0;
        } else if (n==1 || n==2) {
            return first;
        } else {
            for (int i=3;i<=n;i++) {
                nextnum = first+second;
                first = second;
                second = nextnum;
            }
        }
        System.out.println(n+" value in the fibonacci series is : "+nextnum);
        return nextnum;
    }
}
