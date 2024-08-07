package Methods;

public class maxUsingVarArgs {
    public static void main (String[] args) {
        System.out.println("max of max() : "+max());
        System.out.println("max of max(10,20) : "+max(10,20));
        System.out.println("max of max(10,20,30) : "+max(10,20,30));
        System.out.println("max of max(55) : "+max(55));
    }

    private static int max(int ...A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        int m = A[0];
        for (int i=1;i<A.length;i++){
            if (A[i] > m) {
                m = A[i];
            }
        }
        return m;
    }
}
