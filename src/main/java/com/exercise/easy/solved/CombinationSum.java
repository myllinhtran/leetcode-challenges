package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        /*
            [
                [7],
                [2,2,3]
            ]
         */
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new CombinationSum().combinationSum(candidates, target);
        System.out.println(result);
    }


    private List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> comboSum = new ArrayList<>();

        if (candidates == null || candidates.length == 0) return comboSum;

        Arrays.sort(candidates);

        List<Integer> combination = new ArrayList<>();
        toFindCombinationsToTarget(comboSum, combination, candidates, target, 0);
        return comboSum;
    }

    private void toFindCombinationsToTarget(List<List<Integer>> comboSum, List<Integer> combination, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            comboSum.add(new ArrayList<>(combination));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            combination.add(candidates[i]);
            toFindCombinationsToTarget(comboSum, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }

    }
}
