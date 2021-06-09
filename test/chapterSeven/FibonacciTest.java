package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonnaciTest {

    @Test
    void testToObtainTheNthFibonnaciNumber() {
        int n = -1;
        assertEquals(55, Fibonnaci.calculateFibonnaci(n));
    }
}
