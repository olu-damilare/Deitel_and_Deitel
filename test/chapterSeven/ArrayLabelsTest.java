package chapterSeven;

import org.junit.jupiter.api.Test;

public class ArrayLabelsTest {

    @Test
    void testToLabelArrayInputSequence(){
        int[][] array = new int[3][5];
        int[][] label = new int[3][5];
        int labelCounter = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = 0;
                label[row][column] = ++labelCounter;
                System.out.print(label[row][column]);
            }

        }
    }
}
