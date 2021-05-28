package tddClasses;

public class RollDieMain {

    public static void main(String[] args) {

        for (int i = 1; i <= 6000; i++) {
            RollDie.generateFace();
            RollDie.countGeneratedFace();
        }
        System.out.printf("%5s%8s%n", "face", "count");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%5d%8d%n", i, RollDie.displayFaceCount(i));   ;

        }
    }
}
