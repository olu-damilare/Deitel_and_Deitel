package Exercise;

import Exercise.RemoveVal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveValTest {

    @Test
    void testToRemoveValAndReturnNewLengthOfArray(){
        int[] nums = {5,2,2,5,3};
        int val = 5;
        assertEquals(3, RemoveVal.remove(nums, val));
    }
}
