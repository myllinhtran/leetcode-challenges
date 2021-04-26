package com.exercise.easy.solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/solution/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSums(arr, 6);
        System.out.println(Arrays.toString(result));
    }

    /*
        Brute force
        Time complexity: O(n^2)
        Space complexity: O(1)
     */
    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution.");
    }


    private int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    private int[] twoSumsLeetcode(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution.");
    }
}
