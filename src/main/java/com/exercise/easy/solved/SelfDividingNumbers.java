package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> result = new SelfDividingNumbers().selfDividingNumbers(left, right);
        System.out.println(result);
    }

    private List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivideNums = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            boolean isSelfDivingNumber = false;
            int number = i;

            while (number > 0) {
                int digit = number % 10;

                // If digit is 0, false
                // Else, check if i is divisible for that digit, if not then false
                if (digit == 0 || i % digit != 0) {
                    isSelfDivingNumber = false;
                    break;
                }
                else {
                    isSelfDivingNumber = true;
                }
                number /= 10;
            }
            if (isSelfDivingNumber) selfDivideNums.add(i);
        }
        return selfDivideNums;
    }
}
