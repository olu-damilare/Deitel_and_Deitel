package chapterEight;

import java.text.NumberFormat;

public class Rational {


    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        if(denominator % numerator == 0){
            this.numerator = 1;
            this.denominator = denominator/numerator;}
        else {
            this.numerator = numerator;
            this.denominator = denominator;}
    }

    public static Rational add(Rational firstRationalNumbers, Rational secondRationalNumbers) {
        int denominator = firstRationalNumbers.getDenominator() * secondRationalNumbers.getDenominator();
        int numerator = (firstRationalNumbers.getDenominator() * secondRationalNumbers.getNumerator()) +
                (secondRationalNumbers.getDenominator() * firstRationalNumbers.getNumerator());
        return new Rational(numerator, denominator);
    }

    public static Rational subtract(Rational firstRationalNumbers, Rational secondRationalNumbers) {
        int denominator = firstRationalNumbers.getDenominator() * secondRationalNumbers.getDenominator();
        int numerator = (firstRationalNumbers.getDenominator() * secondRationalNumbers.getNumerator()) -
                (secondRationalNumbers.getDenominator() * firstRationalNumbers.getNumerator());
        return new Rational(numerator, denominator);
    }

    public static Rational multiply(Rational firstRationalNumbers, Rational secondRationalNumbers) {
        int denominator = firstRationalNumbers.getDenominator() * secondRationalNumbers.getDenominator();
        int numerator = firstRationalNumbers.getNumerator() * secondRationalNumbers.getNumerator();
        return new Rational(numerator, denominator);
    }

    public static Rational divide(Rational firstRationalNumbers, Rational secondRationalNumbers) {
        int denominator = firstRationalNumbers.getDenominator() * secondRationalNumbers.getNumerator();
        int numerator = firstRationalNumbers.getNumerator() * secondRationalNumbers.getDenominator();
        return new Rational(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String getFloatingPoints(int decimalPointsPrecision) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(decimalPointsPrecision);
        return nf.format((numerator * 1.0)/denominator);
    }
}
