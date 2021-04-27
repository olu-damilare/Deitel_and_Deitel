package Exercise;


public class Position {
    public static int[] getFirstAndLast(int[] nums, int val) {
        int[] newList = {-1, -1};
        if (nums == null || nums.length == 0)
            return newList;

        int start = 0;
        int numberOfOccurrence = -1;

        for (int num : nums) {
            if (num < val)
                start++;
            if (num == val)
                numberOfOccurrence++;
        }

        newList[0] = start;
        newList[1] = start + numberOfOccurrence;

        return newList;
    }
}
