package com.exercise.easy.solved;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumberThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }
            smallers[i] = count;
        }
        return smallers;
    }

    public static int[] smallerNumberThanCurrent(int[] nums) {
        int[] table = new int[101];
        int[] res = new int[nums.length];
        for(int n : nums){
            table[n]++;
        }

        int sum = 0;
        for(int i = 0; i < 101; i++){
            sum += table[i];
            table[i] = sum;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }else{
                res[i] = table[nums[i] - 1];
            }
        }
        return res;
    }
}
