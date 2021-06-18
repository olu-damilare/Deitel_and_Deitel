package exercises;

import chapterFive.CalculatingSales;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatingSalesTest {
    CalculatingSales calculator;
    @BeforeEach
    void startEachMethodWith(){
        calculator = new CalculatingSales();
    }
    @Test
    void testForMethodThatTakesTheQuantity(){
        calculator.setQuantity(1);
        assertEquals(1, calculator.getQuantity());
    }
    @Test
    void testThatMethodCannotReceiveNegativeQuantity(){
        calculator.setQuantity(-1);
        assertEquals(0, calculator.getQuantity());
    }
    @Test
    void testForMethodThatTakesThePrice(){
        calculator.setPrice(100.50);
        assertEquals(100.50, calculator.getPrice());
    }
    @Test
    void testThatMethodCannotReceiveNegativePrice(){
        calculator.setPrice(-100.0);
        assertEquals(0, calculator.getPrice());
    }
    @Test
    void testForMethodThatMultipliesPriceAndQuantity (){
        calculator.setPrice(100.50);
        calculator.setQuantity(2);
        double product = calculator.product();
        assertEquals(201.00, product);
    }
    @Test
    void testForMethodThatMultipliesPriceAndQuantityRepeatedly (){
        calculator.setPrice(100.50);
        calculator.setQuantity(2);
        double product = calculator.product();
        assertEquals(201.00, product);

        calculator.setPrice(200.00);
        calculator.setQuantity(5);
        product = calculator.product();

        calculator.setPrice(1000.00);
        calculator.setQuantity(10);
        product = calculator.product();
        assertEquals(11201.00, product);
    }

}
