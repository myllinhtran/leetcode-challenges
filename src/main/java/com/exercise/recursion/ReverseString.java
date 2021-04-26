package com.exercise.recursion;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";
        printReverse(s);
    }

    private static void printReverse(String s) {
        char[] string = s.toCharArray();
        helper(0, string);
    }

    private static void helper(int index, char[] string) {
        if (string == null || index >= string.length) {
            return;
        }
        helper(index + 1, string);
        System.out.println(string[index]);
    }
}
