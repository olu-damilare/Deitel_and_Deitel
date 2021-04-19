package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    void testThatComplexNumberCanBeCreated(){
        Complex complexNumber = new Complex(4,5);
        assertEquals(4, complexNumber.getRealNumber());
        assertEquals(5, complexNumber.getImaginaryNumber());
    }

    @Test
    void testThatTwoComplexNumbersCanBeAdded(){
        Complex complexNumberOne = new Complex(4,5);
        Complex complexNumberTwo = new Complex(4,5);
        assertEquals("8.0 + 10.0i", Complex.add(complexNumberOne, complexNumberTwo));
    }

    @Test
    void testThatTwoComplexNumbersCanBeSubtracted(){
        Complex complexNumberOne = new Complex(8,6);
        Complex complexNumberTwo = new Complex(4,5);
        assertEquals("4.0 + 1.0i", Complex.subtract(complexNumberOne, complexNumberTwo));
    }


}
