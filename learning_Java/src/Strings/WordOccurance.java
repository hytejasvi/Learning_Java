package Strings;

public class WordOccurance {
    public static void main(String[] args) {
        String source = "Here is an example.   Right here.";
        String word = "here";
        int result = Answer.getOccurrences(source, word);
        System.out.println(result);
    }
}

class Answer {
    // Return the number of occurrences of word in source
    static int getOccurrences(String source, String word) {
        int count = 0;
        String x = source.replaceAll("[^A-Za-z0-9\\s]", "").toLowerCase();
        /*
        [^...]--> ^ inside the brackets tells the compiler to match everything that is not specified inside
        the bracket
        in our example, we say everythign except (a to z, A to Z and 0 to 9 and spaces), which leaves all the special
        chars, replace them with ""--> this means replace them with nothing.
         */
        String []words = x.split("\\s+");
        /*
        Splits the string into an array of words by matching one or more spaces as the delimiter.
         */
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

}
