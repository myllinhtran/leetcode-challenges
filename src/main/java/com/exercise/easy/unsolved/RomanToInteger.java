package com.exercise.easy.unsolved;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String input = "MCMXCIV";
        int result = new RomanToInteger().romanToInt(input);
        System.out.println(result);
    }

    private int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        return sum;
    }
}
