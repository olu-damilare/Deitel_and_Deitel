package exercises;


import Exercise.RollDie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RollDieTest {


    @Test
    void testThatMethodRandomlyGenerateFaceOfDie(){
     assertNotEquals(RollDie.generateFace(), RollDie.generateFace());
    }
    @Test
    void testThatGeneratedFaceIsCounted(){
        RollDie.generateFace();
        assertEquals(1, RollDie.countGeneratedFace());

    }
    @Test
    void testToDisplayCountOfGeneratedFace(){
        RollDie.generateFace();
        int count = RollDie.countGeneratedFace();
        assertEquals(1, RollDie.displayFaceCount(count));
    }
}
