package chapterEight;

public class Complex {
    private final int realNumber;
    private final int imaginaryNumber;

    public Complex(int realNumber, int imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;

    }

    public static String add(Complex complexNumberOne, Complex complexNumberTwo) {
        double realNumber = complexNumberOne.getRealNumber() + complexNumberTwo.getRealNumber();
        double imaginaryNumber = complexNumberOne.getImaginaryNumber() + complexNumberTwo.getImaginaryNumber();

        if(imaginaryNumber >= 0)
        return realNumber + " + " + imaginaryNumber + "i";
        else
        return realNumber + " - " + imaginaryNumber + "i";
    }

    public static String subtract(Complex complexNumberOne, Complex complexNumberTwo) {
        double realNumber = complexNumberOne.getRealNumber() - complexNumberTwo.getRealNumber();
        double imaginaryNumber = complexNumberOne.getImaginaryNumber() - complexNumberTwo.getImaginaryNumber();

        if(imaginaryNumber >= 0)
            return realNumber + " + " + imaginaryNumber + "i";
        else
            return realNumber + " - " + imaginaryNumber + "i";
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }
}
