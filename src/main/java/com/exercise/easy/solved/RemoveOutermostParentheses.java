package com.exercise.easy.solved;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        // "(()())(())(()(()))"
        // "(()())(())"

        String string = "(()())(())(()(()))";
        String result = new RemoveOutermostParentheses().removeOuterParentheses(string);
        System.out.println(result);
    }

    private String removeOutParentheses(String S) {
        StringBuilder str = new StringBuilder(S);
        int leftBracket = 0;
        int rightBracket = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftBracket++;
            }
            if (str.charAt(i) == ')') {
                rightBracket++;
            }
            if (leftBracket == rightBracket && leftBracket != 0) {
                end = i;
                str.deleteCharAt(end);
                str.deleteCharAt(start);
                i = i - 2;
                start = i + 1;
            }
        }
        return str.toString();
    }

    private String removeOuterParentheses(String S) {
        StringBuilder str = new StringBuilder(S);
        int shift = 0;
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') shift++;
            if (str.charAt(i) == ')') shift--;
            if (shift == 0) {
                str.deleteCharAt(i);
                str.deleteCharAt(start);
                i = i - 2;
                start = i + 1;
            }
        }
        return str.toString();
    }
}
