package Lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> toUpper = (str)-> str.toUpperCase();
        String res = toUpper.apply("hello world");
        System.out.println(res);
    }
}
