package tddClasses;

import chapterFive.GlobalWarmingQuiz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalWarmingQuizTest {

    private GlobalWarmingQuiz globalWarming;

    @BeforeEach
    void setUp(){
        globalWarming = new GlobalWarmingQuiz();
    }
    @AfterEach
    void tearDown(){
        globalWarming = null;
    }
    @Test
    void testTotalScore(){
        globalWarming.selectAnswer("A");
        globalWarming.selectAnswer("B");
        globalWarming.selectAnswer("C");
        globalWarming.selectAnswer("D");
        globalWarming.selectAnswer("A");
        assertEquals(5, globalWarming.getTotalScore());
        }

    @Test
    void testToValidateUserSelectionIsWithinRange(){
        globalWarming.selectAnswer("F");
        globalWarming.selectAnswer("Z");
        assertEquals(0, globalWarming.getTotalScore());
    }


}
