package com.exercise.easy.solved;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    // Brute force approach
    private static int[] replaceElement(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int greatestElement = elements[i + 1];
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] > greatestElement) {
                    greatestElement = elements[j];
                }
            }
            elements[i] = greatestElement;
        }
        elements[elements.length - 1] = -1;
        return elements;
    }

    private static int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, temp);
        }
        return arr;
    }
}
