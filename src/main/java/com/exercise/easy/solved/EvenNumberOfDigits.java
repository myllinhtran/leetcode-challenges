package com.exercise.easy.solved;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = new EvenNumberOfDigits().findNumbers(nums);
        System.out.println(result);
    }

    public int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) count++;
        }
        return count;
    }

    private int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digits++;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}
