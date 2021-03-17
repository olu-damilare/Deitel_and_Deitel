package chapterSix;


import java.util.Scanner;

public class GuessGameMain {
    public static void main(String[] args) {
        boolean userWantsToKeepPlaying = true;

        while(userWantsToKeepPlaying) {
            int numberToGuess = GuessGame.generateNumberToGuess();
            System.out.println("Guess a number between 1 and 1000");
            Scanner scanner = new Scanner(System.in);
            int userGuess;

            do {
                userGuess = scanner.nextInt();
                System.out.println(GuessGame.validateGuessedNumber(userGuess));
            } while (userGuess != numberToGuess);

            System.out.printf("%n%s%n", GuessGame.feedBack());

            System.out.println("""
                    Do you want to play again?
                    Press any number to replay.
                    Press 0  quit.
                    """);
            int userChoice = scanner.nextInt();
            if(userChoice == 0)
                userWantsToKeepPlaying = false;
        }


        }


}
