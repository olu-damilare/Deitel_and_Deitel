package chapterNineteen;

public class BinarySearch {

    public int search(int[] nums, int key, int startIndex, int endIndex){

        int middle = (startIndex + endIndex) / 2;
        if(nums[middle] == key) return middle;
        if(middle == 0 || middle == nums.length - 1) return -1;
        if(nums[middle] < key){
            startIndex = middle + 1;
        }else if(nums[middle] > key){
            endIndex = middle - 1;
        }
        return search(nums, key, startIndex, endIndex);

    }
}
