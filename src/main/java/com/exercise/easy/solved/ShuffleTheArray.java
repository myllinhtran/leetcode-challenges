package com.exercise.easy.solved;

import java.util.Arrays;
import java.util.Stack;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] out = shuffles(nums, 3);
        System.out.println(Arrays.toString(out));
    }

    public static int[] shuffle(int[] nums, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i - n >= 0; i--) {
            stack.push(nums[i]);
            stack.push(nums[i - n]);
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = stack.pop();
        }
        return output;
    }

    public static int[] shuffles(int[] nums, int n) {
        int[] output = new int[nums.length];
        for (int i = 0; i < n; i++) {
            output[i * 2] = nums[i];
            output[(i * 2) + 1] = nums[i + n];
        }
        return output;
    }
}
