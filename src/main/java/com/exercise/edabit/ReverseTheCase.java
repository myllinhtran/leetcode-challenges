package com.exercise.edabit;

public class ReverseTheCase {

    public static void main(String[] args) {
        String str = "eXCELLENT, yOuR mAJESTY";
        String result = new ReverseTheCase().reverseCases(str);
        System.out.println(result);
    }

    private String reverseCase(String str) {
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == upper.charAt(i)) {
                    newStr.append(lower.charAt(i));
                }
                if (str.charAt(i) == lower.charAt(i)) {
                    newStr.append(upper.charAt(i));
                }
            }
            else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    private String reverseCases(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                newStr.append(str.substring(i, i + 1).toLowerCase());
            }
            else {
                newStr.append(str.substring(i, i + 1).toUpperCase());
            }
        }
        return newStr.toString();
    }
}
