package chapterSix;

import java.util.Scanner;

public class CoinTossMain {
    public static void main(String[] args) {
        CoinToss coin = new CoinToss();
        Scanner input = new Scanner(System.in);
        int toss;
        int face;

        do{
            System.out.println("Press any number to toss a coin or 0 to exit");
            toss = input.nextInt();
            if(toss == 1) {
                face = coin.flipCoin();
                System.out.println(coin.displayFace(face));
            }
            else System.out.println("Invalid input");

        }while(toss != 0);

        System.out.println("Total of Heads tossed: " + coin.getHeadCount());
        System.out.println("Total of Tails tossed: " + coin.getTailCount());
    }
}
