package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class AmrstrongNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean isArmstrong = isAmrstrongNumer(n);
        System.out.println("is : "+n+" Armstrong number :: "+isArmstrong);
    }

    /*private static boolean isAmrstrongNumer(int n) {
        int num = n;
        int k=0;
        ArrayList <Integer> x = new ArrayList<>();
        while (n>0) {
            x.add(n%10);
            k ++;
            n=n/10;
        }
        int sum =0;
        for (int y: x) {
            int z = (int) Math.pow(y,k);
            sum = sum+z;
        }
        return sum == num;
    }*/

    public static boolean isAmrstrongNumer(int num) {
        // Calculate the number of
        // digits in the given number
        int k = String.valueOf(num).length();
        // Initialize the sum of digits
        // raised to the power of k to 0
        int sum = 0;
        // Copy the value of the input
        // number to a temporary variable n
        int n = num;
        // Iterate through each
        // digit of the number
        while(n > 0){
            // Extract the last
            // digit of the number
            int ld = n % 10;
            // Add the digit raised to
            // the power of k to the sum
            sum += Math.pow(ld, k);
            // Remove the last digit
            // from the number
            n = n / 10;
        }
        // Check if the sum of digits raised to
        // the power of k equals the original number
        return sum == num;
    }
}
