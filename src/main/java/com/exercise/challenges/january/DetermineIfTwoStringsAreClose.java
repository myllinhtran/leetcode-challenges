package com.exercise.challenges.january;

import java.util.*;

public class DetermineIfTwoStringsAreClose {

    public static void main(String[] args) {
        String word1 = "abbzzca";
        String word2 = "babzzcz";
        boolean result = new DetermineIfTwoStringsAreClose().closeStrings(word1, word2);
        System.out.println(result);

    }

    private boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            if (!freq1.containsKey(word1.charAt(i))) {
                freq1.put(word1.charAt(i), 1);
            }
            else freq1.put(word1.charAt(i), freq1.get(word1.charAt(i)) + 1);
            if (!freq2.containsKey(word2.charAt(i))) {
                freq2.put(word2.charAt(i), 1);
            }
            else freq2.put(word2.charAt(i), freq2.get(word2.charAt(i)) + 1);
        }

        if (freq1.size() != freq2.size()) return false;

        for (int value : freq1.values()) {
            if (!freq2.containsValue(value)) {
                return false;
            }
        }
        return true;
    }
}
