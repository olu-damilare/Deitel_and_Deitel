package chapterSix;

import java.util.Scanner;

public class RoundedMain {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number to round its value to the nearest integer");
        Scanner input = new Scanner(System.in);
        double userInput = input.nextDouble();
        double roundedNumber = Round.roundNumbers(userInput);
        System.out.printf("The initial value of the number you provided is %f and its new value is %f%n",
                userInput, roundedNumber);

        System.out.println("Enter a decimal number to round its value to the nearest tenth");
        userInput = input.nextDouble();
        roundedNumber = Round.roundNumberToTenth(userInput);
        System.out.printf("The initial value of the number you provided is %f and its new value is %f%n",
                userInput, roundedNumber);

        System.out.println("Enter a decimal number to round its value to the nearest Hundredth");
        userInput = input.nextDouble();
        roundedNumber = Round.roundNumberToHundredth(userInput);
        System.out.printf("The initial value of the number you provided is %f and its new value is %f%n",
                userInput, roundedNumber);

        System.out.println("Enter a decimal number to round its value to the nearest thousandth");
        userInput = input.nextDouble();
        roundedNumber = Round.roundNumberToThousandth(userInput);
        System.out.printf("The initial value of the number you provided is %f and its new value is %f%n",
                userInput, roundedNumber);





    }
}
