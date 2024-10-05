package DSA;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {9, 10, 1, 2, 3, 4, 8, 1,1,1, 1};
        int x = minJumps(arr);
        System.out.println("minimum jumps: " + x);
    }

    private static int minJumps(int[] arr) {
        if (arr.length <= 0) {
            return -1;
        }
        int jump = 0;
        if (arr.length > 1) {
            if (arr[0] == 0) {
                return -1;
            }
            int currentPos = 0;
            while (currentPos < arr.length - 1) {  // Loop until the last index is reached or exceeded
                if (arr[currentPos] == 0) {
                    return -1;
                }
                jump++;
                currentPos += arr[currentPos];
                if (currentPos >= arr.length - 1) {
                    return jump;  // Return the current jump count without incrementing further
                }
            }
        }
        return jump;
    }
}
