package Exercise;

public class CalculateProducts {
    public static int[] calculateProducts(int[] array){
        if ( array == null || array.length == 0)
            return new int[]{0};
        if (array.length == 2)
            return array;

        int product = 1;
        for (int i : array) product *= i;
        for (int i = 0; i < array.length; i++) array[i] = product / array[i];
        return array;
    }
}
