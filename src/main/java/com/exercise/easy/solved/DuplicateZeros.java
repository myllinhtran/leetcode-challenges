package com.exercise.easy.solved;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 7};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void duplicateZeros(int[] arr) {
        int zeroes = 0;
        for (int i: arr) {
            if (i == 0) {
                zeroes++;
            }
        }
        int i = arr.length - 1, j = arr.length + zeroes - 1;

        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }
    }

    private static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}
