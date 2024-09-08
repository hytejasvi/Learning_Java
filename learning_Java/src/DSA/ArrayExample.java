package DSA;

/*
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

src: The source array from which elements will be copied.
srcPos: The starting position in the source array.
dest: The destination array where elements will be copied to.
destPos: The starting position in the destination array.
length: The number of elements to copy.
 */
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        insertion();
        deletion();
    }

    private static void deletion() {
        int[]  numbers = {1, 2, 3, 4};
        int index = 2;
        int[] output = new int[numbers.length-1];
        System.arraycopy(numbers, 0, output, 0, index);
        System.arraycopy(numbers, index+1,output,index,output.length-index);
        System.out.println(Arrays.toString(output));
    }

    private static void insertion() {
        int[] numbers = {1, 2, 3, 4};
        int index = 2, newElement = 5;
        int[] output = new int[numbers.length +1];
        System.arraycopy(numbers,0,output,0,index);
        output[index] = newElement;
        System.arraycopy(numbers,index,output,index+1,numbers.length-index);
        System.out.println(Arrays.toString(output));
    }
}
