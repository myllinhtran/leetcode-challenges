package com.exercise.easy.solved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] array = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16}; // false
        boolean result = new UniqueNumberOfOccurrences().uniqueOccurrences(array);
        System.out.println(result);
    }

    private boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            }
            else {
                map.put(value, map.get(value) + 1);
            }
        }

        List<Integer> values = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (!values.contains(map.get(key))) {
                values.add(map.get(key));
            } else {
                return false;
            }
        }
        return true;
    }
}
