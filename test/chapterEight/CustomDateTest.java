package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomDateTest {

    @Test
    void testThatDateCanBeNumerical(){
        CustomDate date = new CustomDate(9, 27, 1985);
        assertEquals("09/27/1985", date.toString());
    }
    @Test
    void testThatDayIsValid(){
        try {
            CustomDate date = new CustomDate(9, 36, 1985);
            assertEquals("09/00/1985", date.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    void testThatMonthIsValid(){
        try {
            CustomDate date = new CustomDate(50, 21, 1985);
            assertEquals("00/21/1985", date.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void testThatYearIsValid(){
        try {
            CustomDate date = new CustomDate(7, 21, 3000);
            assertEquals("00/21/0000", date.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    void testThatDateCanBeCreatedUsingMonthName(){
        CustomDate date = new CustomDate("June", 27, 1985);
        assertEquals("June 27, 1985", date.getDate());
    }
    @Test
    void testThatStringMonthMustBeValid(){
        assertThrows(IllegalArgumentException.class, ()->  {CustomDate date = new CustomDate("jjjj", 27, 1985);});
    }
    @Test
    void testThatDateCanCompriseDayAndYearOnly(){
        CustomDate date = new CustomDate(120, 1985);
        assertEquals("120 1985", date.getDayValueDate());
    }
    @Test
    void testThatDayMustBeValidInDateThatCompriseDayAndYearOnly(){
        assertThrows(IllegalArgumentException.class, ()->  {CustomDate date = new CustomDate(400, 1985);});
    }

}
