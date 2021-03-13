package chapterSix;

public class Round {
    public static double roundNumbers(double input) {
        double roundedNumber = Math.floor(input + 0.5);

        return roundedNumber;
    }

    public static double roundNumberToTenth(double input) {
        double roundedNumber = Math.floor(input * 10 + 0.5)/10;

        return roundedNumber;
    }

    public static double roundNumberToHundredth(double input) {
        double roundedNumber = Math.floor(input * 100 + 0.5)/100;

        return roundedNumber;
    }

    public static double roundNumberToThousandth(double input) {
        double roundedNumber = Math.floor(input * 1000 + 0.5)/1000;

        return roundedNumber;
    }
}
