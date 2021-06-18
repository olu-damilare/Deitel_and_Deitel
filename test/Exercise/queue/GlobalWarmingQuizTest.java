package Exercise.queue;

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

    @Test
    void testThatTheCaseOfTheSelectedOptionIsIgnored(){
        globalWarming.selectAnswer("a");
        globalWarming.selectAnswer("b");
        globalWarming.selectAnswer("c");
        globalWarming.selectAnswer("d");
        globalWarming.selectAnswer("a");
        assertEquals(5, globalWarming.getTotalScore());
    }
    @Test
    void testToSetQuestionOne(){
        assertEquals("Question 1:\n" +
                "\n" +
                "Which of the following does not trap heat?\n" +
                "A. Carbon dioxide\n" +
                "B. Nitrogen\n" +
                "C. Water vapor\n" +
                "D. Methane\n", globalWarming.questionOne());
    }

    @Test
    void testToObtainExcellentResult(){
        globalWarming.selectAnswer("A");
        globalWarming.selectAnswer("B");
        globalWarming.selectAnswer("C");
        globalWarming.selectAnswer("D");
        globalWarming.selectAnswer("A");
        assertEquals("Excellent", globalWarming.result());

        }

    @Test
    void testToObtainResultForTotalScoreIsFour(){
        globalWarming.selectAnswer("A");
        globalWarming.selectAnswer("B");
        globalWarming.selectAnswer("C");
        globalWarming.selectAnswer("D");
        globalWarming.selectAnswer("F");
        assertEquals("Very good", globalWarming.result());
    }

    @Test
    void testToObtainResultForTotalScoreLessThanFour(){
        globalWarming.selectAnswer("A");
        globalWarming.selectAnswer("B");
        globalWarming.selectAnswer("C");
        assertEquals("""
                    Time to brush up your knowledge of global warming.
                    for more information on climate change, lookup:
                    www.climate.nasa.gov, 
                    www.environmentalsciencedegree.com/climate-change/,
                    www.greenfacts.org/en/climate-change-ar3/ 
                    """,
                globalWarming.result());
    }



}
