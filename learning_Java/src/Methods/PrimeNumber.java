package Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check if it is prime or not:");
        int n = sc.nextInt();
        boolean prime = isPrime(n);
        if (prime) {
            System.out.println(n+" : is a prime number");
        } else {
            System.out.println(n+" : is not a prime number");
        }
    }

    private static boolean isPrime(int n) {
        for (int i=2;i<=n/2;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
