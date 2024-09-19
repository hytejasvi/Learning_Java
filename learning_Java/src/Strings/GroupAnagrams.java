package Strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(input);

        // Print the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    // You'll implement this method
    private static List<List<String>> groupAnagrams(String[] strs) {
        System.out.println(strs.length);
        return new ArrayList<>();
    }
}