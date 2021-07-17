package chapterTwenty;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectionSortTest {

    @Test
    void testToSortIntegerArrayWithGenericMethod(){
        Integer[] nums = {5,3,8,7,4};
        SelectionSort.sort(nums);
        assertTrue(Arrays.equals(new Integer[]{3, 4, 5, 7, 8}, nums));
    }

    @Test
    void testToSortDoubleArrayWithGenericMethod(){
        Double[] nums = {5.4, 3.2, 8.1, 7.6, 4.9};
        SelectionSort.sort(nums);
        assertTrue(Arrays.equals(new Double[]{3.2, 4.9, 5.4, 7.6, 8.1}, nums));
    }
}
