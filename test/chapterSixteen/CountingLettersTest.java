package chapterSixteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingLettersTest {

    @Test
    void testToCountOccurrenceOfLettersInAString(){
        CountingLetters counter = new CountingLetters();
        String message = "This is a boy";
        counter.count(message);
        assertEquals("""
                Map contains
                Key Value
                  a 1
                  b 1
                  h 1
                  i 2
                  o 1
                  s 2
                  t 1
                  y 1
                  """, counter.displayCounts());
    }
}
