package com.exercise.challenges.january;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * You are given an array of distinct integers arr and an array of integer arrays pieces,
 * where the integers in pieces are distinct. Your goal is to form arr by concatenating the
 * arrays in pieces in any order. However, you are not allowed to reorder the integers in
 * each array pieces[i].
 * <p>
 * Return true if it is possible to form the array arr from pieces. Otherwise, return false.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [85], pieces = [[85]]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [15,88], pieces = [[88],[15]]
 * Output: true
 * Explanation: Concatenate [15] then [88]
 */

public class CheckArrayFormationThroughConcatenation {

    public static void main(String[] args) {

        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{91}, {4, 64}, {78}};

        boolean output = new CheckArrayFormationThroughConcatenation().canFormArray(arr, pieces);

        System.out.println(output);
    }


    private boolean canFormArray(int[] arr, int[][] pieces) {

        StringBuilder arrStr = new StringBuilder();
        for (int num : arr) {
            arrStr.append(num);
        }
        String array = String.valueOf(arrStr);

        StringBuilder concatStr = new StringBuilder();

        for (int[] piece : pieces) {
            StringBuilder pieceStr = new StringBuilder();
            for (int num : piece) {
                pieceStr.append(num);
            }

            concatStr.append(pieceStr);
            if (!array.contains(pieceStr)) {
                return false;
            }
        }

        return concatStr.length() == arrStr.length();
    }
}
