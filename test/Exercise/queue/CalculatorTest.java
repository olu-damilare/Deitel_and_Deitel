package Exercise.queue;

import Exercise.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void startAllTestsWIth(){
        calculator = new Calculator();
    }

   @Test
    void addTwoNumbers() {

        assertEquals(5,calculator.add(3,2));
    }

    @Test
    @DisplayName("Test to divide two numbers")
    void divideTwoNumbersTest(){
       assertEquals(2, calculator.divide(6,3));
    }

    @Test
    void divideTwoNumbersAndYieldFloatValue(){
       assertEquals(5.5, calculator.divide(11,2));
    }

    @Test
    @DisplayName("Test to divide a number by zero and yield zero")
    void divideANumberByZeroAndYieldZero(){
        assertEquals(0, calculator.divide(3,0));
   }

   @Test
    void subtractTwoNumbers(){
        assertEquals(3, calculator.subtract(10, 7));
   }

   @Test
    void subtractTwoNumbersAndYieldAbsoluteValue(){
        assertEquals(4, calculator.subtract(6, 10));
   }

   @Test
    void multiplyTwoNumbers(){
        assertEquals(12, calculator.multiply(4, 3));
   }
}