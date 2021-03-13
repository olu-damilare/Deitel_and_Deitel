package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundingNumbersTest {


    @Test
    void testToRoundNumbers(){
        assertEquals(-3, Round.roundNumbers(-3.4));
        assertEquals(9, Round.roundNumbers(8.6));
        assertEquals(16, Round.roundNumbers(15.7));
        assertEquals(3, Round.roundNumbers(2.8));
    }

    @Test
    void testToRoundDecimalToTenth(){
     assertEquals(3.9,Round.roundNumberToTenth(3.87));
        assertEquals(-5.7,Round.roundNumberToTenth(-5.67));
    }

    @Test
    void testToRoundDecimalToHundredth(){
        assertEquals(3.87,Round.roundNumberToHundredth(3.87));
        assertEquals(-5.67,Round.roundNumberToHundredth(-5.67));
        assertEquals(123.46,Round.roundNumberToHundredth(123.456));
        assertEquals(-321.12,Round.roundNumberToHundredth(-321.123));
    }

    @Test
    void testToRoundDecimalToThousandth(){
        assertEquals(123.456,Round.roundNumberToThousandth(123.456));
        assertEquals(-321.123,Round.roundNumberToThousandth(-321.123));
        assertEquals(3.87,Round.roundNumberToThousandth(3.87));
        assertEquals(-5.67,Round.roundNumberToThousandth(-5.67));
    }
}
