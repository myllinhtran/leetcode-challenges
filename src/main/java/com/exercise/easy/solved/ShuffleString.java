package com.exercise.easy.solved;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0,1,2};
        String result = new ShuffleString().restoreString(s, indices);
        System.out.println(result);
    }

    private String restoreString(String s, int[] indices) {
        char[] letters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[indices[i]] = s.charAt(i);
        }
        return String.valueOf(letters);
    }
}
