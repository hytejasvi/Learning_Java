package DSA;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int []arr = {0, 0, 0, 4};
        int n=arr.length;
        pushZerosToEnd(arr, n);
    }

    private static void pushZerosToEnd(int[] arr, int n) {
        int left =0;
        int right = left+1;
        while (right <n) {
            if (arr[left] !=0) {
                left++;
                right++;
            } else if (arr[left] ==0 && arr[right] !=0) {
                arr[left] = arr[right];
                arr[right++] = 0;
                left++;
            } else {
                right++;
            }
        }
        /*for (int i=0;i<n;i++) {
            int j=i+1;
            if (arr[i] == 0 ) {
                while (j <n) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }*/
        /*Test Cases Passed:
        1113 /1135
        Time Limit Exceeded

        Your program took more time than expected.Expected Time Limit : 5sec*/
        System.out.println(Arrays.toString(arr));
    }
}
