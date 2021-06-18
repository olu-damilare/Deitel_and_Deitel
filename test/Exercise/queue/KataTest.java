package exercises;

import Exercise.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    private Kata kata;
    @BeforeEach
    void startEachMethodWith(){
        kata = new Kata();
    }

    @Test
    void testThatMethodDoesNotTakeNegativeQuantity(){
        kata.testDriller(-1);
        assertEquals(0, kata.getAmount());
    }
    @Test
    void testThatMethodCanReturnAmountAfterTakingQuantity(){
        kata.testDriller(2);
        assertEquals(3000.00, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenOneAndFour(){
        kata.testDriller(4);
        assertEquals(1500.00 * 4, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenOneAndNine(){
        kata.testDriller(7);
        assertEquals(1400.00 * 7, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenTenAndTwentyNine(){
        kata.testDriller(15);
        assertEquals(1200.00 * 15, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenThirtyAndFortyNine(){
        kata.testDriller(35);
        assertEquals(1100.00 * 35, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenFiftyAndNinetyNine(){
        kata.testDriller(85);
        assertEquals(1000.00 * 85, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsBetweenHundredAndOneHundredAndNinetyNine(){
        kata.testDriller(150);
        assertEquals(900.00 * 150, kata.getAmount());
    }
    @Test
    void testForAmountIfQuantityIsEqualToOrAboveTwoHundred(){
        kata.testDriller(1000);
        assertEquals(800.00 * 1000, kata.getAmount());
    }
    @Test
    void testForTheFactorsOfANumber(){
        String factors =kata.calculateFactors(10);
        assertEquals("1,2,5,10", factors);
    }
    @Test
    void testThatFactorMethodCannotInputNegativeValue(){
       String factors = kata.calculateFactors(-10);
        assertEquals("invalid input", factors);
    }
    @Test
    void testForSumOfArrayElements(){
        int[] array = {1,-2,3,4,5};
      assertEquals(11, Kata.sumArray(array));
    }
    @Test
    void testForAverageOfArrayElements(){
        int[] array = {1,2,3,4,5};
        assertEquals(3, Kata.averageArray(array));
    }
    @Test
    void testForMaximumArrayElement(){
        int[] array = {1,2,3,4,-5};
        assertEquals(4, Kata.getMaximumArrayElement(array));
        int[] array2 = {11,21,13,34,25};
        assertEquals(34, Kata.getMaximumArrayElement(array2));
    }
    @Test
    void testForMinimumArrayElement(){
        int[] array = {7,21,32,14,35};
        assertEquals(7, Kata.getMinimumArrayElement(array));
        int[] array2 = {11,21,1,34,25};
        assertEquals(1, Kata.getMinimumArrayElement(array2));
    }
    @Test
    void testForMaximumSumOfAnArrayLessByOneIndex(){
        int[] array = {1,2,3,4,5};
        assertEquals(14, Kata.getMaximumSumInArray(array));
    }
    @Test
    void testForMinimumSumOfAnArrayLessByOneIndex(){
        int[] array = {1,2,3,4,5};
        assertEquals(10, Kata.getMinimumSumInArray(array));
    }
    @Test
    void testThatArrayOfNumbersCanBeShuffled(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(10, array[9]);
        kata.shuffle(array);
        assertFalse(Arrays.equals(array, new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    @Test
    void testThatShuffledArrayCanBeSortedInAscendingOrder(){
        int[] array = {12,32,13,64,50,62,17,38,39,19};
        assertEquals(19, array[9]);
        kata.shuffle(array);
        assertFalse(Arrays.equals(array, new int[]{12,32,13,64,50,62,17,38,39,19}));
        kata.sort(array, true);
        assertTrue(Arrays.equals(array, new int[]{12, 13, 17, 19, 32, 38, 39, 50, 62, 64}));
    }
    @Test
    void testThatShuffledArrayCanBeSortedInDescendingOrder(){
        int[] array = {12,32,13,64,50,62,17,38,39,19};
        assertEquals(19, array[9]);
        kata.shuffle(array);
        assertFalse(Arrays.equals(array, new int[]{12,32,13,64,50,62,17,38,39,19}));
        kata.sort(array, false);
        assertTrue(Arrays.equals(array, new int[]{64, 62, 50, 39, 38, 32, 19, 17, 13, 12}));
    }

}
