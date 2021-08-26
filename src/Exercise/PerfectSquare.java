package Exercise;

import java.util.Arrays;

public class PerfectSquare {
    public int calculatePerfectSquare(int length, int breadth) {
        if(length < 1 || breadth < 1) throw new IllegalArgumentException("Input should not be less than 1.");

        if(length > breadth){
          return calculatePerfectSquare(breadth, length);
        }
        if(length == 1 && breadth == 1){
            return 1;
        }
        int product = length * breadth;
        int result;

        if(length == breadth) {
            result = calculateForEqualLengths(breadth, product);
        }else{
            result = calculateForEqualLengths(breadth, product);
            int difference = Math.abs(length - breadth);
            result -= difference;
        }

        return result;
    }

    private int calculateForEqualLengths(int breadth, int product) {
        int result = 0;
        for (int i = 1; i < breadth; i++) {
            result += product / i;
        }
        return result;
    }

    public int[] calculatePerfectSquare(int numberOfSquares, int... dimensionOfSquares) {
        if(numberOfSquares < 1 || dimensionOfSquares == null) return new int[]{0};
        if(dimensionOfSquares.length / numberOfSquares != 2)
            throw new IllegalArgumentException("The number of squares to calculate must match the provided dimensions");

        int[] output = new int[numberOfSquares];
        int dimensionOfSquareCounter = 1;
        int length;
        int breadth;
        int outputCounter = 0;

        while(dimensionOfSquareCounter < dimensionOfSquares.length){
            length = dimensionOfSquares[dimensionOfSquareCounter - 1];;
            breadth = dimensionOfSquares[dimensionOfSquareCounter];
            output[outputCounter] = calculatePerfectSquare(length, breadth);

            outputCounter++;
            dimensionOfSquareCounter += 2;

        }

        return output;

    }


}
