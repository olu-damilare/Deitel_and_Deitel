package chapterEighteen;

public class ArrayMinValue {

    public int findRecursiveMinimum(int[] nums, int n) {
        if(n == 1)
            return nums[0];

        return Math.min(nums[n - 1], findRecursiveMinimum(nums, n - 1));
    }
}
