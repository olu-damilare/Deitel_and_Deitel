package tddClasses;

import Exercise.DuplicateElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EliminateDuplicateTest {

    @Test
    void testThatDuplicateElementInArrayIsEliminated(){
        int[] numbers = {0,0,1,1,2,2,3,3,4,4,5,6,7,7};
        int[] secondNumbers = {-1,0,2,4,-3,-3,5};
        assertEquals(14, numbers.length);

       assertEquals(8, DuplicateElements.eliminateDuplicates(numbers));
        assertEquals(6, DuplicateElements.eliminateDuplicates(secondNumbers));
        String[] nums = new String[0];
        System.out.println(nums.length);
    }
}
