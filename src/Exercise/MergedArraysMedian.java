package Exercise;

import java.util.Arrays;

public class MergedArraysMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1 == null || nums1.length == 0) && nums2.length == 1){
                return nums2[0];
        }
        if((nums2 == null || nums2.length == 0) && nums1.length == 1){
            return nums1[0];
        }

        int[] newArray = new int[nums1.length + nums2.length];
        int newArrayIndexCounter = 0;
        int nums1Counter = 0;
        int nums2Counter = 0;

        while(nums1Counter < nums1.length && nums2Counter < nums2.length){
            if(nums1[nums1Counter] <= nums2[nums2Counter]){
                newArray[newArrayIndexCounter] = nums1[nums1Counter];
                nums1Counter++;
            }else{
                newArray[newArrayIndexCounter] = nums2[nums2Counter];
                nums2Counter++;
            }
            newArrayIndexCounter++;
        }

        System.out.println(nums1Counter);
        System.out.println(nums1.length);

        if(nums1Counter < nums1.length){
            for(int i = nums1Counter; i < nums1.length; i++){
                newArray[newArrayIndexCounter] = nums1[i];
                newArrayIndexCounter++;
            }
        }else if(nums2Counter < nums2.length){
            for(int i = nums2Counter; i < nums2.length; i++){
                newArray[newArrayIndexCounter] = nums2[i];
                newArrayIndexCounter++;
            }
        }
        System.out.println(Arrays.toString(newArray));


//        if(newArray.length == 1) return newArray[0];

        if(newArray.length % 2 == 1){
            return newArray[(newArray.length / 2) ];
        }

        double leftDigit = newArray[(newArray.length / 2) - 1];
        double rightDigit = newArray[(newArray.length / 2) ];
        return (leftDigit + rightDigit) / 2;

    }

    public static void main(String[] args) {
        MergedArraysMedian median = new MergedArraysMedian();
        int[] nums1 = {2};
        int[] nums2 = {};
        System.out.println(median.findMedianSortedArrays(nums1, nums2));
    }
}
