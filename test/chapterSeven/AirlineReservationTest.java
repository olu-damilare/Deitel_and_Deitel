package chapterSeven;

import chapterSeven.airlineReservation.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineReservationTest {
    Aeroplane aeroplane;
    NewAirline airline;
    FlightReservation reservation;

    @BeforeEach
    void setUp(){
        aeroplane = new Aeroplane("Airforce1");
        airline = new NewAirline("Dana Airline", aeroplane);
        reservation = new FlightReservation();
    }
    @AfterEach
    void tearDown(){
        aeroplane=null;
        airline=null;
        reservation = null;
    }

    @Test
    void testThatAirlineCanBeCreated() {
        assertEquals("""
                NewAirline{
                Airline Name='Dana Airline'
                Number of aeroplanes='1'}""", airline.toString());
    }

    @Test
    void testThatAirlineCanHaveAeroplanes(){
        assertEquals(1, airline.getTotalNumberOfAeroplanes());
        Aeroplane secondAeroplane = new Aeroplane("Eagles");
        airline.acquireAeroplane(secondAeroplane);
        assertEquals(2, airline.getTotalNumberOfAeroplanes());
    }

   @Test
    void testThatAeroplaneHasFiftySeats(){
        assertEquals(50, aeroplane.getNumberOfSeatsInPlane());
   }
   @Test
    void testThatAirlineHasFlightDetails(){
        FlightDetails flightDetails = new FlightDetails();
        assertEquals("FlightDetails{\n" +
                "Number Of Passengers = 0\n" +
                "Host Details = null\n" +
                "Pilot Details = null\n" +
                "Passenger Info = null\n" +
                "Flight  Number = 0\n" +
                "}", flightDetails.toString());
   }
   @Test
    void testThatPassengerCanReserveFirstClassSeat(){
        Passenger passenger = new Passenger("Olu Jola", "0000", "bin@jolo.com");

        reservation.reserveFlight(passenger, SeatType.FIRSTCLASS);

        assertTrue(reservation.hasReserved(passenger));
        assertEquals(1, reservation.getReservationID(passenger));
        assertEquals(SeatType.FIRSTCLASS, reservation.getPassengerReservedSeatType(passenger));
   }
    @Test
    void testThatPassengerCanReserveBusinessClassSeat(){
        Passenger passenger = new Passenger("Olu Jola", "0000", "bin@jolo.com");
        reservation.reserveFlight(passenger, SeatType.BUSINESS);

        assertTrue(reservation.hasReserved(passenger));
        assertEquals(1, reservation.getReservationID(passenger));
        assertEquals(SeatType.BUSINESS, reservation.getPassengerReservedSeatType(passenger));
    }

    @Test
    void testThatPassengerCanReserveEconomyClassSeat(){
        Passenger passenger = new Passenger("Olu Jola", "0000", "bin@jolo.com");

        reservation.reserveFlight(passenger, SeatType.ECONOMY);

        assertTrue(reservation.hasReserved(passenger));
        assertEquals(1, reservation.getReservationID(passenger));
        assertEquals(SeatType.ECONOMY, reservation.getPassengerReservedSeatType(passenger));
    }

@Test
    void testThatMultiplePassengersCanReserveFirstClassSeats(){
    Passenger passenger1 = new Passenger("Olu Jola", "0000", "bin@jolo.com");
    Passenger passenger2 = new Passenger("John Doe", "1234", "john@doe.com");

    reservation.reserveFlight(passenger1, SeatType.FIRSTCLASS);
    reservation.reserveFlight(passenger2, SeatType.FIRSTCLASS);

    assertTrue(reservation.hasReserved(passenger1));
    assertTrue(reservation.hasReserved(passenger2));
    assertEquals(1, reservation.getReservationID(passenger1));
    assertEquals(2, reservation.getReservationID(passenger2));
    assertEquals(SeatType.FIRSTCLASS, reservation.getPassengerReservedSeatType(passenger1));
    assertEquals(SeatType.FIRSTCLASS, reservation.getPassengerReservedSeatType(passenger2));

}
    @Test
    void testThatMultiplePassengersCanReserveBusinessClassSeats(){
        Passenger passenger1 = new Passenger("Olu Jola", "0000", "bin@jolo.com");
        Passenger passenger2 = new Passenger("John Doe", "1234", "john@doe.com");

        reservation.reserveFlight(passenger1, SeatType.BUSINESS);
        reservation.reserveFlight(passenger2, SeatType.BUSINESS);

        assertTrue(reservation.hasReserved(passenger1));
        assertTrue(reservation.hasReserved(passenger2));
        assertEquals(SeatType.BUSINESS, reservation.getPassengerReservedSeatType(passenger1));
        assertEquals(SeatType.BUSINESS, reservation.getPassengerReservedSeatType(passenger2));

    }
    @Test
    void testThatMultiplePassengersCanReserveEconomyClassSeats(){
        Passenger passenger1 = new Passenger("Olu Jola", "0000", "bin@jolo.com");
        Passenger passenger2 = new Passenger("John Doe", "1234", "john@doe.com");

        reservation.reserveFlight(passenger1, SeatType.ECONOMY);
        reservation.reserveFlight(passenger2, SeatType.ECONOMY);

        assertTrue(reservation.hasReserved(passenger1));
        assertTrue(reservation.hasReserved(passenger2));
        assertEquals(1, reservation.getReservationID(passenger1));
        assertEquals(2, reservation.getReservationID(passenger2));
        assertEquals(SeatType.ECONOMY, reservation.getPassengerReservedSeatType(passenger1));
        assertEquals(SeatType.ECONOMY,reservation.getPassengerReservedSeatType(passenger2));

    }

    @Test
    void testThatPassengerCanCancelReservation(){
        Passenger passenger = new Passenger("Olu Jola", "0000", "bin@jolo.com");

        reservation.reserveFlight(passenger, SeatType.BUSINESS);
        assertTrue(reservation.hasReserved(passenger));
        assertEquals(1, reservation.getReservationID(passenger));
        assertEquals(SeatType.BUSINESS, reservation.getPassengerReservedSeatType(passenger));

        reservation.cancelReservation(passenger);
        assertFalse(reservation.hasReserved(passenger));
        assertEquals(0, reservation.getReservationID(passenger));
        assertNull(reservation.getPassengerReservedSeatType(passenger));
    }

    @Test
    void testThatPassengerCanBookFirstClassSeatWithReservationID(){
        Passenger passenger = new Passenger("Olu Jola", "0000", "bin@jolo.com");
        reservation.reserveFlight(passenger, SeatType.FIRSTCLASS);
        assertTrue(FlightReservation.hasReserved(passenger));

        FlightBooking.bookFlight(reservation.getReservationID(passenger));
        assertTrue(FlightBooking.isBooked(reservation.getReservationID(passenger)));
        assertEquals(1, FlightBooking.getTotalNumberOfFirstClassSeatsBooked());
        assertEquals(SeatType.FIRSTCLASS, FlightBooking.getPassengerBookedSeatType(passenger));
    }



}
