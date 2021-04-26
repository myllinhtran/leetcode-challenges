package com.exercise.easy.solved;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 10, 11, 55, 24, 83, 14};
        int result = new SecondLargestNumber().find(arr);
        System.out.println(result);
    }

    private Integer find(Integer[] arr) {
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] > secMax) {
                secMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
