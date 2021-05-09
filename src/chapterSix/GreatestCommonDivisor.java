package chapterSix;

public class GreatestCommonDivisor {

    public int calculateGreatestCommonDivisor(int numerator, int denominator){
        denominator = Math.abs(denominator);
        numerator = Math.abs(numerator);
        int greatestCommonDivisor = 1;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if(numerator % i == 0 && denominator % i == 0)
                greatestCommonDivisor = i;
        }
        return greatestCommonDivisor;
    }
}
