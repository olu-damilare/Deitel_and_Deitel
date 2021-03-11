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

        System.out.println(questionOne());
        String userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "B" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
            case "A", "C", "D" -> System.out.println("Incorrect Answer \n");
        }


        System.out.println(questionTwo());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "C" -> System.out.println("Incorrect Answer \n");
            case "D" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(questionThree());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "D" -> System.out.println("Incorrect Answer \n");
            case "C" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(questionFour());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "B", "D" -> System.out.println("Incorrect Answer \n");
            case "C" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }

        System.out.println(questionFive());
        userSelection = input.next();
        userSelection = validateSelection(input, userSelection);

        switch (userSelection) {
            case "A", "C", "D" -> System.out.println("Incorrect Answer \n");
            case "B" -> {
                globalWarming.selectAnswer(userSelection);
                System.out.println("Correct \n");
            }
        }


        System.out.println(result(globalWarming));


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

    private static String result(GlobalWarmingQuiz globalWarming) {
        System.out.println("You scored " + globalWarming.getTotalScore());

        if(globalWarming.getTotalScore() == 5)
            return "Excellent";
        else if(globalWarming.getTotalScore() == 4)
            return "Very good";
        else
            return """
                    Time to brush up your knowledge of global warming.
                    for more information on climate change, lookup:
                    www.climate.nasa.gov, 
                    www.environmentalsciencedegree.com/climate-change/,
                    www.greenfacts.org/en/climate-change-ar3/ 
                    """;
    }

    private static String questionOne(){
        String question = """
                    Question 1:
                    
                    Which of the following does not trap heat?
                    A. Carbon dioxide
                    B. Nitrogen
                    C. Water vapor
                    D. Methane
                    """;

        return question;
    }
    private static String questionTwo(){
        String question = """
                    Question 2:
                    How do scientists collect evidence about climate?
                    
                    A. Using remote sensing from space with satellites
                    B. By ground-based measurements of surface temperature,
                       carbon dioxide concentration and sea level.
                    C. By collecting "proxy data" from tree rings, ice cores and historical records.
                    D. All of the above.
                    """;

        return question;
    }

    private static String questionThree(){
        String question = """
                Question 3:
                What is the coldest part of an ice sheet?
                A. The Base
                B. The middle
                C. The surface
                D. It's roughly the same temperature throughout.
                """;

        return question;
    }

    private static String questionFour(){
        String question = """
                Question 4:
                
                Plants use carbon dioxide and water to make their own food 
                through the process of photosynthesis. When they are doing a lot of
                photosynthesis, plants reflect light strongly in 
                which of the following wavelengths?
                
                A. Visible
                B. Ultra-violet
                C. Near-infrared
                D. All of the above.
                """;
        return question;

    }

    private static String questionFive(){
        String question = """
                Question 5:
                Which one of these decreases the level of carbon dioxide in our atmosphere?
                
                A. Driving non-electric cars
                B. Planting trees.
                C. Cutting down trees
                D. Travelling in planes.
                """;
        return question;
    }


}
