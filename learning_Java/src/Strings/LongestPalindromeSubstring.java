package Strings;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String input = "babad";
        String output = longestPalindromeSubstring(input);
        System.out.println(output);
    }

    private static String longestPalindromeSubstring(String s) {
        int n = s.length();

        if (n <= 1) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int currLen = Math.max(len1, len2);

            if (currLen > maxLength) {
                maxLength = currLen;
                start = i - (currLen - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
