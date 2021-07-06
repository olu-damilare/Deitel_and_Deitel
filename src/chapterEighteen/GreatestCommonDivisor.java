package chapterEighteen;

public class GreatestCommonDivisor {

    public static int calculateGCD(int firstNumber, int secondNumber){
        if(secondNumber == 0) return firstNumber;

        return calculateGCD(secondNumber, (firstNumber % secondNumber));
    }


}
