package Lambda;

// Interface declaration
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression to multiply two numbers
        Calculator calc = (a, b) -> { return (a * b); };

        // Store the result of the calculation
        int result = calc.calculate(5, 7);

        // Print the result
        System.out.println("Result: " + result);
    }
}
