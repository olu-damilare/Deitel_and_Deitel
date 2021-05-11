package chapterSix;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class MathematicsTest {

    @Test
    void testThatSecondIntegerIsMultipleOfFirstInteger(){
        assertTrue(Mathematics.isMultiple(2, 10));
        assertFalse(Mathematics.isMultiple(-4, 15));
        assertTrue(Mathematics.isMultiple(-8, 24));
        assertTrue(Mathematics.isMultiple(4, -16));
        assertFalse(Mathematics.isMultiple(10, 2));
    }

    @Test
    void testForEvenNumber(){
        assertTrue(Mathematics.isEven(8));
        assertFalse(Mathematics.isEven(11));
        assertTrue(Mathematics.isEven(-6));
        assertFalse(Mathematics.isEven(-13));
    }

    @Test
    void testToDisplaySquareOfAsterisks(){
        assertEquals("**\n**", Mathematics.displayAsterisks(2));
        assertEquals("***\n***\n***", Mathematics.displayAsterisks(3));
    }

    @Test
    void testToDisplaySquareOfAnyCharacterOfAnyGivenSize(){
      assertEquals("@@\n@@", Mathematics.displaySquareOfCharacter('@', 2));
        assertEquals("###\n###\n###", Mathematics.displaySquareOfCharacter('#', 3));
    }

    @Test
    void testToCalculateAreaOfCircle(){
      assertEquals(50.26548245743669, Mathematics.calculateAreaOfCircle(4));
    }
    @Test
    void testForPerfectNumber(){
      assertTrue(Mathematics.isPerfect(6));
        assertFalse(Mathematics.isPerfect(8));
    }
    @Test
    void testToDisplayFactorsOfPerfectNumber(){
        assertEquals("1 2 3", Mathematics.displayFactorsOfPerfectNumber(6));
        assertEquals("Not a perfect number", Mathematics.displayFactorsOfPerfectNumber(8));
    }

    @Test
    void testThatIsPrimeNumber(){
       assertTrue(Mathematics.isPrime(5));
        assertFalse(Mathematics.isPrime(4));
    }

    @Test
    void testThatMethodCanReverseDigitsOfANumber(){
        assertEquals("0321", Mathematics.reverseNumber(1230));
        assertEquals("54321", Mathematics.reverseNumber(12345));
        assertEquals("-54321", Mathematics.reverseNegativeNumber(-12345));
    }
    @Test
    void testThatMethodReversesNegativeNumber(){
     assertEquals("-4321", Mathematics.reverseNegativeNumber(-1234));
        assertEquals("-54321", Mathematics.reverseNegativeNumber(-12345));
    }
    @Test
    void testThatMethodConvertsDecimalToHexadecimal(){
        assertEquals(700, Mathematics.decimalToHexadecimal(1792));
        assertEquals(642, Mathematics.decimalToHexadecimal(1602));
    }
    @Test
    void testThatMethodConvertsDecimalToOctaldecimal(){
        assertEquals(3400, Mathematics.decimalToOctaDecimal(1792));
        assertEquals(10, Mathematics.decimalToOctaDecimal(8));
        assertEquals(7, Mathematics.decimalToOctaDecimal(7));
    }



}
