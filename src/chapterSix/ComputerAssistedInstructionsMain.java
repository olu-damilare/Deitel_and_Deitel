package chapterSix;

import java.util.Scanner;

public class ComputerAssistedInstructionsMain {
    public static void main(String[] args) {
        ComputerAssistedInstruction computer = new ComputerAssistedInstruction();
        Scanner input= new Scanner(System.in);
        String mathematicalOperators = """
                Select 1 for addition operators.
                Select 2 for subtraction operators.
                Select 3 for division operators.
                Select 4 for multiplication operators.
                Select 5 for random operators.
                """;
        System.out.println(mathematicalOperators);
        int selectedOperator = input.nextInt();
        while (selectedOperator < 1 || selectedOperator > 5){
            System.out.println("Invalid selection. Try again. \n\n" + mathematicalOperators);
            selectedOperator = input.nextInt();
        }

        String difficultyLevel = "Please select a difficulty level between 1 and 10.";
        System.out.println(difficultyLevel);
        int userInput = input.nextInt();

        while (userInput < 1 || userInput > 10){
            System.out.println("Invalid selection. Try again. \n" + difficultyLevel);
            userInput = input.nextInt();
        }

        computer.difficultyLevel(userInput);

        for (int i = 0; i < 10; i++) {
            computer.userSelectedOperator(selectedOperator);

            System.out.println("Question " + (1+i));

            System.out.println(computer.displayQuestion());
            computer.calculateResult();

            userInput = input.nextInt();
            computer.validateResult(userInput);

            System.out.println();
        }
        computer.displayResultMessage();
    }
}
