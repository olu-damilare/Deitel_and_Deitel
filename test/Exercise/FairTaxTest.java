package Exercise;

import chapterFive.FairTax;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairTaxTest {
    FairTax fairTax;
    @BeforeEach
    void setUp(){
        fairTax = new FairTax();
    }

    @AfterEach
    void tearDown(){
        fairTax = null;
    }
    @Test
    void testForSingleExpenseValue(){
        fairTax.setExpense(100.00);
        assertEquals(100, fairTax.getTotalExpense());
    }
    @Test
    void testForTotalOfMultipleExpenses(){
        fairTax.setExpense(100.00);
        fairTax.setExpense(200.00);
        fairTax.setExpense(300.00);
        assertEquals(600, fairTax.getTotalExpense());
    }
    @Test
    void testForTaxRateOfTotalExpenses(){
        fairTax.setExpense(100.00);
        fairTax.setExpense(200.00);
        fairTax.setExpense(300.00);

        assertEquals(180, fairTax.CalculateTax());
    }
    @Test
    void testThatNegativeExpenseValueNotValid(){
        fairTax.setExpense(-100.00);
        fairTax.setExpense(200.00);
        fairTax.setExpense(-300.00);
        assertEquals(200, fairTax.getTotalExpense());
    }
}
