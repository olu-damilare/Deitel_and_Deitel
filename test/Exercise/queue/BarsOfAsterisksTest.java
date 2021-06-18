package exercises;

import chapterFive.BarsOfAsterisks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarsOfAsterisksTest {

    @Test
    void testThatMethodCanPrintAsterisk(){
        BarsOfAsterisks bars = new BarsOfAsterisks();

        assertEquals("*",bars.printBarsOfAsterisks(1));
    }
    @Test
    void testThatMethodCanPrintAsteriskBasedOnValueOfInput(){
        BarsOfAsterisks bars = new BarsOfAsterisks();
        assertEquals("**",bars.printBarsOfAsterisks(2));
    }
    @Test
    void testThatMethodCannotTakeValuesLessThanOne(){
        BarsOfAsterisks bars = new BarsOfAsterisks();
        assertEquals(null,bars.printBarsOfAsterisks(0));
        assertEquals(null,bars.printBarsOfAsterisks(-10));
    }
}
