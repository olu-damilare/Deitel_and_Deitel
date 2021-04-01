package chapterSeven;

public class DuplicateElimination {
    private int[] array = new int[5];

    public String displayUniqueInputs() {
        String arrayValues = "";
        for (int number : array) {
            arrayValues += number + ",";
        }
        return arrayValues;
    }

    public void inputCollection(int input) {
        boolean inputIsInvalid = input < 10 || input > 100;
        for (int i = 0; i < array.length; i++) {
            if (inputIsInvalid)
               throw new IllegalArgumentException("Number should be between 10 and 100");
            else if(input == array[i])
                throw new IllegalArgumentException("Number already exists");
            else
                if(array[i] == 0){
                array[i] = input;
                break;
            }
        }
    }
}
