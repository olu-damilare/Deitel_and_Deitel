package chapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentOfFactorialTest {
    ExponentOfFactorial exponential;
    @BeforeEach
    void setUp() {
       exponential = new ExponentOfFactorial();
    }

    @AfterEach
    void tearDown() {
        exponential = null;
    }

    @Test
    void testThatMethodReceivesInput(){
        exponential.setInput(2);
        assertEquals(2, exponential.getInput());
    }

    @Test
    void testThatMethodCanCalculateFactorialOfInput(){
        exponential.setInput(5);
     int factorial = exponential.calculateFactorial(exponential.getInput());
     assertEquals(120,factorial);
    }


    @Test
    void testForExponentOfFactorial(){
       double exponent = exponential.calculateExponentialOfFactorial(3);

       assertEquals(13.0, exponent);
    }

    @Test
    void testThatMethodDoesNotCalculateExponentLessThanOne(){
        double exponent = exponential.calculateExponentialOfFactorial(-1);
        assertEquals(0.0, exponent);

        exponent = exponential.calculateExponentialOfFactorial(0);
        assertEquals(0.0, exponent);

    }
}
