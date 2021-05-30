package exercises;

import Exercise.RandomPrimeNumberWithinAGivenRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class RandomPrimeNumberWithinAGivenRangeTest {
    RandomPrimeNumberWithinAGivenRange primeNumber;
    @BeforeEach
    void startEachMethodWith(){
        primeNumber = new RandomPrimeNumberWithinAGivenRange();
    }

    @Test
    void testThatMethodCanPrintARandomNumberWithinARange(){
       int randomNumber = primeNumber.randomPrimeNumber(1, 1);
        assertEquals(1, randomNumber);
        randomNumber = primeNumber.randomPrimeNumber(3, 3);
       assertEquals(3, randomNumber);
    }

    @Test
    void testThatMethodCanCheckForRandomPrimeNumbersWithinAGivenRange(){
        int randomNumber = primeNumber.randomPrimeNumber(4,5);
        assertEquals(5, randomNumber);
    }
    @Test
    void testThatMethodCannotReceiveNegativeArgumentRangeValue(){
        int randomNumber = primeNumber.randomPrimeNumber(8,-9);
        assertEquals(0, randomNumber);
    }
    @Test
    void testThatStartValueCannotBeGreaterThanRangeValue(){
        int randomNumber = primeNumber.randomPrimeNumber(8,2);
        assertEquals(0, randomNumber);
    }

}
