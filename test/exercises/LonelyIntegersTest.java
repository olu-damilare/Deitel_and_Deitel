package tddClasses;

import Exercise.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LonelyIntegersTest {
    @Test
    void testThatUniqueIntegerIsObtained(){
        int[] numbers = {1,2,3,4,3,2,1,4,5,6,2,3,5,2,2};
        System.out.println(Array.obtainLonelyInteger(numbers));
//        assertEquals(6, Array.obtainLonelyInteger(numbers));
    }
}
