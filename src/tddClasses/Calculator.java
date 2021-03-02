package tddClasses;

public class Calculator {

    public int add(int numerator, int denominator) {
        int sum = numerator + denominator;
        return sum;
    }

    public double divide(int numerator, int denominator) {
            if(denominator == 0)
                return 0;
        return numerator /(denominator * 1.0);
    }

    public int subtract(int firstNumber, int secondNumber) {
        if(secondNumber > firstNumber)
            return secondNumber - firstNumber;
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
