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


        }

}
