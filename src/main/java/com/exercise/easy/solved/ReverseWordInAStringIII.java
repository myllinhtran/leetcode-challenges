package com.exercise.easy.solved;

public class ReverseWordInAStringIII {

    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = new ReverseWordInAStringIII().reverseWords(s);
        System.out.println(reversed);
    }

    private String reverseWords(String s) {
        String[] letters = s.split(" ");
        StringBuilder reverseWords = new StringBuilder(s.length());

        for (String letter : letters) {
            for (int i = letter.length() - 1; i >= 0; i--) {
                reverseWords.append(letter.charAt(i));
            }
            reverseWords.append(" ");
        }
        return String.valueOf(reverseWords).trim();
    }
}
