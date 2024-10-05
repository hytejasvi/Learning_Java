package DSA.Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "hello";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(s+" is palindrome: "+isPalindrome);
    }

    private static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length()==1) {
            return true;
        }
        if (s.charAt(0)==s.charAt(s.length()-1)) {
            return isPalindrome(s.substring(1, s.length()-1));
        } else {
            return false;
        }
    }
}
