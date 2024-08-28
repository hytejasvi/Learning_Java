package DSA;

import java.util.Scanner;

public class EvenlyDivides {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to test");
        int n = sc.nextInt();
        int count = evenlyDivides(n);
        System.out.println(count);
    }

    private static int evenlyDivides(int N) {
        int num = N;
        int count =0;
        while (N > 0) {
            int k=N%10;
            if (k!=0 && num%k==0) {
                count++;
            }
            N = N/10;
        }
        return count;
    }
}
