package Arrays;

public class InsertElement {
    public static void main (String[] args) {
        int[] a = new int[10];
        a[0] = 3; a[1] = 9; a[2] = 7; a[3] = 8; a[4] = 12; a[5] = 6;
        int n=6;
        for (int i=0;i<n;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println("");
        int index = 2;
        int value = 20;
        if (index > n) {
            System.out.println("enter a valid index");
        }
        for (int i=n;i>index;i--) {
            a[i] = a[i-1];
        }
        a[index] = value;
        for (int i=0;i<n;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println("");
    }
}
