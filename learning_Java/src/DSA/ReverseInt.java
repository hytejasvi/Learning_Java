package DSA;

import java.util.Scanner;

public class ReverseInt {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to test");
        int n = sc.nextInt();
        int count = reverse(n);
        System.out.println(count);
    }

    private static int reverse(int x) {
        int num=0;
        while(x>0) {
            int k=x%10;
            num = num*10+k;
            x=x/10;
        }
        return num;
    }
}
