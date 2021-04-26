package com.exercise.easy.solved;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int lucky = new LuckyInteger().findLucky(nums);
        System.out.println(lucky);
    }

    private int findLucky(int[] numbers) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            if (!frequency.containsKey(number)) {
                frequency.put(number, 1);
            }
            else {
                frequency.put(number, frequency.get(number) + 1);
            }
        }

        int luckyNumber = 0;
        for (Integer number : frequency.keySet()) {
            if (frequency.get(number).equals(number) && number > luckyNumber) {
                luckyNumber = number;
            }
        }

        if (luckyNumber > 0) return luckyNumber;
        else return -1;
    }

}