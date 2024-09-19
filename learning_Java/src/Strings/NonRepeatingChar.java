package Strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String result = nonRepeatingChar();
        if (result.isEmpty()) {
            System.out.println("No non-repeating character");
        } else {
            System.out.println(result);
        }
    }

    private static String nonRepeatingChar() {
        String input = "aabbcc";
        Map<Character,Integer> charCount = new HashMap<>();

        for (char ch: input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0));
        }

        for (char ch: input.toCharArray()) {
            if (charCount.get(ch)==1) {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}
