package com.exercise.easy.solved;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] img = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] flippedImg = flipAndInvertImage(img);
        System.out.println(Arrays.toString(flippedImg));
    }

    /*
        Flip the image horizontally
        Invert the image
     */
    private static int[][] flipAndInvertImage(int[][] A) {
        int[][] flippedImg = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] == 1) {
                    flippedImg[i][A.length - j - 1] = 0;
                } else {
                    flippedImg[i][A.length - j - 1] = 1;
                }
            }
        }
        return flippedImg;
    }
}
