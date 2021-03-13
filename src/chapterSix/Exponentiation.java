package chapterSix;

public class Exponentiation {

    public static double integerPower(double base, int exponent) {
        double newValue = 0;
        if(exponent > 0 ) {
            newValue = 1;
            for (int i = 0; i < exponent; i++) {
                newValue *= base;
            }
            return newValue;
        }
        else
            return newValue;

    }
}
