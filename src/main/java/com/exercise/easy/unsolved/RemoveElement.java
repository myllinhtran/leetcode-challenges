package com.exercise.easy.unsolved;

public class RemoveElement {

    public static void main(String[] args) {

        // {3, 2, 2, 3}, val = 3
        // {0, 1, 2, 2, 3, 0, 4, 2}, val = 2

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = new RemoveElement().removeElements(nums, val);
        System.out.println(result);
    }

    private int removeElements(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
