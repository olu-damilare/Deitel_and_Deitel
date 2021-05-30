package Exercise;

public class Calculator {

    public static int add(int firstNumber, int secondNumber) {
       return firstNumber + secondNumber;
    }

    public static double divide(int numerator, int denominator) {
        if(denominator == 0) return 0;
        return numerator /(denominator * 1.0);
    }

    public static int subtract(int firstNumber, int secondNumber) {
        if(secondNumber > firstNumber)
            return secondNumber - firstNumber;
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int calculate(String expression) {
        int value = 0;
        String currentValue = "";
        expression+="+";
        char operator = '+';

        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                if(operator == '+') {
                    value += Integer.parseInt(currentValue);
                }
                else if(operator == '-') {
                    value -= Integer.parseInt(currentValue);
                }
                else if(operator == '*') {
                    value *= Integer.parseInt(currentValue);
                }
                else if(operator == '/') {
                    value /= Integer.parseInt(currentValue);
                }
                operator = expression.charAt(i);
                currentValue = "";

            }
            else currentValue += expression.charAt(i);
        }

        return value;
    }
}
