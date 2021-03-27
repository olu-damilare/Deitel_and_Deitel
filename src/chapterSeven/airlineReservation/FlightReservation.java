package chapterSeven.airlineReservation;

import java.util.ArrayList;
import java.util.List;

public class FlightReservation {
    private static List<Passenger> reservedPassengers = new ArrayList<>();

    public void reserveFlight(Passenger passenger, SeatType seatType) {
        reservedPassengers.add(passenger);
        passenger.setPassengerSeatType(seatType);
    }

    public int getReservationID(Passenger passenger){
        int passengerReservationID = 0;
        for (int i = 0; i < reservedPassengers.size(); i++) {
            if(reservedPassengers.get(i).equals(passenger))
                passengerReservationID = i + 1;
        }
        return passengerReservationID;
    }

    public static boolean hasReserved(Passenger passenger) {
        boolean isReserved = false;
        for (Passenger value : reservedPassengers) {
            if (value.equals(passenger)) {
                isReserved = true;
                break;
            }
        }
        return isReserved;
    }

    public SeatType getPassengerReservedSeatType(Passenger passenger) {
        for (int i = 0; i < reservedPassengers.size(); i++) {
            if(reservedPassengers.get(i).equals(passenger))
            return  reservedPassengers.get(i).getPassengerSeatType();
        }
        return null;
    }

    public void cancelReservation(Passenger passenger) {
        for (int i = 0; i < reservedPassengers.size(); i++) {
            if(reservedPassengers.get(i).equals(passenger))
                reservedPassengers.remove(i);
        }
    }

    public static List<Passenger> getReservedPassenger(){
        return reservedPassengers;
    }
}
