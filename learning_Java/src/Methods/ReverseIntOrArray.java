package Methods;

public class ReverseIntOrArray {
    public static void main (String []args) {
        int[] A = {3,9,7,8,12,16,15,5,4,10};
        int B = 1234;
        ReverseIntOrArray ra = new ReverseIntOrArray();
        int[] reversed = ra.reverse(A);
        int reversedInt = ra.reverse(B);
        for (int num : reversed) {
            System.out.printf(num+" ");
        }
        System.out.println("");
        System.out.println("reversed Int is: "+reversedInt);
    }

    private int[] reverse(int[] a) {
        int[] B = new int[a.length];
        for (int i=0;i <a.length;i++) {
            B[a.length-1-i] = a[i];
        }
        return B;
    }
    private int reverse(int b) {
        int rev=0,r;
        while (b>0) {
            r = b%10;
            rev = rev*10+r;
            b = b/10;
        }
        return rev;
    }
}
