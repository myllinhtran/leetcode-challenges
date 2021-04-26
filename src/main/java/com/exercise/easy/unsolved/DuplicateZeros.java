package com.exercise.easy.unsolved;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (arr.length - 1 - i >= 0) System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                arr[i] = 0;
                i = i + 1;
            }
        }
    }
}
