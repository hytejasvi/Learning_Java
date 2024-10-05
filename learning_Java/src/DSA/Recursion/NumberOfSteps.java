package DSA.Recursion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfSteps {
    public static void main(String[] args) {
        NumberOfStepsSolution solution = new NumberOfStepsSolution();
        int steps = solution.numberOfSteps(14);
        System.out.println(steps);
    }
}
class NumberOfStepsSolution {
    public int numberOfSteps(int num) {
        return helperFunc(num, 0);
    }
    public int helperFunc(int num, int steps) {
        if (num==0) {
            return steps;
        }
        if ((num & 1)==1) {
            return helperFunc(num-1, steps+1);
        } else {
            return helperFunc(num/2, steps+1);
        }
    }
}