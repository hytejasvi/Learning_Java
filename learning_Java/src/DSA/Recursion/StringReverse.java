package DSA.Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String s = "madam";
        /*String reversed = stringReverse(s);
        System.out.println(reversed);*/
        String reversed2 = stringReverseApproach2(s);
        System.out.println(s.equals(reversed2));
    }

    private static String stringReverseApproach2(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return stringReverseApproach2(s.substring(1))+s.charAt(0);
    }

    private static String stringReverse(String s) {
        StringBuilder s1 = new StringBuilder();
        return strHelper(s1, s);
    }

    private static String strHelper(StringBuilder s1, String s) {
        if (s.isEmpty()) {
            return s;
        }
        strHelper(s1.append(s.charAt(s.length()-1)), s.substring(0,s.length()-1));
        return String.valueOf(s1);
    }
}
