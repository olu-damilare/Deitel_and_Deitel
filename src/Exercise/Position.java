package Exercise;

import java.util.Arrays;

public class Position {
    public static int[] getFirstAndLast(int[] nums, int val) {
        int[] newList = {-1, -1};
        if (nums == null || nums.length == 0)
            return newList;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                newList[0] = i;
                break;
            }
        }

        for (int j = nums.length - 1; j > 0; j--) {
            if (nums[j] == val) {
                newList[1] = j;
                break;

            }
        }
        return newList;
    }
}
