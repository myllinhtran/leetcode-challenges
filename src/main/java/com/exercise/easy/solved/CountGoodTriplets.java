package com.exercise.easy.solved;

public class CountGoodTriplets {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int result = new CountGoodTriplets().countGoodTriplets(arr, 7, 2, 3);
        System.out.println(result);
    }

    private int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a)
                        && (Math.abs(arr[j] - arr[k]) <= b)
                        && (Math.abs(arr[i] - arr[k]) <= c)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
