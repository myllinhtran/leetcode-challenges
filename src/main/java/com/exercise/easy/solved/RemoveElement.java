package com.exercise.easy.solved;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = new RemoveElement().removeElement(nums, val);
        System.out.println(result);
    }

    private int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        // Because we don't need to return the array after removing the val,
        // We only need to return the number of elements that have the same value as val.
        return i;
    }
}
