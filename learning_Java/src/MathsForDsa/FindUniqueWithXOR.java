package MathsForDsa;

public class FindUniqueWithXOR {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,6,6,6,1,4};
        int result = findUnique(arr);
        System.out.println("unique element is : "+result);
    }

    private static int findUnique(int[] arr) {
        int uniqueElement = 0;
        for (int j : arr) {
            uniqueElement = uniqueElement ^ j;
        }
        return uniqueElement;
    }
}
