package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormatsTest {

    @Test
    void testThatDateFormatCanBeModified(){
        DateFormat date = new DateFormat("04/25/1955");
        assertEquals(4, date.getNumericMonth());
        assertEquals(25, date.getDay());
        assertEquals(1955, date.getYear());

        assertEquals("April", date.getMonth());
        assertEquals("April 25, 1955", date.toString());
    }


}
