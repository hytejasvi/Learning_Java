package Strings;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String input = "hello";
        String reverse1 = reverseString1(input);
        System.out.println(reverse1);
        String reverse2 = reverseString2(input);
        System.out.println(reverse2);
        String reverse3 = reverseStringRecursively(input);
        System.out.println(reverse3);
    }

    private static String reverseString2(String input) {
        StringBuilder sb = new StringBuilder(input);
        return String.valueOf(sb.reverse());
    }

    private static String reverseString1(String input) {
        char[] str = input.toCharArray();
        int length = input.length();
        int j=0;
        for (int i=length-1;i>j;i--) {
            if (i  > j) {
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;
                j++;
            }
        }
        return new String(str);
    }

    private static String reverseStringRecursively(String input) {//using recursion
        if (input.isEmpty()) {
            return input;
        }
        return reverseStringRecursively(input.substring(1)) + input.charAt(0);
    }
}
