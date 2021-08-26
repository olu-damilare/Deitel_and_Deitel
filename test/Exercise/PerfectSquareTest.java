package Exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectSquareTest {
    PerfectSquare calculator;

    @BeforeEach
    void setUp(){
        calculator = new PerfectSquare();
    }

    @Test
    void testForPerfectSquareOfASquare(){
        int length = 3;
        int breadth = 3;
        assertEquals(13,calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testForPerfectSquareOfLengthLessThanBreadth(){
        int length = 4;
        int breadth = 5;
        assertEquals(40,calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testForPerfectSquareOfLengthGreaterThanBreadth(){
        int length = 5;
        int breadth = 4;
        assertEquals(40,calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testForLengthAndBreadthEqualsOne(){
        int length = 1;
        int breadth = 1;
        assertEquals(1,calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testThatLengthLessThanOneThrows_InvalidInputException(){
        int length = 0;
        int breadth = 1;
        assertThrows(IllegalArgumentException.class, ()-> calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testThatBreadthLessThanOneThrows_InvalidInputException(){
        int length = 1;
        int breadth = -1;
        assertThrows(IllegalArgumentException.class, ()-> calculator.calculatePerfectSquare(length, breadth));
    }

    @Test
    void testToCalculateThePerfectSquareOfMultipleSquares(){
        int numberOfSquares = 2;
        int[] output = {13, 40};
        assertTrue(Arrays.equals(output, calculator.calculatePerfectSquare(numberOfSquares, 3, 3, 4, 5)));
    }

    @Test
    void testThatNumberOfSquaresToCalculateNotMatchingProvidedDimensions_throwIllegalArgumentException(){
        int numberOfSquares = 2;
        assertThrows(IllegalArgumentException.class, ()-> calculator.calculatePerfectSquare(numberOfSquares, 3, 3, 4, 5, 5, 5));
    }

    @Test
    void testForNumberOfSquaresLessOne(){
        int numberOfSquares = 0;
        assertTrue(Arrays.equals(new int[]{0}, calculator.calculatePerfectSquare(numberOfSquares, 3, 3, 4, 5)));
        assertTrue(Arrays.equals(new int[]{0}, calculator.calculatePerfectSquare(-1, 3, 3, 4, 5)));
    }

    @Test
    void testForNullDimensionOfSquares(){
        int numberOfSquares = 0;
        assertTrue(Arrays.equals(new int[]{0}, calculator.calculatePerfectSquare(numberOfSquares, null)));
    }
}
