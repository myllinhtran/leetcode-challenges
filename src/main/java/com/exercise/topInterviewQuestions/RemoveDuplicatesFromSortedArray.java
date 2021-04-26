package com.exercise.topInterviewQuestions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4};
        int duplicatesRemoved = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.println(duplicatesRemoved);
    }

    private int removeDuplicates(int[] nums) {
        // Special case
        if (nums.length == 0) return 0;

        // Using two pointers
        // Passing the (copy of the address) reference of the array
        // "Array discipline"
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
