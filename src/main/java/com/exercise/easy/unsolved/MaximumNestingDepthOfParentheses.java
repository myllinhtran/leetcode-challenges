package com.exercise.easy.unsolved;

import java.util.Stack;

public class MaximumNestingDepthOfParentheses {

    public static void main(String[] args) {
        String s = "((8+7)*(3+9)-0)*(1*6)";
        int maxDepth = new MaximumNestingDepthOfParentheses().maxDepth(s);
        System.out.println(maxDepth);
    }

    private int maxDepth(String s) {

        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> parentheses = new Stack<>();

            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                parentheses.push(s.charAt(i));
            }
            if (parentheses.empty()
                || (parentheses.size() == 1 && parentheses.peek() == ')')
            )
                continue;

            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(' && j < i) {
                    parentheses.push(s.charAt(j));
                }
                if (s.charAt(j) == ')' && j > i) {
                    parentheses.pop();
                    counter++;
                    if (parentheses.empty() && maxDepth < counter) {
                        maxDepth = counter;
                        break;
                    }
                }
            }
        }
        return maxDepth;
    }
}
