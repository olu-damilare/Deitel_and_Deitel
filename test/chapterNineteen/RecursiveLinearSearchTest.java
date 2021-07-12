package chapterNineteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveLinearSearchTest {

    @Test
    void testToSortAKeyRecursively(){
        int[] nums = {30,15,32,26,25,17,22,12};
        LinearSearch search = new LinearSearch();
        assertEquals(3, search.search(nums, 26, 0));
    }
}
