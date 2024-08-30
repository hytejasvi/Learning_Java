package DSA;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sumOfDivisors(n);
        System.out.println("sumOfDivisors: "+k);
    }

    private static long sumOfDivisors(int N) {
        long totalSum = 0;
        // Iterate through each number from 1 to N
        for (int i = 1; i <= N; i++) {
            long sumDivisors = 0;
            // Find all divisors of the number i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sumDivisors += j;
                }
            }
            // Add the sum of divisors of i to the total sum
            totalSum += sumDivisors;
        }
        return totalSum;
        }
    }
