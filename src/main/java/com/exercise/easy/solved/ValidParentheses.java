package com.exercise.easy.solved;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        // Test cases:
        // ""
        // "()" -- true
        // "()[]{}" -- true
        // "(]" -- false
        // "([)]" -- false
        // "{[]}" -- true
        // "[([]])" -- false
        // "(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){" -- false

        String s = "{[]}";
        boolean result = new ValidParentheses().isValid(s);
        System.out.println(result);
    }

    // My genius solution
    private boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        // If length of string is odd, return false
        if (s.length() % 2 == 1) return false;

        // If length of string is 0, return false
        if (s.length() == 0) return true;

        // If first character is not a key, return false
        if (!map.containsKey(s.charAt(0))) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(map.get(s.charAt(i)));
                continue;
            }
            if (s.charAt(i) == stack.peek()) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}
