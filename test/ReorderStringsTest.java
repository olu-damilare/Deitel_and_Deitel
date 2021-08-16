import Exercise.ReorderStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReorderStringsTest {

    @Test
    void testToReorder(){
        String input = "is2 Thi1s T4est 3a";
        ReorderStrings.reorder(input);
        assertEquals("Thi1s is2 3a T4est", ReorderStrings.reorder(input));
    }
}
