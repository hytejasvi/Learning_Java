package MathDemo;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Absolute");
        /*
        If the argument is not negative, the argument is returned.
        If the argument is negative, the negation of the argument is returned.
         */
        System.out.println(Math.abs(-123));

        System.out.println("StrictMath Absolute");
        System.out.println(StrictMath.abs(-123)); // this internally calls Math.abs

        System.out.println("Cube root");
        System.out.println(Math.cbrt(8.12)); // gives cube root of the given double

        System.out.println("decrementExact");
        // if the given number is Integer.MIN_VALUE, throws ArithmeticException, else, it reduces 1 from the passed number
        //and returns value.
        System.out.println(Math.decrementExact(6));

        System.out.println("Exponent");
        System.out.println(Math.getExponent(1234));

        System.out.println(Math.log10(100)); // If the argument is equal to 10n for integer n, then the result is n.
        System.out.println(Math.max(10,50)); //Returns the greater of two int values.
        System.out.println(Math.tan(45*Math.PI/180)); //Returns the trigonometric tangent of an angle.
        System.out.println(Math.random()*10); //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.
        System.out.println(Math.pow(10,3)); //Returns the value of the first argument raised to the power of the second argument.
        System.out.println(Math.multiplyExact(10,20)); //Returns the product of the arguments, throwing an exception if the result overflows an int.

        /*Returns the floating-point number adjacent to the first argument in the direction of the second argument.
          If both arguments compare as equal the second argument is returned.*/
        System.out.println(Math.nextAfter(12.5,120));
    }
}
