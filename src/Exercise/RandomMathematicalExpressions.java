package Exercise;

import java.security.SecureRandom;

public class RandomMathematicalExpressions {
    SecureRandom random = new SecureRandom();
    private int firstOperand;
    private int secondOperand;
    private int thirdOperand;
    private String firstOperator;
    private String secondOperator;
    private int result;
    private int totalScore = 0;

    public int setFirstOperand() {
        firstOperand = 1 + random.nextInt(9);
        return firstOperand;
    }

    public int setSecondOperand() {
        secondOperand = 1 + random.nextInt(9);
        return secondOperand;
    }

    public int setThirdOperand() {
        thirdOperand = 1 + random.nextInt(9);
        return thirdOperand;
    }

    public String setFirstOperators() {
        int generatedOperator = 1 + random.nextInt(5);
        switch (generatedOperator) {
            case 1 -> firstOperator = "*";
            case 2 -> firstOperator = "/";
            case 3 -> firstOperator = "+";
            case 4 -> firstOperator = "-";
            case 5 -> firstOperator = "%";
        }
        return firstOperator;
    }

    public String setSecondOperators() {
        int generatedOperator = 1 + random.nextInt(5);
        switch (generatedOperator) {
            case 1 -> secondOperator = "*";
            case 2 -> secondOperator = "/";
            case 3 -> secondOperator = "+";
            case 4 -> secondOperator = "-";
            case 5 -> secondOperator = "%";
        }
        return secondOperator;
    }

    public String question() {
        return firstOperand + " " + firstOperator + " " + secondOperand + " " + secondOperator + " " + thirdOperand;
    }

    public int getFirstResult() {

        if (firstOperator.equals("*"))
            result = firstOperand * secondOperand;
        else if (firstOperator.equals("/"))
            result = firstOperand / secondOperand;
        else if (firstOperator.equals("+"))
            result = firstOperand + secondOperand;
        else if (firstOperator.equals("-"))
            result = firstOperand - secondOperand;
        else if (firstOperator.equals("%"))
            result = firstOperand % secondOperand;

        return result;

    }

    public int getTotalResult() {
        if (secondOperator.equals("*"))
            result *= thirdOperand;
        else if (secondOperator.equals("/"))
            result /= thirdOperand;
        else if (secondOperator.equals("+"))
            result += thirdOperand;
        else if (secondOperator.equals("-"))
            result -= thirdOperand;
        else if (secondOperator.equals("%"))
            result %= thirdOperand;

        return result;
    }

    public void evaluateInput(int userInput) {
        if (userInput == result) {
            totalScore++;
            System.out.println("Correct");
        } else System.out.println("Incorrect");
    }


    public int getTotalScore() {
        return totalScore;
    }

}

