package Strings;
public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "a good example";
        String output = reverseWords(input);
        System.out.println(output);
    }

    private static String reverseWords(String input) {
        String [] w = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i=w.length-1;i>=0;i--) {
            sb.append(w[i]).append(" ");
        }
        return String.valueOf(sb);
    }
}
