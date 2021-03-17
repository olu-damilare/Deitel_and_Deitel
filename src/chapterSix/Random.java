package chapterSix;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            int number = 1;
            for (int j = 0; j < 8 ; j++) {
                number = 6 + random.nextInt(17);
                if(number == 6 || number == 10 || number == 14 || number == 18 ||  number == 22) {
                    System.out.print(number + " ");
                    break;
                }
            }
        }

                
    }
}
