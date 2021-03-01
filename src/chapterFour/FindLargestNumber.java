package chapterFour;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {

        int largestNumber = 0;
        int numberOfInputCollected = 0;

        Scanner input = new Scanner(System.in);
        int number;

        while(numberOfInputCollected < 10) {
            System.out.println("Input a number ");
            number = input.nextInt();
            if (number > largestNumber)
                largestNumber = number;
            numberOfInputCollected++;
        }

        System.out.printf("The largest number is %d", largestNumber);
    }
}
