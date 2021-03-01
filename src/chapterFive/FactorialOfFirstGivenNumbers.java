package chapterFive;

public class FactorialOfFirstGivenNumbers{

    public void calculateAndListGivenNumbersFactorial(int factorialDisplayLimit){
        long factorial = 1L;

        System.out.printf("%s%15s%n", "Number", "Factorial");
        for(int i = 1; i <= factorialDisplayLimit; i++){
            factorial *= i;
            System.out.println(i + "\t\t\t" + factorial);
        }
    }
}
