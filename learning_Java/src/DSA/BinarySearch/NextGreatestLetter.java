package DSA.BinarySearch;

/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class NextGreatestLetter {
    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j', 'y'};
        char target = 'y';
        char result = nextGreatestLetter(letters, target);
        System.out.println("Result is: "+result);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = (letters.length-1);
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < letters[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if (start >= letters.length) {
            return letters[0];
        } else {
            return letters[start];
        }
        //return letters[start%letters.length];   this can be used instead of above if-else
    }
}
