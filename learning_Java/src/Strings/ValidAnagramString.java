package Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramString {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        /*boolean isValidAnagram1 = isValidAnagram1(s, t);//approach1
        System.out.println(isValidAnagram1);*/
        boolean isValidAnagram2 = isValidAnagram2(s, t);//approach2
        System.out.println(isValidAnagram2);
    }

    private static boolean isValidAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();
        Map<Character, Integer> chars = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i),0)+1);
            chars.put(t.charAt(i), chars.getOrDefault(t.charAt(i),0)-1);
        }
        for (int i: chars.values()) {
            if (i!=0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidAnagram1(String s, String t) {
        Map<Character, Integer> chars1 = new HashMap<>();
        Map<Character, Integer> chars2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            chars1.put(s.charAt(i), chars1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            chars2.put(t.charAt(i), chars2.getOrDefault(t.charAt(i),0)+1);
        }
        return chars1.equals(chars2);
    }
}
