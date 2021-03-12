package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingChargesTest {

    ParkingCharges parkingCharges;
    @BeforeEach
    void setUp() {
        parkingCharges = new ParkingCharges();
    }
    @Test
    void testForChargesBetweenOneToThreeHours(){
        parkingCharges.calculateCharges(1);
        assertEquals(2.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(2);
        assertEquals(2.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(3);
        assertEquals(2.00, parkingCharges.getCharges());
    }

    @Test
    void testChargesForAboveThreeHours(){
        parkingCharges.calculateCharges(4);
        assertEquals(2.50, parkingCharges.getCharges());
        parkingCharges.calculateCharges(5);
        assertEquals(3.00, parkingCharges.getCharges());
    }

    @Test
    void testThatHourIsNotLessThanOne(){
        parkingCharges.calculateCharges(0);
        assertEquals(0.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(-1);
        assertEquals(0.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(-2);
        assertEquals(0.00, parkingCharges.getCharges());
    }
    @Test
    void testThatMaximumChargePerHourDoesNotExceedTenDollars(){
        parkingCharges.calculateCharges(4);
        assertEquals(2.50, parkingCharges.getCharges());
        parkingCharges.calculateCharges(5);
        assertEquals(3.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(18);
        assertEquals(9.50, parkingCharges.getCharges());
        parkingCharges.calculateCharges(19);
        assertEquals(10.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(20);
        assertEquals(10.00, parkingCharges.getCharges());
        parkingCharges.calculateCharges(21);
        assertEquals(10.00, parkingCharges.getCharges());
    }

    @Test
    void testThatTheChargesForFractionalExcessOfTheHourIsCalculated(){
        parkingCharges.calculateCharges(3.1);
        assertEquals(2.50, parkingCharges.getCharges());
        parkingCharges.calculateCharges(5.5);
        assertEquals(3.50, parkingCharges.getCharges());
        parkingCharges.calculateCharges(18.5);
        assertEquals(10.00, parkingCharges.getCharges());
    }
}
