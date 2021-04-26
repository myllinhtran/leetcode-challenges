package com.exercise.easy.solved;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] runningSum(int[] nums) {
        // Create a new array of length nums.length
        int[] output = new int[nums.length];

        // Fill the first position of the array with the first element of nums[]
        output[0] = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            output[i + 1] = output[i] + nums[i + 1];
        }
        return output;
    }
}
