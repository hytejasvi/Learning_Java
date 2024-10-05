package Strings;

import java.util.ArrayList;
import java.util.List;

public class Problems {
    public static void main(String[] args) {
        MergeStringSolution m = new MergeStringSolution();
        String solution = m.mergeAlternately("abcd", "pq");
        System.out.println(solution);
    }
}
class MergeStringSolution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while ((i<word1.length()) || (j<word2.length())) {
            if (i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}

class kidsWithCandiesSolution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandies = 0;
        List<Boolean> result= new ArrayList<>();
        for (int candy : candies) {
            highestCandies = (Math.max(highestCandies, candy));
        }
        for (int candy : candies) {
            if (candy + extraCandies >= highestCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
/*
class GcdOsStringsSolution {
    public String gcdOfStrings(String str1, String str2) {
        List<Boolean> result = new ArrayList<>()
    }
}*/
