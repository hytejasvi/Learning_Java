package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String output = compressString2(input);
        System.out.println(output);
    }

    private static String compressString(String input) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        boolean added = false;
        for (int i=0;i<input.length();i++) {
            if ((input.charAt(i) != input.charAt(start))) {
                if (!added) {
                    sb.append(input.charAt(start));
                }
                sb.append(i-start);
                start=i;
                added = false;
            } else {
                if (!added) {
                    sb.append(input.charAt(start));
                    added = true;
                }
            }

        }
        return sb.toString();
    }

    private static String compressString2(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1)).append(count);
                count = 1; // reset count for the new character
            }
        }

        // Append the last character and its count
        sb.append(input.charAt(input.length() - 1)).append(count);

        // Return the original string if the compressed version isn't smaller
        return sb.length() < input.length() ? sb.toString() : input;
    }
}
