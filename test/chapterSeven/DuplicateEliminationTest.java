package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DuplicateEliminationTest {
    DuplicateElimination duplicateElimination;
    @BeforeEach
    void setUp(){
        duplicateElimination = new DuplicateElimination();
    }
    @Test
    void testThatInputsAreBetween_10_And_100(){


    }

    @Test
    void testThatSecondInputIsUniqueFromFirstInputPassedIntoTheArray(){
        duplicateElimination.inputCollection(34);
        duplicateElimination.inputCollection(15);
        duplicateElimination.inputCollection(100);
        duplicateElimination.inputCollection(73);
        duplicateElimination.inputCollection(49);
        assertEquals("34,15,100,73,49,", duplicateElimination.displayUniqueInputs());
    }
}
