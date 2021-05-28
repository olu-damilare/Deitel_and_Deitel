package tddClasses;

import Exercise.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartEndPositionTest {

    @Test
    void testThatFirstAndLastPositionOfValueInArrayCanBeObtained(){

        int[] nums = {0,8,-2,5,0,2,4,6,0};
        int val = 8;

        int[] newList = Position.getFirstAndLast(nums, val);
        System.out.println(newList[0]);
        System.out.println(newList[1]);
    }
}
