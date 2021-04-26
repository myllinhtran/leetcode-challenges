package com.exercise.easy.solved;

import java.util.Arrays;

public class ReverseStrings {

    public static void main(String[] args) {
        // {'h', 'e', 'l', 'l', 'o'}
        // {'H', 'a', 'n', 'n', 'a', 'h'}
        char[] s = {};
        new ReverseStrings().reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private void reverseString(char[] s) {
        int mid = s.length / 2;
        for (int i = 0; i < mid; i++) {

            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
