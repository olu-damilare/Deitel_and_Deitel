package Exercise;


import java.util.Arrays;

public class CalculateProducts {
    public static int[] calculateProducts(int[] array){
        if (array == null || array.length == 0)
            return new int[]{};

        if (array.length == 1) return array;

        if (array.length == 2) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
            return array;
        }

        int zeroCount = 0;
        int product = 1;
        int savedZeroIndex = 0;
        boolean firstZeroIndexFound = false;

        for (int i = 0; i < array.length; i++){
            if(array[i] == 0) zeroCount++;
            if(zeroCount == 1  && !firstZeroIndexFound){
                savedZeroIndex = i;
                firstZeroIndexFound = true;
                continue;
            }
            if(zeroCount == 2){
                array = new int[array.length];
                return array;
            }
            product *= array[i];
        }

        if(zeroCount == 1){
            array = new int[array.length];
            array[savedZeroIndex] = product;
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = product / array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {4,0,5};
        int[] results = CalculateProducts.calculateProducts(nums);
        System.out.println(Arrays.toString(results));
    }

}

