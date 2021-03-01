package chapterFour;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        int firstRowCounter = 1;
        int innerCounter = 1;
        int lastRowCounter = 1;
        int subInnerCounter = 0;
        String space = " ";

        System.out.println("Enter the size of the side of your square");
        Scanner input = new Scanner(System.in);
        int sizeOfSquare = input.nextInt();

        while(firstRowCounter <= sizeOfSquare){
            System.out.print("*  ");
            firstRowCounter++;
        }
        System.out.println();
        while(innerCounter <= (sizeOfSquare - 2)) {
            System.out.print("*  ");
            subInnerCounter = 0;
            while(subInnerCounter <= sizeOfSquare) {
                System.out.print(" ");
                subInnerCounter++;
            }
            System.out.println("*");
            innerCounter++;

        }
        while(lastRowCounter <= sizeOfSquare){
            System.out.print("*  ");
            lastRowCounter++;
        }

    }
}
