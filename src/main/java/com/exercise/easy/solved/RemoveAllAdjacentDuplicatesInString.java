package com.exercise.easy.solved;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static void main(String[] args) {
        String s = "abbaca";
        String result = removeDuplicate(s);
        System.out.println(result);
    }

    private static String removeDuplicate(String s) {

        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str.delete(i, i + 2);
                i = -1;
            }
        }
        return str.toString();
    }

    private static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.empty() && S.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }

        if (stack.empty()) return "";

        StringBuilder output = new StringBuilder();
        while (!stack.empty()) {
            output.insert(0, stack.pop());
        }
        return output.toString();
    }
}
