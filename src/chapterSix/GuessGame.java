package Exercise;


import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        int correctNumber = 25;

        String message = "Enter an input to guess my number";
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        while(userInput != correctNumber){
            System.out.println("You're wrong, try again");
            userInput = input.nextInt();
        }
        System.out.println("You win!!!");
    }





}
