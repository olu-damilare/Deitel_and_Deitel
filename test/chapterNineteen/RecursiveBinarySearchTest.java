package chapterNineteen;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveBinarySearchTest {

    @Test
    void testToSortAKeyRecursively(){
        int[] nums = {30,15,32,26,25,17,22,12};
        Arrays.sort(nums);
        BinarySearch search = new BinarySearch();
        assertEquals(0, search.search(nums, 12, 0, nums.length - 1));
    }
}
