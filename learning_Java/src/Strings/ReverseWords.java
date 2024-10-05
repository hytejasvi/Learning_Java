package Strings;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        String reverse = reverseWords(input);
        System.out.println("reverse: "+reverse);
    }

    private static String reverseWords(String str) {
        String [] s = str.split("\\.");
        System.out.println(s.length);
        StringBuilder sb = new StringBuilder();
        for (int i=s.length-1;i>0;i--) {
            sb.append((s[i]+"."));
        }
        sb.append(s[0]);
        return String.valueOf(sb);
    }
}
