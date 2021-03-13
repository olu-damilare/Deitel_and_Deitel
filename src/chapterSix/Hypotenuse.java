package chapterSix;

public class Hypotenuse {

    public static double calculateSquareOfSide(double sideValue) {
        return sideValue * sideValue;
    }

    public static double calculateSumOfSidesSquared(double side1, double side2) {
        double side1Squared = calculateSquareOfSide(side1);
        double side2Squared = calculateSquareOfSide(side2);

        return side1Squared + side2Squared;
    }

    public static double calculateHypotenuse(double side1, double side2) {
        double hypotenuse = Math.sqrt(calculateSumOfSidesSquared(side1, side2));

        return hypotenuse;
    }
}
