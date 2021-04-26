package com.exercise.easy.unsolved;

public class CountConsistentString {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        int consistentString = new CountConsistentString().countConsistentStrings(allowed, words);
        System.out.println(consistentString);
    }

    private int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean isConsistent = true;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allowed.contains(word.substring(i, i + 1))) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
            else isConsistent = true;
        }
        return count;
    }
}
