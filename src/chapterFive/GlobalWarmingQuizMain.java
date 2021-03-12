package chapterFive;

import java.util.Scanner;

public class GlobalWarmingQuizMain {

    public static void main(String[] args) {
        GlobalWarmingQuiz globalWarming = new GlobalWarmingQuiz();
        Scanner input = new Scanner(System.in);

        String message = """
                Welcome to the Global Warming Quiz.
                Please answer the following questions
                to test your knowledge on global warming:             
                """;

        System.out.println(message);

        System.out.println(globalWarming.questionOne());
        String userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "B" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
            case "A", "C", "D" -> System.out.println("Incorrect Answer \n");
        }


        System.out.println(globalWarming.questionTwo());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "C" -> System.out.println("Incorrect Answer \n");
            case "D" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(globalWarming.questionThree());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "D" -> System.out.println("Incorrect Answer \n");
            case "C" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(globalWarming.questionFour());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "D" -> System.out.println("Incorrect Answer \n");
            case "C" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(globalWarming.questionFive());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "C", "D" -> System.out.println("Incorrect Answer \n");
            case "B" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(globalWarming.result());


    }

    private static String validateSelection(Scanner input, String userSelection) {
        while(!(userSelection.equals("A") || userSelection.equals("B") ||
                userSelection.equals("C") || userSelection.equals("D")))
        {
            System.out.println("Invalid selection, try again.");
            userSelection = input.next();
        }
        return userSelection;
    }



}
