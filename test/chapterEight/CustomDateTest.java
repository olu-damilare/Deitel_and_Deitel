package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomDateTest {

    @Test
    void testThatDateCanIsNumerical(){
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
}
