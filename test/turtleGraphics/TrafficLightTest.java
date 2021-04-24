package turtleGraphics;

import org.junit.jupiter.api.Test;

import static chapterEight.TrafficLight.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightTest {

    @Test
    void testThatRedLightHasADuration(){
        assertEquals("50 seconds", RED.getDuration());
    }
    @Test
    void testThatYellowLightHasADuration(){
        assertEquals("5 seconds", YELLOW.getDuration());
    }
    @Test
    void testThatGreenLightHasADuration(){
        assertEquals("60 seconds", GREEN.getDuration());
    }
}
