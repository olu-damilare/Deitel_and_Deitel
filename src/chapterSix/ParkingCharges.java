package chapterSix;

public class ParkingCharges {
    private double charges;

    public void calculateCharges(double hours) {
        if(hours > 0) {
            charges = 2.00;
            if (hours > 3)
                for (int i = 0; i < (hours - 3); i++) {
                    charges += 0.50;
                    if(charges == 10.00)
                        break;
                }
        }

    }

    public double getCharges() {
        return charges;
    }
}
