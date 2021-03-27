package chapterSeven.airlineReservation;

public class Seat {
    private int seatNumber;
    private SeatType seatType;

    public void assignSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public void assignSeatType(SeatType seatType){
       this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
