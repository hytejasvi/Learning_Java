package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String input = "Java Programming";
        countVowelsAndConsonants1(input);
        countVowelsAndConsonants2(input);
    }

    private static void countVowelsAndConsonants2(String input) {
        String words = input.replaceAll("[^A-Za-z]","").toLowerCase();
        int vowels = 0;
        for (int i=0;i<words.length();i++) {
            char ch = words.charAt(i);
            if (ch == 'a' ||ch ==  'e' ||ch == 'i'||ch == 'o'||ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+(words.length()-vowels));
    }

    private static void countVowelsAndConsonants1(String input) {
        String words = input.replaceAll("[^A-Za-z]","");
        Pattern vowels = Pattern.compile("[aeiouAEIOU]");
        Matcher vowelsMatcher = vowels.matcher(input);
        int vowelsCount = 0;
        while (vowelsMatcher.find()) {
            vowelsCount++;
        }
        System.out.println("Vowels: "+vowelsCount);
        System.out.println("Consonants: "+(words.length()-vowelsCount));
    }
}
