package chapterSeven;

public class Fibonnaci {
    public static int calculateFibonnaci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonnaciNumber = 0;
        for (int i = 0; i < n; i++) {
            fibonnaciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonnaciNumber;
        }
        return fibonnaciNumber;
    }
}
