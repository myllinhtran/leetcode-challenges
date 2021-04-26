package com.exercise.easy.solved;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        int n = 4;
        int[] sum = sumZero(n);
        System.out.println(Arrays.toString(sum));
    }

    private static int[] sumZero(int number) {
        int[] sum = new int[number];
        int k = 0;

        if (number % 2 == 1) k = 1;

        for (int i = 0; i < number - k; i += 2) {
            sum[i] = i + 1;
            sum[i + 1] = -(i + 1);
        }
        return sum;
    }
}
