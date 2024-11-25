
//

public class Example {
    public static void main(String[] args) {
        try {
            // Calling a method with an invalid argument
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            // Throw IllegalArgumentException for division by zero
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    } 
}
