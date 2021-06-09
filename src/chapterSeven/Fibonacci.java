package chapterSeven;

public class Fibonacci {
    public static int calculateFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int FibonacciNumber = 0;
        for (int i = 0; i < n; i++) {
            FibonacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = FibonacciNumber;
        }
        return FibonacciNumber;
    }
}
