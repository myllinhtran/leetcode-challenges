package com.exercise.easy.solved;

public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        int maxProduct = new MaxProduct().maxProduct(nums);
        System.out.println(maxProduct);
    }

    // Naive approach
    private int maxProduct(int[] nums) {
        int maxProduct = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int max = 0;
            for (int j = i + 1; j < nums.length; j++) {
                int combo = (nums[i] - 1) * (nums[j] - 1);
                if (max < combo) {
                    max = combo;
                }
            }
            if (maxProduct < max) {
                maxProduct = max;
            }
        }
        return maxProduct;
    }
}
