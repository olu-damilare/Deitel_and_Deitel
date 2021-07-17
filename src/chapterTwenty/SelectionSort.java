package chapterTwenty;


public class SelectionSort {

    public static <T extends Comparable<T>> void sort(T[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            int smallest = i;

            for (int index = i + 1; index < inputArray.length; index++) {
                if (inputArray[index].compareTo(inputArray[smallest]) < 0) {
                    smallest = index;
                }
            }
            T temporary = inputArray[i];
            inputArray[i] = inputArray[smallest];
            inputArray[smallest] = temporary;

        }
    }
}
