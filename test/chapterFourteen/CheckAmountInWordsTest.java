package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckAmountInWordsTest {

    @Test
    void testForAmountLessThanOne(){
        CheckProtection check = new CheckProtection();
        assertEquals("43/100", check.writeAmountInWords(0.43));
        assertEquals("05/1000", check.writeAmountInWords(0.05));
        assertEquals("3/10", check.writeAmountInWords(0.30));
    }


    @Test
    void testForAmountLessHundred(){
        CheckProtection check = new CheckProtection();
        assertEquals("ONE and 99/100", check.writeAmountInWords(1.99));
        assertEquals("FIFTY FIVE and 76/100", check.writeAmountInWords(55.76));
        assertEquals("TWELVE and 29/100", check.writeAmountInWords(12.29));
    }

    @Test
    void testForAmountLessOneThousand(){
        CheckProtection check = new CheckProtection();
        assertEquals("ONE HUNDRED and 0/1000", check.writeAmountInWords(100.00));
        assertEquals("THREE HUNDRED and 18/100", check.writeAmountInWords(300.18));
        assertEquals("SIX HUNDRED and THIRTY EIGHT and 73/100", check.writeAmountInWords(638.73));

    }

}
