package tddClasses;

import java.security.SecureRandom;

public class RollDie {
    private static final SecureRandom random = new SecureRandom();
    private static int generatedFace;
    private static final  int[] die = new int[6];

    public static int generateFace() {
        generatedFace = 1 + random.nextInt(6);
        return generatedFace;
    }

    public static int countGeneratedFace() {
        die[generatedFace - 1]++;

        return die[generatedFace - 1];
    }
    public static int displayFaceCount(int face){
        try {
            return die[face - 1];
        }
        catch (ArrayIndexOutOfBoundsException exception ){
            System.out.println("Invalid Index value");
            return 0;
        }
    }


}
