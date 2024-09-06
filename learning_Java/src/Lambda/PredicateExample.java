package Lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // This declares a Predicate that takes an Integer and returns true if the number is even.
        Predicate <Integer> isEven = (n) -> n%2==0; //This lambda checks whether n is even by using the modulus operator (%).
        //isEven.test(10): This calls the test() method to check if the number 10 is even.
        boolean test = isEven.test(10);
        System.out.println(test);
    }
}
