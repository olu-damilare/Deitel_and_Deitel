package Exercise;

import java.util.Arrays;

public class ShuffleClass {

    public static int[] shuffle(int[] numbers, int determinant){
        if(determinant == 0 && numbers != null) return numbers;
        if(numbers == null || numbers.length == 0) return new int[]{};
        if(numbers.length == Math.abs(determinant)) return numbers;

        int[] newCollection = new int[numbers.length];
        if(determinant < 0)
            determinant = numbers.length + (determinant % numbers.length);
        else
            determinant = determinant % numbers.length;
        int indexCounter = 0;

            for (int i = determinant; i < numbers.length; i++) {
                newCollection[indexCounter] = numbers[i];
                indexCounter++;
            }
            for (int i = 0; i < determinant; i++) {
                newCollection[indexCounter] = numbers[i];
                indexCounter++;
            }
        return newCollection;
    }

    public static void main(String[] args) {
      int[][] scores = new int[3][9];
//      int[][] scores = {{3,5,6,5}, {5,4}, {4,5,4,3,2,2,4,6,7,5,4,3}};
        scores[0] = new int[4];
        scores[1] = new int[10];
        scores[2] = new int[2];


        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]);
            }
            System.out.println();

        }
    }
}
