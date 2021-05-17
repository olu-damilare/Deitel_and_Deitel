package chapterEight;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;


public class HugeIntegerTest {

    @Test
    void testThatStringCanBeParsedToHugeInteger(){
        HugeInteger hugeInteger = new HugeInteger();
        String number = "1234567122453544556489";
        hugeInteger.parse(number);
        assertEquals(new BigInteger(number), hugeInteger.getValue());
    }

    @Test
    void testThatHugeIntegersCanBeAdded(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        String firstNumber = "1234";
        String secondNumber = "5678";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(BigInteger.valueOf(6912), HugeInteger.add(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatHugeIntegersCanBeSubtracted(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        String firstNumber = "1234";
        String secondNumber = "5678";
        firstHugeInteger.parse(firstNumber);
        secondHugeInteger.parse(secondNumber);
        assertEquals(BigInteger.valueOf(-4444), HugeInteger.subtract(firstHugeInteger, secondHugeInteger));
    }
    @Test
    void testThatFirstHugeIntegerIsEqualToAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        HugeInteger thirdHugeInteger = new HugeInteger();
        firstHugeInteger.parse("1234");
        secondHugeInteger.parse("5678");
        thirdHugeInteger.parse("1234");
        assertFalse(firstHugeInteger.isEqualTo(secondHugeInteger));
        assertTrue(firstHugeInteger.isEqualTo(thirdHugeInteger));
    }

    @Test
    void testThatFirstHugeIntegerIsNotEqualToAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("1234");
        secondHugeInteger.parse("5678");
        assertTrue(firstHugeInteger.isNotEqualTo(secondHugeInteger));
    }

    @Test
    void testThatFirstHugeIntegerGreaterThanAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("67843029920029");
        secondHugeInteger.parse("48593038482");
        assertTrue(firstHugeInteger.isGreaterThan(secondHugeInteger));
    }
    @Test
    void testThatFirstHugeIntegerLessThanAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("20029");
        secondHugeInteger.parse("48593038482");
        assertTrue(firstHugeInteger.isLessThan(secondHugeInteger));
    }

    @Test
    void testThatFirstHugeIntegerIsGreaterThanOrEqualToAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        HugeInteger thirdHugeInteger = new HugeInteger();
        firstHugeInteger.parse("67843029920029");
        secondHugeInteger.parse("48593038482");
        thirdHugeInteger.parse("67843029920029");
        assertTrue(firstHugeInteger.isGreaterThanOrEqualTo(secondHugeInteger));
        assertTrue(firstHugeInteger.isGreaterThanOrEqualTo(thirdHugeInteger));
    }

    @Test
    void testThatProductOfTwoHugeIntegersCanBeObtained(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("10000");
        secondHugeInteger.parse("10000");
        assertEquals(BigInteger.valueOf(100_000_000), HugeInteger.product(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatQuotientOfTwoHugeIntegersCanBeObtained(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("10000");
        secondHugeInteger.parse("100");
        assertEquals(BigInteger.valueOf(100), HugeInteger.divide(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatRemainderOfTwoHugeIntegersCanBeObtained(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        firstHugeInteger.parse("125384902");
        secondHugeInteger.parse("24522");
        assertEquals(BigInteger.valueOf(3916), HugeInteger.remainder(firstHugeInteger, secondHugeInteger));
    }

    @Test
    void testThatFirstHugeIntegerIsLessThanOrEqualToAnotherHugeInteger(){
        HugeInteger firstHugeInteger = new HugeInteger();
        HugeInteger secondHugeInteger = new HugeInteger();
        HugeInteger thirdHugeInteger = new HugeInteger();
        firstHugeInteger.parse("48593038482");
        secondHugeInteger.parse("48593038482");
        thirdHugeInteger.parse("67843029920029");
        assertTrue(firstHugeInteger.isLessThanOrEqualTo(secondHugeInteger));
        assertTrue(firstHugeInteger.isLessThanOrEqualTo(thirdHugeInteger));
    }

    @Test
    void testThatHugeIntegerIsZero(){
        HugeInteger firstHugeInteger = new HugeInteger();
        firstHugeInteger.parse("");
        assertTrue(firstHugeInteger.isZero());
    }


}
