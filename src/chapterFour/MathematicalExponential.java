package chapterFour;

public class MathematicalExponential {

    public double calculateExponential(double number){
        Factorial factorial = new Factorial();
        double exponential = 1;

        int incrementalFactorial = 1;
        while(incrementalFactorial <= number){
            exponential += (1.0/(factorial.calculateFactorial(incrementalFactorial)));
            incrementalFactorial++;
        }
        return exponential;
    }
}
