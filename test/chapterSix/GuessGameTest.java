package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessGameTest {

    @Test
    void testThaMethodCanGenerateRandomNumbersWithinGivenRange(){
        int firstRandomNumber = GuessGame.generateNumberToGuess();
        int secondRandomNumber = GuessGame.generateNumberToGuess();
        assertNotEquals(firstRandomNumber, secondRandomNumber);
    }
    @Test
    void testToCompareGuessedNumberIsCorrect(){
        int numberToGuess = GuessGame.generateNumberToGuess();
       assertEquals("Too low, try again.", GuessGame.validateGuessedNumber(9));
    }
    @Test
    void testToCommentOnNumberOfGuessesBeforeCorrectGuess(){
        int numberToGuess = GuessGame.generateNumberToGuess();





    }
}
