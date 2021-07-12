package chapterNineteen;


public class BubbleSort {


    public static void sort(int[] array) {

        int largestNum = array[array.length - 1];
        int temp;
        boolean isSwapped;
        for (int i = array.length-1; i >= 0; i--) {
            isSwapped = false;
            for (int j = i - 1; j >= 0; j--) {
                if (largestNum < array[j]) {
                    temp = array[j];
                    array[j] = largestNum;
                    largestNum = temp;
                    isSwapped = true;
                }
            }
            array[i] = largestNum;

            if ((i - 1) != - 1) largestNum = array[i - 1];

            if(!isSwapped) break;
        }
    }




}

