package com.exercise.easy.solved;


public class ReverseVowelsOfAString {

    public static void main(String[] args) {

        // "hello"
        // "leetcode"
        // "ai"

        String s = "aA";
        String output = new ReverseVowelsOfAString().reverseVowels(s);
        System.out.println(output);
    }

    /*
        Pseudo code:
        - Given an array of characters from string s
        - Given a string of vowels (lower and upper case)
        - Using two pointers, iterating over the array of characters, check if the chars on the left and right side are vowels.
        - If both are vowels, swap left and right side, increment both by one.
        - If left is a vowel and right is not increment right side, else increment left side.
        - When i > j, stop iterating.
     */

    private String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int j = letters.length - 1;

        for (int i = 0; i < letters.length; i++) {

            if (i > j) break;

            boolean left = vowels.contains(String.valueOf(letters[i]));
            boolean right = vowels.contains(String.valueOf(letters[j]));

            if (left && right) {
                char tmp = letters[i];
                letters[i] = letters[j];
                letters[j] = tmp;
                j--;
            }

            if (left && !right) {
                i--;
                j--;
            }
        }
        return String.valueOf(letters);
    }
}
