package chapterSix;


import java.security.SecureRandom;

public class GuessGame {
    private static int numberToGuess;
    private static int guessCount;

    public static int generateNumberToGuess() {
        SecureRandom random = new SecureRandom();
        numberToGuess = 1 + random.nextInt(1000);
        return numberToGuess;
    }

    public static String validateGuessedNumber(int number) {
        if(number > numberToGuess){
            guessCount++;
            return "Too high, try again.";
        }
        else if(number < numberToGuess){
            guessCount++;
            return "Too low, try again.";
        }
        else
            return "Congratulations. You guessed the number.";
    }
    public static String feedBack(){
        if(guessCount < 10)
            return "Either you know the secret or you got lucky!";
        else if(guessCount > 10)
            return "You should be able to do better! Why should it\n" +
                    "take no more than 10 guesses? Well, with each “good guess”.";
        else
            return "Aha! You know the secret.";
    }
}
