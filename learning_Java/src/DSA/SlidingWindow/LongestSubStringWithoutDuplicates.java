package DSA.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        int count = longestSubStringWithoutDuplicates();
        System.out.println(count);
    }

    private static int longestSubStringWithoutDuplicates() {
        String input = "abcdbcdbbdca";
        int maxLength = 0;
        int start = 0;
        Set<Character> ch = new HashSet<>();
        for (int i=0;i<input.length();i++) {
            while(ch.contains(input.charAt(i))) {
                ch.remove(input.charAt(start));
                start++;
            }
            ch.add(input.charAt(i));
            maxLength = Math.max(maxLength, i-start+1);
        }
        return maxLength;
    }
}
