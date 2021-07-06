package chapterEighteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMinValueTest {

    @Test
    void testToFindTheMinimumNumberInArray(){
        ArrayMinValue determinant = new ArrayMinValue();
        int[] nums = {4,2,5,6,4,3,1};
        assertEquals(1, determinant.findRecursiveMinimum(nums, nums.length));
    }
}
