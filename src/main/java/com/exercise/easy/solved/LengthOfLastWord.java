package com.exercise.easy.solved;

public class LengthOfLastWord {

    public static void main(String[] args) {
        // "Hello World" -- 5
        // " " -- 0
        // "a" -- 1
        // "b   a    " -- 1
        // "a " -- 1
        // " a " -- 1

        String s = " ";
        int result = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(result);
    }

    private int lengthOfLastWord(String word) {
        int length = 0;

        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) != ' ') {
                length++;
            }
            if (word.charAt(i) == ' ' && length != 0) {
                return length;
            }
        }
        return length;
    }
}
