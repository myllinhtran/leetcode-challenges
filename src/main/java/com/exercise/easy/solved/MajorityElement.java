package com.exercise.easy.solved;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = new MajorityElement().majorityElement(nums);
        System.out.println(result);
    }

    private int majorityElement(int[] numbers) {
        Map<Integer, Integer> frequency = findFrequency(numbers);

        int numberFound = 0;
        int majorElements = 0;
        for (Integer number : frequency.keySet()) {
            if (frequency.get(number) > (numbers.length / 2) && frequency.get(number) > majorElements) {
                majorElements = frequency.get(number);
                numberFound = number;
            }
        }
        return numberFound;
    }


    private static Map<Integer, Integer> findFrequency(int[] numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            if (!frequency.containsKey(number)) {
                frequency.put(number, 1);
            }
            else {
                frequency.put(number, frequency.get(number) + 1);
            }
        }
        return frequency;
    }
}
