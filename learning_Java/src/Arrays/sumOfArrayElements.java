package Arrays;

public class sumOfArrayElements {
    public static void main (String []args) {
        int[] a = {3,9,7,8,12,16,15,5,4,10}; //style 1 of declaration and Initialization
        int [] b; // another way of declaring
        b = new int[10]; // Initialization -> size of array b is set to 10 and all the elements are initialised to 0
        b = new int[]{3, 9, 7, 8, 12, 16, 15, 5, 4}; // re-Initialization of array b
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum +=a[i];
        }
        System.out.println("normal loop Sum = "+sum);
        int sum2 = 0;
        for (int x : a) {
            sum2 += x;
        }
        System.out.println("Enhanced loop Sum = "+sum2);

        for (int x: b) {
            System.out.println(x);
        }
    }
}
