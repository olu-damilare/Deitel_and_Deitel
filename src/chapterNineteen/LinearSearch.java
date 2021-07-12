package chapterNineteen;

public class LinearSearch {

    public int search(int[] nums, int key, int startIndex){

        if(nums[startIndex] == key) return startIndex;
        if(startIndex + 1 == nums.length) return -1;

        return search(nums, key , startIndex + 1);

    }
}
