package Strings;

import java.util.*;

public class LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        int count = longestSubStringWithoutDuplicates();
        System.out.println(count);
    }

    private static int longestSubStringWithoutDuplicates() {
        String input = "bbbbbb";
        Set<Character> test = new HashSet<>();
        List <Integer> result = new ArrayList<>();
        test.add(input.charAt(0));
        for (int i=1;i<input.length();i++) {
            if (test.contains(input.charAt(i))) {
                result.add(test.size());
                test.clear();
            } else {
                test.add(input.charAt(i));
            }
        }
        result.sort(Collections.reverseOrder());
        return result.get(0);
    }
}
