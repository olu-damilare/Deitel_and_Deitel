package chapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class RollDiceSum {
    Random random = new Random();

    @Test
    void testToCountTheFrequencyOfSumOfDiceRolled(){
        int[] facesSumCount = new int[11];
        int firstDieFace;
        int secondDieFace;
        int sum;
        for (int i = 0; i < 1000; i++) {
            firstDieFace = 1 + random.nextInt(6);
            secondDieFace = 1 + random.nextInt(6);
            sum = firstDieFace + secondDieFace;

            switch (sum) {
                case 2 -> facesSumCount[0]++;
                case 3 -> facesSumCount[1]++;
                case 4 -> facesSumCount[2]++;
                case 5 -> facesSumCount[3]++;
                case 6 -> facesSumCount[4]++;
                case 7 -> facesSumCount[5]++;
                case 8 -> facesSumCount[6]++;
                case 9 -> facesSumCount[7]++;
                case 10 -> facesSumCount[8]++;
                case 11 -> facesSumCount[9]++;
                case 12 -> facesSumCount[10]++;
            }

        }
        sum = 2;
        System.out.printf("%s%13s%n", "Sum", "Frequency");
        for (int frequency : facesSumCount) {
            System.out.printf("%02d%9d%n", sum, frequency);
            sum++;
        }



    }
}
