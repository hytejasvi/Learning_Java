package DSA.Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int [] input = {};
        int sum = sumOfArray(input, 0);
        System.out.println(sum);
    }

    private static int sumOfArray(int[] input, int index) {
        if (input.length == index) {
            return 0;
        }
        return (input[index]+sumOfArray(input, index+1));
    }
}
