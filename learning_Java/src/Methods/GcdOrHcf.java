package Methods;

import java.util.Scanner;

public class GcdOrHcf {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        GcdOrHcf gcd = new GcdOrHcf(); //object creation
        System.out.println("Enter number 1 to find the CGD");
        int x = sc.nextInt();
        System.out.println("Enter number 2 to find the CGD");
        int y = sc.nextInt();
        int z = gcd.gcd(x,y);
        System.out.println("GCD of :"+x+" :"+y+" is : "+z);
    }
    private int gcd(int x, int y) {
        while (x != y) {
            if (x>y) {
                x = x-y;
            } else {
                y = y-x;
            }
        }
        return x;
    }
}
