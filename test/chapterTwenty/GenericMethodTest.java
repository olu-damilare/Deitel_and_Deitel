package chapterTwenty;

import chapterTwenty.GenericMethod.GenericMethod;
import chapterTwenty.GenericMethod.InvalidSubscriptException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenericMethodTest {

    @Test
    void TestToPrintSubscriptOfIntegerArray(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> subArray = GenericMethod.subArray(intArray, 1, 3);
        assertEquals(Arrays.asList(2, 3, 4), subArray);

    }

    @Test
    void testThatLowSubscriptLowerThanZero_throwsInvalidSubscriptException(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        assertThrows(InvalidSubscriptException.class, ()-> GenericMethod.subArray(intArray, -1, 3));
    }

    @Test
    void testThatLowSubscriptHigherThanLengthOfArray_throwsInvalidSubscriptException(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        assertThrows(InvalidSubscriptException.class, ()-> GenericMethod.subArray(intArray, intArray.length + 1, 3));
    }

    @Test
    void testThatHighSubscriptHigherThanLengthOfArray_throwsInvalidSubscriptException(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        assertThrows(InvalidSubscriptException.class, ()-> GenericMethod.subArray(intArray, 1, intArray.length + 1));
    }

    @Test
    void testThatHighSubscriptLowerThanZero_throwsInvalidSubscriptException(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        assertThrows(InvalidSubscriptException.class, ()-> GenericMethod.subArray(intArray, 1, -3));
    }

    @Test
    void testThatHighSubscriptLowerThanLowSubscript_throwsInvalidSubscriptException(){
        Integer[] intArray = {1, 2, 3, 4, 5};
        assertThrows(InvalidSubscriptException.class, ()-> GenericMethod.subArray(intArray, 3, 2));
    }
}
