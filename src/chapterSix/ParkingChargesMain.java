package chapterSix;

import java.util.Scanner;

public class ParkingChargesMain {
    public static void main(String[] args) {

        ParkingCharges parkingCharges = new ParkingCharges();
        Scanner input = new Scanner(System.in);
        int customerID = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("How many hours did customer " + customerID + " park in the garage?");
            double hours = input.nextDouble();

            parkingCharges.calculateCharges(hours);
            System.out.println("The cost of parking for " + hours + " hours is $" + parkingCharges.getCharges() +"\n");

            customerID++;
        }

    }
}
