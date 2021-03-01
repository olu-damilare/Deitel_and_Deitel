package Exercise;

import java.util.Scanner;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        int largestInteger;
        int smallestInteger;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        largestInteger = smallestInteger = input.nextInt();

        for (int i = 1; i < 10 ; i++) {
            System.out.println("Enter a number");
            int userInput = input.nextInt();

            if (userInput > largestInteger) {
                largestInteger = userInput;
            }
            else if(userInput < smallestInteger)
                smallestInteger = userInput;
        }
            System.out.println("The largest number is " + largestInteger);
            System.out.println("The smallest number is " + smallestInteger);
        }

}
