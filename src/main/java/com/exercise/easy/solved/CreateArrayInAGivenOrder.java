package com.exercise.easy.solved;

import java.util.Arrays;

public class CreateArrayInAGivenOrder {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        target[0] = nums[index[0]];
        for (int i = 1; i < index.length; i++) {
            int idx = index[i];
            if (index.length - 1 - idx >= 0)
                System.arraycopy(target, idx, target, idx + 1, index.length - 1 - idx);
            target[idx] = nums[i];
        }
        return target;
    }
}
