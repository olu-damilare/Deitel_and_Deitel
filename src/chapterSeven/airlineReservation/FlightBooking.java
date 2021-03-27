package chapterSeven.airlineReservation;

import java.util.ArrayList;
import java.util.List;

public class FlightBooking {
    private static int seatCount;
    private static boolean[] isBooked = new boolean[50];
    private static List<Passenger> bookedPassengers = new ArrayList<>();

    public static void bookFlight(int reservationID) {
        if(reservationID > 0){
            Passenger reservedPassenger = FlightReservation.getReservedPassenger().get(reservationID - 1);
                if(FlightReservation.hasReserved(reservedPassenger)) {
                    bookedPassengers.add(reservedPassenger);
                    isBooked[seatCount] = true;
                    seatCount++;
                }

        }else
            System.out.println("passenger has not reserved a seat");

    }

    public static boolean isBooked(int seatNumber){
        return isBooked[seatNumber];
    }

    public static int getTotalNumberOfFirstClassSeatsBooked() {
        int bookedSeats = 0;
        for (boolean b : isBooked) {
            if (b)
                bookedSeats++;
        }
        return bookedSeats;
    }

    public static SeatType getPassengerBookedSeatType(Passenger passenger) {
        for (int i = 0; i < bookedPassengers.size(); i++) {
            if(bookedPassengers.get(i).equals(passenger))
                return  bookedPassengers.get(i).getPassengerSeatType();
        }
        return null;
    }


}
