package com.exercise.easy.unsolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> result = new MinimumAbsoluteDifference().minimumAbsDifference(arr);
        System.out.println(result);
    }

    private List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> combo = new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return combo;
    }
}
