package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerAssistedInstructionTest {
    ComputerAssistedInstruction computer;
    @BeforeEach
    void setUp() {
        computer = new ComputerAssistedInstruction();
}

    @Test
    void testThatFirstOperandCanBeRandomlyGenerated(){
        assertNotEquals(computer.generateFirstOperand(),computer.generateFirstOperand());
    }
    @Test
    void testThatSecondOperandCanBeRandomlyGenerated(){
        assertNotEquals(computer.generateSecondOperand(),computer.generateSecondOperand());
    }
    @Test
    void testThatMathematicalOperatorCanBeRandomlyGenerated(){
        char firstRandomOperator =  computer.generateRandomOperator();
        char secondRandomOperator =  computer.generateRandomOperator();
        assertNotEquals(firstRandomOperator, secondRandomOperator);
    }
    @Test
    void testThatMathematicalExpressionCanBeDisplayed(){
        int firstOperand = computer.generateFirstOperand();
        int secondOperand = computer.generateSecondOperand();
        char operator = computer.generateRandomOperator();
       String expression =  computer.displayQuestion();

       assertEquals(expression, firstOperand + " " + operator + " " + secondOperand);
    }

    @Test
    void testThatUserCanSelectMathematicalOperator(){
        computer.difficultyLevel(1);
        int firstOperand = computer.generateFirstOperand();
        int secondOperand = computer.generateSecondOperand();
        computer.userSelectedOperator(1);
        computer.calculateResult();
        assertEquals(computer.getResult(), firstOperand + secondOperand);
        computer.userSelectedOperator(2);
        computer.calculateResult();
        assertEquals(computer.getResult(), firstOperand - secondOperand);
        computer.userSelectedOperator(3);
        computer.calculateResult();
        assertEquals(computer.getResult(), firstOperand / secondOperand);
        computer.userSelectedOperator(4);
        computer.calculateResult();
        assertEquals(computer.getResult(), firstOperand * secondOperand);

    }
    @Test
    void testThatUserCanSelectValidMathematicalOperator() {
        computer.difficultyLevel(1);
        int firstOperand = computer.generateFirstOperand();
        int secondOperand = computer.generateSecondOperand();
        computer.userSelectedOperator(6);

        assertEquals("Invalid selection", firstOperand + secondOperand);

    }
}
