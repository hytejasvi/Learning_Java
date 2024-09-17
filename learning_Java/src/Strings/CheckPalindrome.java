package Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input1 = "A man a plan a canal Panama";
        String input2 = "hello";
        boolean result = checkPalindrome(input1);
        System.out.println("result1: "+result);
        boolean result2 = checkPalindrome(input2);
        System.out.println("result2: "+result2);
        boolean result3 = checkPalindrome2(input1);
        System.out.println("result3: "+result3);
    }

    private static boolean checkPalindrome(String input) {
        String word = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return word.equals(reverseWord(word));
    }

    private static String reverseWord(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
    }

    private static boolean checkPalindrome2(String input) {
        String word = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }
}