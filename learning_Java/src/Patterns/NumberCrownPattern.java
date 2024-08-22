package Patterns;

/*
Input Format: N = 3
Result:
1    1
12  21
123321

Input Format: N = 6
Result:
1          1
12        21
12       321
1234    4321
12345  54321
123456654321
 */
import java.util.Scanner;

public class NumberCrownPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle height");
        int n= sc.nextInt();
        numberCrownPattern(n);
    }

    private static void numberCrownPattern(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            int k=i;
            for (int j=1;j<=n;j++) {
                if (i+j >n) {
                    System.out.print(k);
                    k--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
