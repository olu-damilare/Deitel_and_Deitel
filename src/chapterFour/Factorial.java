package chapterFour;

public class Factorial {
    public int calculateFactorial(int number){
        int factorial = 1;
        while(number > 0){
            factorial *= number;
            number--;
        }
        return factorial;
    }
}
