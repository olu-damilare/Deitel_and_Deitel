package chapterSix;

import java.security.SecureRandom;
import java.util.InputMismatchException;

public class ComputerAssistedInstruction {
        SecureRandom random = new SecureRandom();
        private int firstOperand;
        private char operator;
        private int secondOperand;
         private int result;
         private int score = 0;
        private int difficulty = 0;

    public int generateFirstOperand() {
        firstOperand = difficulty + random.nextInt(9 * difficulty);
        return firstOperand;
    }

    public int generateSecondOperand() {
        secondOperand = difficulty + random.nextInt(9 * difficulty);
        return secondOperand;
    }

    public char  generateRandomOperator() {
        int generatedOperator = 1 + random.nextInt(4);
        switch (generatedOperator) {
            case 1 -> operator = '+';
            case 2 -> operator = '-';
            case 3 -> operator = '/';
            case 4 -> operator = '*';
        }
        return operator;
    }

    public String displayQuestion() {
        generateFirstOperand();
        generateSecondOperand();
        return firstOperand + " " + operator + " " + secondOperand;
    }

    public void calculateResult(){
        switch (operator) {
            case '+' -> result = firstOperand + secondOperand;
            case '*' -> result = firstOperand * secondOperand;
            case '/' -> result = firstOperand / secondOperand;
            case '-' -> result = firstOperand - secondOperand;
        }
    }
    public void validateResult(int userAnswer){
        if(result == userAnswer) {
            generateCorrectAnswerComments();
            score += 10;
        }
        else
           generateWrongAnswerComments();

    }
    public int getResult() {
        return result;
    }

    private void generateCorrectAnswerComments(){
        int generateComment = 1 + random.nextInt(4);

        switch (generateComment) {
            case 1 -> System.out.println("Very good");
            case 2 -> System.out.println("Keep up the good work");
            case 3 -> System.out.println("Excellent");
            case 4 -> System.out.println("Nice work");
        }
    }

    private void generateWrongAnswerComments(){
        int generateComment = 1 + random.nextInt(2);

        switch (generateComment) {
            case 1 -> System.out.println("Wrong");
            case 2 -> System.out.println("Incorrect.");
        }
    }
    
    public void displayResultMessage(){
        if(score >= 70)
            System.out.println("Congratulations, you are ready to go to the next level");
        else
            System.out.println("Please ask your teacher for extra help.");
    }

    public int difficultyLevel(int userChoice){
        int difficultyLevelIncrement = 1;

            for (int i = 1; i <= userChoice; i++) {
                difficulty = difficultyLevelIncrement;
                difficultyLevelIncrement *= 10;
            }
        return difficulty;
    }

    public void userSelectedOperator(int userSelection) {
        switch (userSelection) {
            case 1 -> operator = '+';
            case 2 -> operator = '-';
            case 3 -> operator = '/';
            case 4 -> operator = '*';
            case 5 -> generateRandomOperator();
            }


    }
}
