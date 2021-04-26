package com.exercise.easy.solved;

import java.util.Arrays;
import java.util.Stack;

public class PlusOne {

    public static void main(String[] args) {
        // Test cases:
        // {1, 2, 3} -- {1, 2, 4}
        // {9} -- {1, 0}
        // {9, 9} -- {1, 0, 0}
        // {1, 9, 9} -- {2, 0, 0}
        // {1, 2, 9} -- {1, 3, 0}
        // {9,8,7,6,5,4,3,2,1,0} -- {9,8,7,6,5,4,3,2,1,1}
        // {8,8,5,0,5,1,9,7} -- {8,8,5,0,5,1,9,8};
        // {8,9,9,9} -- {9, 0, 0, 0}

        int[] digits = {1, 2, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    // My Solution: 2ms - 39.7MB
    private static int[] plusOnes(int[] digits) {
        Stack<Integer> stack = new Stack<>();

        int saved = 0;
        int digit = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digit = digits[i] + 1;
            }
            else {
                digit = digits[i] + saved;
            }
            if (digit > 9) {
                if (i == 0) {
                    stack.push(0);
                    stack.push(1);
                }
                else {
                    stack.push(0);
                    saved = 1;
                }
            }
            else {
                stack.push(digit);
                saved = 0;
            }
        }

        int[] digitPlusOne = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            digitPlusOne[i] = stack.pop();
            i++;
        }
        return digitPlusOne;
    }


    // Leetcode Solution: 0ms
    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        // In case there's only 9 in the array
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;

        return temp;
    }

}
