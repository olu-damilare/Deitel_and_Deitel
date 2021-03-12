package Exercise;

import java.util.Scanner;

public class RandomMathematicalOperationsTest {
    public static void main(String[] args) {
        RandomMathematicalExpressions random = new RandomMathematicalExpressions();
        Scanner input = new Scanner(System.in);
        int questionNumber = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question " + questionNumber);

            random.setFirstOperand();
            random.setSecondOperand();
            random.setThirdOperand();
            random.setFirstOperators();
            random.setSecondOperators();
            random.getFirstResult();
            random.getTotalResult();

            System.out.println(random.question());
            int userInput = input.nextInt();

            random.evaluateInput(userInput);
            questionNumber++;
            System.out.println();

        }

        System.out.println("Your score is " + random.getTotalScore());
    }
}
