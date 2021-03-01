package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        int largestNumber = 0;
        int secondLargestNumber = 0;
        int numberOfInputCollected = 0;

        Scanner input = new Scanner(System.in);
        int number;

        while(numberOfInputCollected < 10) {
            System.out.println("Input a number ");
            number = input.nextInt();

            if(number > secondLargestNumber) {
                if (number > largestNumber) {
                    secondLargestNumber = largestNumber;
                    largestNumber = number;
                }
                else
                    secondLargestNumber = number;
            }
            numberOfInputCollected++;
        }

        System.out.printf("The largest number is %d%n", largestNumber);
        System.out.printf("The second largest number is %d", secondLargestNumber);
    }
}
