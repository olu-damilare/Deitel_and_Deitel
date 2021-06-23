package Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static int remove(int[] numbers){
        Arrays.sort(numbers);
        ArrayList<Integer> nums = new ArrayList<>();
       nums.add(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == numbers[i]) {
                    isDuplicate = true;
                    break;
                }

            }
            if(!isDuplicate) {
                nums.add(numbers[i]);
            }
        }
        nums.forEach(System.out::print);
        System.out.println();
        return nums.size();
    }

    public static void main(String[] args) {
        int[] numbers = {0,0,1,1,2,2,3,3,4,4,5,6};

        System.out.println(RemoveDuplicates.remove(numbers));
    }
}
