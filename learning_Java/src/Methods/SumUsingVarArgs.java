package Methods;

public class SumUsingVarArgs {
    public static void main (String[] args) {
        System.out.println("sum of sum() : "+sum());
        System.out.println("max of max(10,20) : "+sum(10,20));
        System.out.println("max of max(10,20,30) : "+sum(10,20,30));
        System.out.println("max of max(55) : "+sum(55));
    }

    private static int sum(int ...A) {
        if (A.length == 0) return 0;
        int sum = A[0];
        for (int i=1;i<A.length;i++) {
            sum +=A[i];
        }
        return sum;
    }
}
