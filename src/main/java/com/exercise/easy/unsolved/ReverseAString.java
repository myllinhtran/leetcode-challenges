package com.exercise.easy.unsolved;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "Hello";
        String reversedStr = reverses(str);
        System.out.println(reversedStr);
    }

    // Not using recursion
    private static String reverse(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    // Using recursion
    private static String reverses(String str) {

        if (str.isEmpty()) {
            return str;
        }
        return reverses(str.substring(1)) + str.charAt(0);
    }
}
