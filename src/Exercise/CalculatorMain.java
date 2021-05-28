package tddClasses;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner inputCollector = new Scanner(System.in);
        String prompt = """
                Hello User,
                -> input 1 for addition.
                -> input 2 for absolute calculation.
                -> input 3 for multiplication.
                -> input 4 for division.
                """;
        System.out.println(prompt);
        int userChoice = inputCollector.nextInt();

        System.out.println("Enter first Number");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = inputCollector.nextInt();

        switch(userChoice){
            case 1:
                System.out.println("result is " + calculator.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("result is " + calculator.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("result is " + calculator.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("result is " + calculator.divide(firstNumber, secondNumber));
            default:
                System.out.println("invalid input");
        }
    }
}
