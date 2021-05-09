package chapterEight;

import chapterSix.GreatestCommonDivisor;

import java.text.NumberFormat;
import java.util.Objects;

public class Rational {


    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        int greatestCommonDivisor = GreatestCommonDivisor.calculateGreatestCommonDivisor(numerator, denominator);
        if(denominator < 0)
            this.numerator = (-1 * numerator) / greatestCommonDivisor;
        else if(denominator > 0)
            this.numerator = numerator / greatestCommonDivisor;
        else
           this.numerator = 0;

        this.denominator = Math.abs(denominator) / greatestCommonDivisor;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
