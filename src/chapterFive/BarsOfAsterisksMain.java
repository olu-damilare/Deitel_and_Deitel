package chapterFive;

import java.util.Scanner;

public class BarsOfAsterisksMain {
    public static void main(String[] args) {
        BarsOfAsterisks bars = new BarsOfAsterisks();

        System.out.println("Enter a number between 1 and 30");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        System.out.println("Enter a number between 1 and 30");
        int secondNumber = input.nextInt();

        System.out.println("Enter a number between 1 and 30");
        int thirdNumber = input.nextInt();

        System.out.println("Enter a number between 1 and 30");
        int fourthNumber = input.nextInt();

        System.out.println("Enter a number between 1 and 30");
        int fifthNumber = input.nextInt();


            System.out.println(bars.printBarsOfAsterisks(firstNumber));
            System.out.println(bars.printBarsOfAsterisks(secondNumber));
            System.out.println(bars.printBarsOfAsterisks(thirdNumber));
            System.out.println(bars.printBarsOfAsterisks(fourthNumber));
            System.out.println(bars.printBarsOfAsterisks(fifthNumber));


    }
}

