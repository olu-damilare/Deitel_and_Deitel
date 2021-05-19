package chapterSeven;

import java.security.SecureRandom;

public class Craps {
    private SecureRandom randomGenerator = new SecureRandom();
    private CrapStatus status = CrapStatus.NEW;
    private int points;

    public int rollDice(){
        int firstDie = 1 + randomGenerator.nextInt(6);
        int secondDie = 1 + randomGenerator.nextInt(6);
        int sum = firstDie + secondDie;

        return sum;
    }
    public void play(){
       int result = rollDice();

       if(status == CrapStatus.NEW) {
           points = result;
           if(result == 7 || result == 11) {
               status = CrapStatus.WON;
           } else if ((result == 2 || result == 3 || result == 12)) {
               status = CrapStatus.LOST;
           }
           status = CrapStatus.CONTINUE;
       } else {
           if(points == result)
               status = CrapStatus.WON;
           else if(result == 7)
               status = CrapStatus.LOST;
       }
    }
    public CrapStatus getGameStatus(){
        return status;
    }


}
