package com.exercise.easy.unsolved;

import java.util.Arrays;

public class DecompressedEncodedList {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int[] out = decompressRLElist(nums);
        System.out.println(Arrays.toString(out));
    }

    public static int[] decompressRLElist(int[] nums) {
        int arrayLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arrayLength += nums[i];
            }
        }

        int[] decompressList = new int[arrayLength];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i - 1; j++) {
                    decompressList[k] = nums[i];
                    k++;
                }
            }
        }
        return decompressList;
    }

}
