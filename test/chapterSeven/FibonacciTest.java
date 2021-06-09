package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void testToObtainTheNthFibonacciNumber() {
        int n = 4;
        assertEquals(55, Fibonacci.calculateFibonacci(n));
    }
}
