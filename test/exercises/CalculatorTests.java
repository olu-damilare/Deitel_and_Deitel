package tddClasses;

import Exercise.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    void testToAddTwoNumbers(){
        assertEquals(10, Calculator.calculate("3+7"));
        assertEquals(800, Calculator.calculate("100+200+500"));
    }
    @Test
    void testToSubtractTwoNumbers(){
        assertEquals(-4, Calculator.calculate("3-7"));
    }

    @Test
    void testToMultiplyTwoNumbers(){
        assertEquals(21, Calculator.calculate("3*7"));
    }
    @Test
    void testObtainQuotientOfTwoNumbers(){
        assertEquals(2, Calculator.calculate("7/3"));
    }
    @Test
    void testToAddMultipleNumbers(){
        assertEquals(27, Calculator.calculate("3+7+4+5+7+1"));
    }
    @Test
    void testToSubtractMultipleNumbers(){
        assertEquals(-14, Calculator.calculate("3-4-5-7-1"));
    }
    @Test
    void testToMultiplyMultipleNumbers(){
        assertEquals(2940, Calculator.calculate("3*7*4*5*7*1"));
    }
    @Test
    void testToObtainTheQuotientOfMultipleNumbers(){
        assertEquals(7, Calculator.calculate("120/2/2/2/2"));
    }
}
