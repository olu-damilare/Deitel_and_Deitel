package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VargsProductTest {

    @Test
    void testToMultiplyValuesOfVaryingLengthOfArray(){
        VargsProduct vargs = new VargsProduct();
        int[] firstSetOfNumbers = {1,2,3,4};
        int[] secondSetOfNumbers = {3,4,5,2,1,4,5,6};
        int[] thirdSetOfNumbers = {4,5,4,3,2,4,5,5,6,4,2,2};

        assertEquals(24, vargs.arrayProduct(firstSetOfNumbers));
        assertEquals(14400, vargs.arrayProduct(secondSetOfNumbers));
        assertEquals(4608000, vargs.arrayProduct(thirdSetOfNumbers));
        }
}
