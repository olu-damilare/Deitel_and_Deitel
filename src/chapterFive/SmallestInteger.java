package chapterFive;

import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {

        System.out.println("How many numbers do you want to compare? ");
        Scanner input = new Scanner(System.in);
        int counterLimit = input.nextInt();
        System.out.println();

        System.out.println("Input a number ");
         int smallestNumber = input.nextInt();

        for (int i = 1; i < counterLimit ; i++) {
            System.out.println("Input a number ");
            int number = input.nextInt();

            if (number < smallestNumber){
                smallestNumber = number;
            }
        }
        System.out.printf("%s%d", "The smallest integer is ", smallestNumber);
    }

}
