package chapterFour;

public class ExponentOfFactorial {
    private int input;

    public void setInput(int number) {
        input = number;
    }

    public int getInput() {
        return input;
    }

    public int calculateFactorial(int input) {
        int factorial;
        setInput(input);
        Factorial calculate = new Factorial();
      factorial = calculate.calculateFactorial(getInput());

      return factorial;
    }


    public double calculateExponentialOfFactorial(int input) {
        double exponential = 0;
        if(input > 0) {
            exponential = 1;

            for (int i = 1; i <= input; i++) {
                exponential += Math.pow(input, i) / calculateFactorial(i);
            }
        }
        return exponential;
    }
}
