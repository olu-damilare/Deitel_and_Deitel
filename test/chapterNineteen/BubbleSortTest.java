package chapterNineteen;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTest {

    @Test
    void testToBubbleSort(){

        int[] nums = {30,15,32,26,25,17,22,12};
        BubbleSort.sort(nums);
        assertTrue(Arrays.equals(new int[]{12, 15, 17, 22, 25, 26, 30, 32}, nums));
    }
}
