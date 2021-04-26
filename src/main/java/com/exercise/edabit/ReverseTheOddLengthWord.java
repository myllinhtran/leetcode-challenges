package com.exercise.edabit;

/*
    Given a string, reverse all the words which have odd length.
    The even length words are not changed.
 */

public class ReverseTheOddLengthWord {

    public static void main(String[] args) {
        String str = "One two three four";
        String result = new ReverseTheOddLengthWord().reversesOdd(str);
        System.out.println(result);
    }

    private String reverseOdd(String str) {
        StringBuilder newStr = new StringBuilder();
        String[] splittedStr = str.split(" ");

        for (int i = 0; i < splittedStr.length; i++) {
            int len = splittedStr[i].length();
            String word = splittedStr[i];
            if (len % 2 == 1) {
                for (int j = 0; j < len; j++) {
                    newStr.append(splittedStr[i].charAt(len - j - 1));
                }
            }
            else {
                newStr.append(word);
            }
            if (i != splittedStr.length - 1) {
                newStr.append(" ");
            }
        }
        return newStr.toString();
    }

    private String reversesOdd(String str) {
        String[] splitStr = str.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].length() % 2 == 1) {
                StringBuffer reverse = new StringBuffer(splitStr[i]).reverse();
                splitStr[i] = String.valueOf(reverse);
            }
        }
        return String.join(" ", splitStr);
    }
}
