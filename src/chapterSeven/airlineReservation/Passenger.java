package chapterSeven.airlineReservation;

import java.util.Objects;

public class Passenger {


    private final String name;
    private int passengerId = 0;
    private final String phoneNumber;
    private String emailAddress;
    private SeatType passengerSeatType;
    private static int passengerIDCounter;


    public Passenger(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;


       passengerId = ++passengerIDCounter;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void setPassengerSeatType(SeatType seatType){
        passengerSeatType = seatType;
    }

    public SeatType getPassengerSeatType(){
        return passengerSeatType;
    }

    public int getPassengerId() {
        return passengerId;
    }
}
