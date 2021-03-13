package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTest {

    @Test
    void testThatTheBaseIsRaisedByThePowerOfTheExponent(){
      assertEquals(81, Exponentiation.integerPower(3,4));
        assertEquals(15.625, Exponentiation.integerPower(2.5,3));
    }

    @Test
    void testThatExponentIsGreaterThanZero(){
        assertEquals(0, Exponentiation.integerPower(3,-2));
        assertEquals(0, Exponentiation.integerPower(2.5,0));
    }
}
