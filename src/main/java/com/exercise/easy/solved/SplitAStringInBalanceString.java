package com.exercise.easy.solved;

import java.util.Stack;

public class SplitAStringInBalanceString {

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        int result = new SplitAStringInBalanceString().balanceStringSplit(s);
        System.out.println(result);
    }

    // 3ms speed
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty() && s.charAt(i) != stack.peek()) {
                stack.pop();
            }
            else stack.push(s.charAt(i));
            if (stack.empty()) count++;
        }
        return count;
    }

    // 1ms speed
    public int balanceStringSplit(String s) {
        int count = 0;
        int shift = 1;
        char letter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (letter != s.charAt(i)) {
                shift--;
            }
            else shift++;
            if (shift == 0) {
                count++;
            }
        }
        return count;
    }
}
