package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RationalTest {

    @Test
    void TestThatTwoRationalNumbersCanBeAdded() {
    Rational firstRationalNumbers = new Rational(2, 4);
    Rational secondRationalNumbers = new Rational(3, 5);
    Rational rational = Rational.add(firstRationalNumbers, secondRationalNumbers);
    assertEquals(11, rational.getNumerator());
    assertEquals(10, rational.getDenominator());
}
    @Test
    void TestThatTwoRationalNumbersCanBeSubtracted() {
        Rational firstRationalNumbers = new Rational(2, 6);
        Rational secondRationalNumbers = new Rational(3, 5);
        Rational rational = Rational.subtract(firstRationalNumbers, secondRationalNumbers);
        assertEquals(4, rational.getNumerator());
        assertEquals(15, rational.getDenominator());
    }
    @Test
    void TestThatTwoRationalNumbersCanBeMultiplied() {
        Rational firstRationalNumbers = new Rational(2, 6);
        Rational secondRationalNumbers = new Rational(3, 5);
        Rational rational = Rational.multiply(firstRationalNumbers, secondRationalNumbers);
        assertEquals(1, rational.getNumerator());
        assertEquals(5, rational.getDenominator());
    }
    @Test
    void TestThatTwoRationalNumbersCanBeDivided() {
        Rational firstRationalNumbers = new Rational(2, 6);
        Rational secondRationalNumbers = new Rational(3, 5);
        Rational rational = Rational.divide(firstRationalNumbers, secondRationalNumbers);
        assertEquals(5, rational.getNumerator());
        assertEquals(9, rational.getDenominator());
    }
    @Test
    void TestThatFractionalRepresentationOfRationalNumberCanBeObtained() {
        Rational rational = new Rational(2, 6);
        assertEquals("0.333", rational.getFloatingPoints(3));
    }

    @Test
    void TestThatTwoRationalNumbersAreEqual() {
        Rational firstRationalNumbers = new Rational(2, 6);
        Rational secondRationalNumbers = new Rational(1, 3);
        assertTrue(firstRationalNumbers.equals(secondRationalNumbers));
    }
}
