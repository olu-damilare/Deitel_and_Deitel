package chapterFour;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        int milesDriven = 0;
        int gallonsUsed = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of miles driven in this trip or -1 to quit");
        milesDriven = input.nextInt();

        if (milesDriven != -1) {
            System.out.println("Input the amount of gallons used for the trip");
            gallonsUsed = input.nextInt();
        }
        while(milesDriven != -1){
            double milesPerGallon = ((double) milesDriven) / gallonsUsed;
            total += milesPerGallon;

            System.out.printf("in this trip, you travelled at rate of %.2f%s%n",  milesPerGallon,  " miles per gallon");
            System.out.printf("Total miles per gallon so far = %.2f%n%n", total);

            System.out.println("Input the number of miles driven in this trip or -1 to quit");
            milesDriven = input.nextInt();
            if (milesDriven != -1) {
                System.out.println("Input the amount of gallons used for the trip");
                gallonsUsed = input.nextInt();
            }
        }
    }
}