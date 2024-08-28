package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LcmAndGcd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long[] x = lcmAndGcd(A, B);
        System.out.println(Arrays.toString(x));
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        int num1 = 1;
        long gcd;
        Long a = A, b=B;
        boolean isGcd = false;
        ArrayList<Long> ret = new ArrayList<>();
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            gcd = b;
        }
        // If a is not 0,
        // return a as the GCD
        gcd=a;

        ret.add((A*B)/gcd);
        ret.add(gcd);
        return ret.toArray(new Long[0]);
    }
}
